package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.CollectDao;
import com.chinatobacco.pojo.Collect;

public class CollectDaoTest {
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
			CollectDao dao = sqlSession.getMapper(CollectDao.class);
			// List<Collect> list = dao.selectAll();
			// System.out.println(list.size());
			// for (Collect collect : list) {
			// System.err.println(collect.getCollid() + "\t" +
			// collect.getCommodity().getComname());
			// }

			// List<Collect> list = dao.selectByStoreid(20000);
			// System.out.println(list.size());
			// for (Collect collect : list) {
			// System.err.println(collect.getCollid() + "\t" +
			// collect.getCommodity().getComname());
			// }

			// Collect collect1 = new Collect();
			// collect1.setComid(10001);
			// List<Collect> list = dao.selectQuery(collect1);
			// System.out.println(list.size());
			// for (Collect collect : list) {
			// System.err.println(collect.getCollid() + "\t" +
			// collect.getCommodity().getComname());
			// }

			// Collect collect = new Collect();
			// collect.setColldate(new Date());
			// collect.setComid(10001);
			// collect.setStoreid(20000);
			// int i = dao.add(collect);
			// System.out.println(i);

			// int[] a = { 1, 2, 3 };
			// int i = dao.delete(a);
			// System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
