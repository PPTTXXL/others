package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.CommodityDao;
import com.chinatobacco.pojo.Commodity;

public class CommodityDaoTest {
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
			CommodityDao dao = sqlSession.getMapper(CommodityDao.class);

			// List<Commodity> list = dao.selectAll();
			// for (Commodity c : list) {
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());
			// }

			// Commodity c = dao.selectOne(10002);
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());

			// List<Commodity> list = dao.selectByType(2);
			// for (Commodity c : list) {
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());
			// }

			// List<Commodity> list = dao.selectByState(1);
			// for (Commodity c : list) {
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());
			// }

			// Commodity commodity = new Commodity();
			// commodity.setComname("asd");
			// commodity.setComtypeid(2);
			// List<Commodity> list = dao.selectQuery(commodity);
			// for (Commodity c : list) {
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());
			// }

			// String s = "asd";
			// List<Commodity> list = dao.selectByName(s);
			// for (Commodity c : list) {
			// System.out.println(c.getComid() + "\t" +
			// c.getComtype().getComtypename() + "\t" + c.getComname() + "\t"
			// + c.getComstate().getStatename());
			// }

			// Commodity commodity = new Commodity();
			// commodity.setComtypeid(1);
			// commodity.setComname("让他阿萨德");
			// commodity.setPrice(12);
			// commodity.setStareid(2);
			// commodity.setInfo("色法定会");
			// int i = dao.add(commodity);
			// System.out.println(i);

			// int[] a = { 10006, 10007 };
			// int i = dao.delete(a);

			Commodity commodity = new Commodity();
			commodity.setComid(10000);
			commodity.setComtypeid(2);
			commodity.setComname("挂号");
			commodity.setInfo("斯蒂芬");
			int i = dao.update(commodity);
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
