package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.StoreDao;
import com.chinatobacco.pojo.Store;

/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class StoreDaoTest {

	@Test
	public void test1() {
		try {
			// 获得当前Mybatis的配置总文件，路径
			String resource = "spring/spring.xml";
			// 得到当前配置文件的输入流
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 通过输入流，获得SessionFatory工厂对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂，开启数据库的一次会话
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			// 所有的数据库操作都被封装到了数据库当中：增删改查
			StoreDao storeDao = sqlSession.getMapper(StoreDao.class);
			/**
			 * select all
			 */
			// List<Store> list = storeDao.selectAll();
			// System.out.println(list.size());
			// for (Store store : list) {
			// System.out.println(store.getStorename()+store.getLvid()+store.getStoreaddr());
			// }
			/**
			 * select one
			 */
			// Store store = storeDao.selectOne(20001);
			// System.out.println(store);
			// System.out.println(store.getStoreaddr());
			/**
			 * selectByLv
			 */

			/*
			 * List<Store> list1 = storeDao.selectAll(); for (Store s : list1) {
			 * System.out.println(s.getStorelevel().getLvid()); }
			 */
			/**
			 * selectByName
			 */

			/*
			 * List<Store> list2 = storeDao.selectAll(); for (Store s : list2) {
			 * System.out.println(s.getStorename()); }
			 */
			/**
			 * add
			 */
			/*
			 * List<Store> list3 = storeDao.selectAll(); Store store = new
			 * Store(); store.setLvid(2); store.setPassword("6666");
			 * store.setStoreaddr("西安"); store.setStorename("安德鲁");
			 * storeDao.add(store); sqlSession.commit(); list3 =
			 * storeDao.selectAll(); for (Store s : list3) {
			 * System.out.println(s.getLvid()+s.getStorename()+s.getPassword()+s
			 * .getStoreaddr()); }
			 */

			/**
			 * delete
			 */
			/*
			 * List<Store> list4 = storeDao.selectAll(); storeDao.delete(20006);
			 * list4 = storeDao.selectAll(); for (Store s : list4) {
			 * System.out.println(s.getStorename()); }
			 */

			/**
			 * update
			 */

			/* List<Store> list5 = storeDao.selectAll(); */
			Store store = new Store();
			store.setLvid(2);
			store.setPassword("11111");
			store.setStorename("安德烈");
			store.setStoreaddr("北京");
			store.setStoreid(20007);
			
			storeDao.update(store);
			System.out.println(store.getStorename());

			/*
			 * list5 = storeDao.selectAll(); for (Store s : list5) {
			 * System.out.println(s.getLvid() + s.getPassword() +
			 * s.getStoreaddr() + s.getStorename()); }
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
