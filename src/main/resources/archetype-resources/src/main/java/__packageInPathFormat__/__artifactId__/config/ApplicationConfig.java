package ${package}.${artifactId}.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/**
 * Created by id961900 on 09/08/2017.
 */
@Configuration
public class ApplicationConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("batchCach", CacheBuilder.newBuilder().expireAfterWrite(10, TimeUnit.MINUTES).maximumSize(5000).build().asMap(), false)));
        return cacheManager;
    }

}
