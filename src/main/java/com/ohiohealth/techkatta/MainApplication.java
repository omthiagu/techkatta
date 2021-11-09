package com.ohiohealth.techkatta;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jetty.server.Server;


public class MainApplication {

	private static Logger logger = Logger.getLogger(MainApplication.class.getName());

	public static void main(String args[]) {
		Server server = new Server(8080);

        try {
        	// Starting the Server
            server.start();
            logger.log(Level.INFO, "Server Started!");
            server.join();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        } finally {
            server.destroy();
        }
	}
}
