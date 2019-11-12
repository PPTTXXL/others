package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.UserDao;
import com.chinatobacco.pojo.User;
/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class UserDaoTest {

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
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			/**
			 * select all
			 */
			/*List<User> list1 = userDao.selectAll();
			System.out.println(list1.size());
			for (User u : list1) {
				System.out.println(u.getUid()+u.getRoleid()+u.getUname()+u.getPassword()+u.getUsex()+u.getUaddr());
			}*/
			/**
			 * selectByRole
			 */
			/*List<User> list2 = userDao.selectByRole(1);
			for (User u : list2) {
				System.out.println(u.getUname()+u.getRoleid());
			}*/
			/**
			 * selectByName
			 */
			
			/*List<User> list3 = userDao.selectByName("admin");
			for (User u : list3) {
				System.out.println(u.getUsex()+u.getPassword());
			}*/
			/**
			 * selectQuery
			 */
			/*User user=new User();
			user.setRoleid(1);
			user.setUname("dm");
			List<User> list4 = userDao.selectQuery(user);
			for (User u : list4) {
				System.out.println(u.getUid()+u.getRoleid());
			}*/
			/**
			 * selectById
			 */
			
			/*User user=userDao.selectById(500001);
			System.out.println(user.getUid()+"--------"+user.getRole().getRoleid());*/
			/**
			 * selectByPass
			 */
			
//			User user = userDao.selectByPass(500001, "12121");
//				System.out.println(user.getUname()+user.getRole().getRoleid());
			/**
			 * add
			 */
//			List<User> list4 = userDao.selectAll();
//			User user1 = new User();
//			user1.setPassword("120120");
//			user1.setUname("娜美");
//			user1.setRoleid(2);
//			user1.setUsex("女");
//			user1.setUaddr("北京");
//			userDao.add(user1);
//			sqlSession.commit();
//			list4 = userDao.selectAll();
//			for (User u  : list4) {
//				System.out.println(u.getPassword()+u.getUname());
//			}
			
			/**
			 * delete
			 */
//			List<User> list5 = userDao.selectAll();
//			userDao.delete(500005);
//			list5 = userDao.selectAll();
//			for (User u : list5) {
//				System.out.println(u.getUname());
//			}
//			
			/**
			 * update
			 */
			
			List<User> list6 = userDao.selectAll();
			User user2 = new User();
			user2.setUid(500006);
			user2.setPassword("6662");
			user2.setUname("罗宾");
			user2.setUaddr("西安");
			userDao.update(user2);
			
			list6 = userDao.selectAll();
			for (User u : list6) {
				System.out.println(u.getUname());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
