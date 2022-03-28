package ir.myShop.Spring;
import ir.myShop.Spring.context.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{

    public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
      Student student =(Student) context.getBean("Student");
        System.out.println(student.toString());


    }
}