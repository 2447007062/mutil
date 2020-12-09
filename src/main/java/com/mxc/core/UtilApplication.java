package com.mxc.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UtilApplication {
    private static final Logger logger = LoggerFactory.getLogger(UtilApplication.class);

    public static void print(Environment env){
        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            String serverPort = env.getProperty("server.port");
            logger.info("swagger:     http://{}:{}/v2/api-docs",hostAddress,serverPort);
            logger.info("swagger:     http://{}:{}/swagger-ui.html",hostAddress,serverPort);
        } catch (UnknownHostException e) {
            logger.warn("The host name could not be determined, using `localhost` as fallback");
        }
    }
}
