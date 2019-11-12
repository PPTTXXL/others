package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.StorelevelDao;
import com.chinatobacco.pojo.Storelevel;
/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class StorelevelDaoTest {


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
			StorelevelDao storelevelDao = sqlSession.getMapper(StorelevelDao.class);
			/**
			 * select all
			 */
			/*List<Storelevel> list1 = storelevelDao.selectAll();
			System.out.println(list1.size());
			for (Storelevel st : list1) {
				System.out.println(st.getLvid()+st.getLvname());
			}*/
			/**
			 * select one
			 */
			/*Storelevel storelevel = storelevelDao.selectOne(1);
			System.out.println(storelevel);
			System.out.println(storelevel.getLvname());*/
			/**
			 * add
			 */
			/*List<Storelevel> list2 = storelevelDao.selectAll();
			Storelevel storelevel1 = new Storelevel();
			storelevel1.setLvname("硬又黑");
			storelevelDao.add(storelevel1);
			sqlSession.commit();
			list2 = storelevelDao.selectAll();
			for (Storelevel st  : list2) {
				System.out.println(st.getLvid()+st.getLvname());
			}*/
			
			/**
			 * delete
			 */
			/*List<Storelevel> list3 = storelevelDao.selectAll();
			storelevelDao.delete(5);
			sqlSession.commit();
			list3 = storelevelDao.selectAll();
			for (Storelevel st : list3) {
				System.out.println(st.getLvid()+st.getLvname());
			}*/
			
			/**
			 * update
			 */
			
			List<Storelevel> list = storelevelDao.selectAll();
			Storelevel storelevel2 = new Storelevel();
			storelevel2.setLvid(3);
			storelevel2.setLvname("大型");
			storelevelDao.update(storelevel2);
			sqlSession.commit();
			
			list = storelevelDao.selectAll();
			for (Storelevel st : list) {
				System.out.println(st.getLvid()+st.getLvname());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
