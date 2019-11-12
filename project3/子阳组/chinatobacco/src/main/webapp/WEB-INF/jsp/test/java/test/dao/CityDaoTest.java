package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.CityDao;
import com.chinatobacco.pojo.City;

public class CityDaoTest {
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
			CityDao dao = sqlSession.getMapper(CityDao.class);
			// 所有的数据库操作都被封装到了数据库当中：增删改查

			List<City> list = dao.selectAll("130000");
			for (City city : list) {
				System.err.println(city.getCityID() + "\t" + city.getCity());
			}

			City city = dao.selectOne("130700");
			System.err.println(city.getCityID() + "\t" + city.getCity());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
