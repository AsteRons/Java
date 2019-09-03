package asterons.springframework.didemo;

import asterons.springframework.didemo.controllers.ConstructorInjectedController;
import asterons.springframework.didemo.controllers.GetterInjectedController;
import asterons.springframework.didemo.controllers.MyController;
import asterons.springframework.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();


       System.out.print((ctx.getBean(PropertyInjectedController.class).sayHello()));
       System.out.print((ctx.getBean(ConstructorInjectedController.class).sayHello()));
       System.out.print((ctx.getBean(GetterInjectedController.class).sayHello()));
    }

}
