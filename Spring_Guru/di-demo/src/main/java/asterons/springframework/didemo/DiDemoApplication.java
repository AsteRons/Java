package asterons.springframework.didemo;

import asterons.springframework.didemo.controllers.ConstructorInjectedController;
import asterons.springframework.didemo.controllers.GetterInjectedController;
import asterons.springframework.didemo.controllers.MyController;
import asterons.springframework.didemo.controllers.PropertyInjectedController;
import asterons.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }
}