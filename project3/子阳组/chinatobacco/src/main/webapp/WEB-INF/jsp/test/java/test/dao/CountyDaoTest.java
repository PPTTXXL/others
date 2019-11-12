package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.ComtypeDao;
import com.chinatobacco.dao.CountyDao;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.pojo.County;

/**
 * @author Davi
 * @category 区县的数据访问层测试类
 */
public class CountyDaoTest {

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
			CountyDao countyDao = sqlSession.getMapper(CountyDao.class);

			/**
			 * findAreasByCid
			 */
			// List<County> list = countyDao.findAreasByCid("130200");
			// System.out.println(list.size());
			// for (County county : list) {
			// System.out.println(county.getAreas() + county.getAreaID());
			// }

			County county = countyDao.findObject("130223");
			System.out.println(county.getAreas() + county.getAreaID());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
