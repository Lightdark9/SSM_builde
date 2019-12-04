import com.guang.dao.IAccountDao;
import com.guang.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/28 11:14
 * @funtion
 */
public class MybatisTest {
    @Test
    public void save() throws Exception {
        Account account = new Account();
        account.setName("闫骏驰");
        account.setMoney(20000d);

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        IAccountDao dao = sqlSession.getMapper(IAccountDao.class);

        //插入保存
        dao.save(account);
        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void selectAll() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = factory.openSession();

        IAccountDao dao = sqlSession.getMapper(IAccountDao.class);

        List<Account> accounts = dao.selectAll();
        for (Account a : accounts) {
            System.out.println(a);
        }

        sqlSession.close();
        in.close();
    }
}
