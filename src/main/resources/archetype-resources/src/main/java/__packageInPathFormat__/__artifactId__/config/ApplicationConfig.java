package ${package}.${artifactId}.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by id961900 on 09/08/2017.
 */
@Configuration
public class ApplicationConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
