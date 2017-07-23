package me.destinyshine.springcloudshowcase.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @author destinyliu
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinStreamServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZipkinStreamServerApplication.class, args);
    }

}