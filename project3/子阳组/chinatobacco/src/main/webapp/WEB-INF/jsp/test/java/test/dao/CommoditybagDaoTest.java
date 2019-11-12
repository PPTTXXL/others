package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.CommoditybagDao;
import com.chinatobacco.pojo.Commoditybag;

public class CommoditybagDaoTest {
	@Test
	public void test() {
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
			CommoditybagDao dao = sqlSession.getMapper(CommoditybagDao.class);

			// List<Commoditybag> list = dao.selectByIndet(12312);
			// for (Commoditybag c : list) {
			// System.out.println(c.getBagid() + "\t" +
			// c.getCommodity().getComname() + "\t" + c.getIndentid());
			// }

			// Commoditybag commoditybag = new Commoditybag();
			// commoditybag.setComid(10000);
			// commoditybag.setIndentid(12312);
			// commoditybag.setSpnum(1231);
			// int i = dao.add(commoditybag);
			// System.out.println(i);

			// int i = dao.delete(12312);
			// System.out.println(i);

			// Commoditybag commoditybag = new Commoditybag();
			// commoditybag.setBagid(100002);
			// commoditybag.setComid(10001);
			// dao.update(commoditybag);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
