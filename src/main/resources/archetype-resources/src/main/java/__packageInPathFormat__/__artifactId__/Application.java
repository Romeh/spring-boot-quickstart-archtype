package ${package}.${artifactId};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableRetry
@EnableCaching
public class Application {

    public static void main(String[] args) {
        final SpringApplication springApplication =
            new SpringApplication(Application.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

}
