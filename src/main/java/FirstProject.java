import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import production.Tool;
import production.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstProject {
    public static void main(String[] args) {

        String[] beans = new String[]{"tools.xml", "worker.xml"};
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        Worker testWorker = xmlApplicationContext.getBean(Worker.class);
        System.out.println("\n\n" + testWorker + "\n\n");

        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext();

        List<Tool> tools = xmlApplicationContext.getBean("tools", ArrayList.class);
        System.out.println("This is the set of tools created by Spring IoC Container from xml:\n " + Arrays.toString(tools.toArray()));

        Worker worker1 = xmlApplicationContext.getBean(Worker.class);
        System.out.println("This is a worker created by Spring IoC Container from xml: \n" + worker1);

        Worker worker2 = xmlApplicationContext.getBean(Worker.class);
        System.out.println("This is a worker created by Spring IoC container from xml: \n" + worker2);

//        Worker hardWorker = annotationApplicationContext.getBean(Worker.class);


    }
}