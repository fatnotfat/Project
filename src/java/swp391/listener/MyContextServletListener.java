 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.listener;


import java.io.IOException;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import swp391.utils.DBHelper;

/**
 * Web application lifecycle listener.
 *
 * @author Chau Nhat Truong
 */
public class MyContextServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Deploying................");
        ServletContext context = sce.getServletContext();
        String siteMapsFile = context.getInitParameter("SITE_MAP_FILE_PATH");
        try {
            Properties siteMaps = DBHelper.getSiteMaps(siteMapsFile, context);
            if (siteMaps != null) {
                context.setAttribute("SITE_MAP", siteMaps);
            }
        } catch (IOException ex) {
            context.log("My Context Listener _ IO" + ex.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Bye Bye RIP");
    }
}
