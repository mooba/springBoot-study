package site.pengcheng.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @author pengchengbai
 * @description
 * @date 2019-12-29 16:35
 */
@Slf4j
@Component
public class ScheduledTask {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Async("taskExecutor")
    @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() {
        log.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()) );
        try {
            log.info("task start");
            TimeUnit.SECONDS.sleep(3);
            log.info("task end");
        } catch (Exception e) {
        }
    }

//
//    @Scheduled(fixedDelay = 2000)
//    public void scheduleTaskWithFixedDelay() {
//        log.info("Fixed Delay Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException ex) {
//            log.error("Ran into an error {}", ex);
//            throw new IllegalStateException(ex);
//        }
//    }
//
//
//    @Scheduled(fixedRate = 2000, initialDelay = 10000)
//    public void scheduleTaskWithInitialDelay() {
//        log.info("Fixed Rate Task with Initial Delay :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//    }
//
//
//    @Scheduled(cron = "0 0 9 * * ?")
//    public void scheduleTaskWithCronExpression() {
//        log.info("sending statistic message with scheduled task");
//    }



}
