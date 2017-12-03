package ${package}.${artifactId}.processors;
import org.springframework.batch.item.ItemProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dummy {@link ItemProcessor} which only logs data it receives.
 */
public class LogItemProcessor implements ItemProcessor<String,String> {

    private static final Logger log = LoggerFactory.getLogger(LogItemProcessor.class);

    public String process(String item) throws Exception {
        log.info(item);
        return item;
    }

}
