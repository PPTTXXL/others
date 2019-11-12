package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.InforamationDao;
import com.chinatobacco.dao.LocationDao;
import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.pojo.Location;

/**
 * @author Davi
 * @category 库位表测试类
 */
public class LocationDaoTest {
	@Test
	public void test() throws IOException {
		// 获取总配置文件
		String resource = "configurationTest.xml";
		// 获得当前配置文件的输入流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 通过流对象来创建一个SessionFactory对象，数据库会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过数据库会话工厂，开始数据库的一次会话
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		// 所有的数据库操作，都被分装到了Session中
		// 从session中获取到Mapper
		LocationDao locationDao = sqlSession.getMapper(LocationDao.class);

		/**
		 * select all
		 */
		/* List<Location> list = locationDao.selectAll();
		System.out.println(list.size());
		for (Location l : list) {
		  System.out.println(l.getEntid()+"\t"+l.getShelfid());
		  }*/
         
		
		/**
		 * select one
		 */
		/*Location location = locationDao.selectOne(1);
		System.out.println(location);
		System.out.println(location.getEntid());
		*/
	
		/**
		 * add
		 */
		/*List<Location> list = locationDao.selectAll();
		Location location = new Location();
		location.setEntid(1);
		location.setShelfid(3);
		locationDao.add(location);
		sqlSession.commit();
		
		list = locationDao.selectAll();
		for (Location l : list) {
			System.out.println(l.getEnt().getEntid()+"\t"+l.getShelf().getShelfid());
		}*/
        
		/**
		 * delete
		 */
		/*List<Location> list = locationDao.selectAll();
		locationDao.delete(6);
		sqlSession.commit();
		list = locationDao.selectAll();
		for (Location l : list) {
			System.out.println(l.getEnt().getEntid()+"\t"+l.getShelf().getShelfid());
		}*/
		
		/**
		 * update
		 */
		List<Location> list = locationDao.selectAll();
		Location location = new Location();
		location.setLocid(2);;
		location.setEntid(1);;
		location.setShelfid(2);;
		locationDao.update(location);
		sqlSession.commit();
		
		list = locationDao.selectAll();
		for (Location l : list) {
			System.out.println(l.getEnt().getEntid()+"\t"+l.getShelf().getShelfid());
		}
		
	}
}



