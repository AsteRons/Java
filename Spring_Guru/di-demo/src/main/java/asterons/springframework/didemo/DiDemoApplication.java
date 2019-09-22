package asterons.springframework.didemo;

import asterons.springframework.didemo.controllers.ConstructorInjectedController;
import asterons.springframework.didemo.controllers.GetterInjectedController;
import asterons.springframework.didemo.controllers.MyController;
import asterons.springframework.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"asterons.springframework.didemo.services","asterons.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

       System.out.println(controller.hello());
       System.out.println((ctx.getBean(PropertyInjectedController.class).sayHello()));
       System.out.println((ctx.getBean(ConstructorInjectedController.class).sayHello()));
       System.out.println((ctx.getBean(GetterInjectedController.class).sayHello()));
    }

}
