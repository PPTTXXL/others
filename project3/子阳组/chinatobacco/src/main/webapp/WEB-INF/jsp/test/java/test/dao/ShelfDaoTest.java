package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.ShelfDao;
import com.chinatobacco.pojo.Shelf;
/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class ShelfDaoTest {

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
			ShelfDao shelfDao = sqlSession.getMapper(ShelfDao.class);
			/**
			 * select all
			 */
			/*List<Shelf> list = shelfDao.selectAll();
			System.out.println(list.size());
			for (Shelf shelf : list) {
				System.out.println(shelf.getShelfid());
			}*/
			/**
			 * select one
			 */
			/*Shelf shelf = shelfDao.selectOne(1);
			System.out.println(shelf);
			System.out.println(shelf.getShelfname());*/
			/**
			 * add
			 */
			/*List<Shelf> list = shelfDao.selectAll();
			Shelf shelf = new Shelf(4,"西一排");
			shelfDao.add(shelf);
			sqlSession.commit();
			list = shelfDao.selectAll();
			for (Shelf s  : list) {
				System.out.println(s.getShelfid()+s.getShelfname());
			}*/
			
			/**
			 * delete
			 */
			List<Shelf> list = shelfDao.selectAll();
			shelfDao.delete(4);
			sqlSession.commit();
			list = shelfDao.selectAll();
			for (Shelf s : list) {
				System.out.println(s.getShelfid()+s.getShelfname());
			}
			
			/**
			 * update
			 */
			
			/*List<Shelf> list = shelfDao.selectAll();
			Shelf shelf = new Shelf(3,"南三排");
			shelfDao.update(shelf);
			sqlSession.commit();
			
			list = shelfDao.selectAll();
			for (Shelf s : list) {
				System.out.println(s.getShelfid()+s.getShelfname());
			}*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
