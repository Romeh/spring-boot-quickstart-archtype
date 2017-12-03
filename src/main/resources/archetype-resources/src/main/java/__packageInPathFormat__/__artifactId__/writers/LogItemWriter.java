package ${package}.${artifactId}.writers;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;


/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
public class LogItemWriter implements ItemWriter<Object> {

    private static final Logger log = LoggerFactory.getLogger(LogItemWriter.class);

    public void write(List<? extends Object> data) throws Exception {
        log.info("{}",data);
    }

}
