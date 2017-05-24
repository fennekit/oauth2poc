package eu.europeana.oauth.test.client;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Very simple test client application that connects to our oauth2 server using Spring-Boot
 * Start this application and go to http://localhost:8082
 * To avoid auto-login from previously stored cookies it's recommended to do this in a private tab in your browser.
 *
 * Created by Patrick Ehlert on 5-4-17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class SimpleTestClient {

    /**
     * Application main entry point, loads config from simpleTestClient.yml
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(SimpleTestClient.class).properties("spring.config.name=simpleTestClient").run(args);
    }
}
