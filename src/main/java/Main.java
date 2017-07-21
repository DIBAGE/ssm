import com.linchao.dao.UserDao;
import com.linchao.po.User;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
public class Main {
    @Autowired
    private User user;

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Main m = new Main();
        m.user = (User) context.getBean("user");
        m.user.setId(11);
        m.user.getName();
        System.out.println(m.user.getId());
    }
}
