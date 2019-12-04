import com.guang.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/26 20:02
 * @funtion
 */
public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        IAccountService ac = (IAccountService) applicationContext.getBean("accountService");

        ac.selectAll();
    }
}
