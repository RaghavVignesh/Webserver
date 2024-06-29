package com.example.webserver.webapplication;

import java.io.IOException;
import java.net.*;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RequestServer {
    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws Exception {

        try {
            ServerSocket mySocket = new ServerSocket(80);
            logger.info("Starting server on Port 80");
            logger.info("Waiting for a client");

            Socket socket = mySocket.accept();
            if (logger.isEnabled(Level.INFO)) {
                logger.info("Client accepted through port number " + socket.getLocalPort());
            }
        } catch ( IOException e) {
            logger.log(Level.WARN, "Server exception: ", e);
        }
    }
}
