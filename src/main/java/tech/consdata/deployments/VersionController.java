package tech.consdata.deployments;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
@RequiredArgsConstructor
class VersionController {


    @GetMapping("/")
    String version() {
        String message = "v1.0 - " + System.getenv("HOSTNAME");
        taskExecutor.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted");
            }
        });

        log.info(message);
        return message;
    }

    private final TaskExecutor taskExecutor;
}
