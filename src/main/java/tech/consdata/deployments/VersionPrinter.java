package tech.consdata.deployments;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class VersionPrinter {


    public static void main(String[] args) {
        SpringApplication.run(VersionPrinter.class, args);
    }

    @GetMapping("/")
    String version() {
        String message = version + " " + System.getenv("HOSTNAME");
        log.info(message);
        return message;
    }


    @Value("${spring.application.version}")
    private String version;

}
