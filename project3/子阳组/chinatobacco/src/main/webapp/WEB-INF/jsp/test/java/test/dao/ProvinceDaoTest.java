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

import com.chinatobacco.dao.ProvinceDao;
import com.chinatobacco.pojo.Province;

/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class ProvinceDaoTest {

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
			ProvinceDao provinceDao = sqlSession.getMapper(ProvinceDao.class);

			List<Province> list = provinceDao.findAll();
			System.out.println(list.size());
			for (Province province : list) {
				System.out.println(province.getProvince());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
