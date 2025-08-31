package be.wouterbiront.taskmanager.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "be.wouterbiront.taskmanager.controller",
        "be.wouterbiront.taskmanager.domain",
        "be.wouterbiront.taskmanager.persistence"
})
public class TaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

}
