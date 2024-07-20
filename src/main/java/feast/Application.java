package feast;

import feast.config.AppConfig;
import feast.models.Camel8;
import feast.models.Horse7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

@ComponentScan(basePackages = "feast")
public class Application {
    public static void main(String[] args) {

        //load xml bean configure
        GenericXmlApplicationContext xmlContext = new GenericXmlApplicationContext("classpath:bean.xml");

        //load annotation configure
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.setParent(xmlContext); //combine by set xml as annotation parent
        applicationContext.register(AppConfig.class);// add java configuration class file
        applicationContext.refresh();//refresh contexts

        TraditionalFeast traditionalFeast =
                applicationContext.getBean(TraditionalFeast.class);
        System.out.println(traditionalFeast.getTraditionalFeast());
    }
}
