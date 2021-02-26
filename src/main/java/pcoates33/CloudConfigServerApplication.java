package pcoates33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigServerApplication.class, args);
  }
}
