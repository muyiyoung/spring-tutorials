package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang
 */
@SpringBootApplication
@RestController
public class Application {


    @RequestMapping("/")
    public String home() {
        return "Hello, spring-boot-docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
