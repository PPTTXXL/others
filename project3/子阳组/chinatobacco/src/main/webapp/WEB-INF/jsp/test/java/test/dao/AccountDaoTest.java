package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.AccountDao;
import com.chinatobacco.pojo.Account;

/**
 * @author King.zy
 * @category 省数据访问层测试类
 * 
 */
public class AccountDaoTest {

	@Test
	public void test1() {
		try {
			// 获得当前Mybatis的配置总文件，路径
			String resource = "configurationTest.xml";
			// 得到当前配置文件的输入流
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 通过输入流，获得SessionFatory工厂对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂，开启数据库的一次会话
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			// 所有的数据库操作都被封装到了数据库当中：增删改查
			AccountDao dao = sqlSession.getMapper(AccountDao.class);

			/* 查询所有用户 */

			/*
			 * List<Account> list = dao.selectAll();
			 * System.out.println(list.size()); for (Account account : list) {
			 * System.err.println(account.getBalance()); }
			 */

			/* 根据ID查询用户 */

			/*
			 * Account account = dao.selectOne(12345678);
			 * System.err.println(account.getBalance());
			 */

			/* 添加用户 */

			/*
			 * Account account2 = new Account(1222345, 123); dao.add(account2);
			 * 
			 * List<Account> list2 = dao.selectAll();
			 * System.out.println(list2.size()); for (Account account3 : list2)
			 * { System.err.println(account3.getBalance()); }
			 */

			/* 删除一个用户 */

			/*
			 * dao.delete(1222345);
			 * 
			 * List<Account> list = dao.selectAll();
			 * System.out.println(list.size()); for (Account account1 : list) {
			 * System.err.println(account1.getAccid() + "\t" +
			 * account1.getBalance()); }
			 */

			/*
			 * Account account = new Account(1222345, 1000); int i =
			 * dao.update(account); System.err.println(i);
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
