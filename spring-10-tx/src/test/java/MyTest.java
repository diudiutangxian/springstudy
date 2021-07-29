import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        User user = new User(16,"aadfdd","22");
        userMapper.addUser(user);
        userMapper.deleteUser(10);
        List<User> userList = userMapper.selectUser();
        for (User user1 : userList) {
            System.out.println(user1);
        }
    }


}
