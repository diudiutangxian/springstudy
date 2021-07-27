import com.kuang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
            Student student = (Student) applicationContext.getBean("student");
//            System.out.println(student);
            student.show();
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getCause());
        }

    }
}
