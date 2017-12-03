package ${package}.${artifactId}.service;

import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;
import com.bics.starters.alerts.AlertsSender;
import org.springframework.beans.factory.annotation.Autowired;
import com.bics.starters.alerts.domain.AlertResponse;
/**
 * Created by id961900 on 09/08/2017.
 */
@Service
public class ExternalServiceWithSpringRetryAndCircuitBreaker {
    private static final Logger log = LoggerFactory.getLogger(ExternalServiceWithSpringRetryAndCircuitBreaker.class);
    @Autowired
    private AlertsSender alertsSender;

    /* exmaple of circuit breaker with spring retry which will retry to call the server 2 times in case of error
     and for example exclude Timeout exception from retry conditions and go to recover directly
    */
    @CircuitBreaker(maxAttempts = 2, openTimeout = 5000l, resetTimeout = 10000l, exclude = TimeoutException.class)
    public AlertResponse sendEmail() {
        // add your external service call here so it can be protected by Spring rety and CircuitBreaker logic
        /**
         * Commented Code snippet below demo how you can send an alter which will use the default settings
         * into alert manager ITT for non configured alert service code and error code
         * **/
         /* Map<String,String> map=new HashMap<>();
            map.put("testErrorCode","testErrorDescription");
            //call the alerts service via the alert sender proxy client
            AlertResponse alertResponse= alertsSender.postAlert("TEST_1000","1000",map,"NORMAL");*/

        return AlertResponse.builder().errorMessage("Success").done(true).build();
    }

    /**
     * The recover method needs to have same return type and parameters which will be called in case the circuit is closed or retrials are over
     * so this the fallback logic
     *
     * @return
     */
    @Recover
    private AlertResponse fallbackForCall() {
        log.error("Fallback for external service call invoked, the external service is NOT reachable");
        return AlertResponse.builder().errorMessage("FallBack error message").done(false).build();
    }


}
