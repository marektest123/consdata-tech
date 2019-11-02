package tech.consdata.deployments;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class VersionPrinter {


    public static void main(String[] args) {
        SpringApplication.run(VersionPrinter.class, args);
    }

//    @Bean
//    public TaskExecutor taskExecutor() {
//        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//        taskExecutor.setCorePoolSize(2);
//        taskExecutor.setMaxPoolSize(2);
//        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
//        taskExecutor.initialize();
//        return taskExecutor;
//    }

}
