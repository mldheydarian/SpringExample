package ir.myShop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ir.myShop.Spring.context.ContextConfig;
import ir.myShop.Spring.context.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    ApplicationContext context;
    @Before
    public void init(){

      // context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    context=new AnnotationConfigApplicationContext(ContextConfig.class);


    }

    @Test
    public void toCheckSingeltoneInitStudent(){


        Student student =(Student) context.getBean("student");
        Student student2 =(Student) context.getBean("student");
        System.out.println(student.toString());
        Assert.assertTrue(student==student2);
    }
    @Test
    public void sumTestInStudent()
    {
    Student st=new Student();
    int actual=st.sum(5,6);
    assertEquals(actual,8);


    }
     @Test
     public void studentMustHaveBookWhenInitialaize(){
     Student studentActula=(Student) context.getBean(Student.class);
     Assert.assertNotEquals(null,studentActula.getBook());

}


}
