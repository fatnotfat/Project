package swp391.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

public class DBHelper implements Serializable{

    public static Connection makeConnection()
            throws NamingException, SQLException {

        //Get Context Server - JNDI (Java Naming Directory Interface)
        Context serverContext = new InitialContext();
        //Look up DS of Container
        Context tomcatContext = (Context) serverContext.lookup("java:comp/env");
        //Look up Defined DS
        DataSource ds = (DataSource) tomcatContext.lookup("SWP391");
        //Open Connection
        Connection con = ds.getConnection();
        return con;
    }

    public static Properties getSiteMaps(String filePath, ServletContext context)
            throws IOException {
        if (filePath == null) {
            return null;
        }
        if (filePath.trim().isEmpty()) {
            return null;
        }
        Properties result = new Properties();
        InputStream is = null;
        try {
            is = context.getResourceAsStream(filePath);
            result.load(is);
            return result;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
    
    
    public static String getUrl(ServletContext context, String key) {
        //get attribute from context scope
        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
        if (key == null) {
            return siteMaps.getProperty("");
        }
        return siteMaps.getProperty(key);
    }
}