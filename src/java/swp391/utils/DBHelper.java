package swp391.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

public class DBHelper {

    public static Connection makeConnection()
            throws /*ClassNotFoundException*/ NamingException, SQLException {

        //1. Get Context Server - JNDI (Java Naming Directory Interface)
        Context serverContext = new InitialContext();
        //2. Look up DS of Container
        Context tomcatContext = (Context) serverContext.lookup("java:comp/env");
        //3. Look up Defined DS
        DataSource ds = (DataSource) tomcatContext.lookup("SWP391");
        //4. Open Connection
        Connection con = ds.getConnection();
        return con;

//        //1. Load Driver
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//        //2. Create URL Connection String
//        //Syntax: protocol:servername://ip:port;databaseName=UB[;instanceName=Instance]
//         String url = "jdbc:sqlserver://localhost:1433;"
//                 + "databaseName=SE1603;instanceName=SQLEXPRESS";
//        
//        //3. Open Connection
//        Connection con = DriverManager.getConnection(url, "sa", "12345");
//        
//        return con;
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
}