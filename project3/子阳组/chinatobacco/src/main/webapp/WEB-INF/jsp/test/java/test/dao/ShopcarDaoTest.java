package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.ShopcarDao;
import com.chinatobacco.pojo.Shopcar;
/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class ShopcarDaoTest {

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
			ShopcarDao shopcarDao = sqlSession.getMapper(ShopcarDao.class);
			/**
			 * select all
			 */
			List<Shopcar> list = shopcarDao.selectAll(20000);
			System.out.println(list.size());
			for (Shopcar shopcar : list) {
				System.out.println(shopcar.getCarid());
			}
			
			/**
			 * add
			 */
			/*//List<Shopcar> list = shopcarDao.selectAll(20000);
			Shopcar shopcar = new Shopcar();
			shopcar.setComid(10000);
			shopcar.setStoreid(20000);
			int i=shopcarDao.add(shopcar);
			System.out.println(i);
			list = shopcarDao.selectAll(20000);
			for (Shopcar s  : list) {
				System.out.println(s.getCarid()+s.getComid());
			}*/
			
			/**
			 * delete
			 */
			/*int [] carid={100001,100002};
			int i=shopcarDao.delete(carid);
			System.out.println(i);*/
			/*list = shopcarDao.selectAll();
			for (Shopcar s : list) {
				System.out.println();
			}*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
