package springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.didemo.Controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctc =SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctc.getBean("myController");
        controller.hello();

    }

}
