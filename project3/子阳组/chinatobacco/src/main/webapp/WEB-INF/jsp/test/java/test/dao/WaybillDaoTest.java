package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.WaybillDao;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.pojo.County;
import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.pojo.Waybill;

public class WaybillDaoTest {
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
			WaybillDao waybillDao = sqlSession.getMapper(WaybillDao.class);
			
			/**
			 * select all
			 */
			 /*List<Waybill> list = waybillDao.selectAll();
			 System.out.println(list.size()); for (Waybill w : list) {
			 System.out.println(w.getIndent().getIndentid()+"\t"+w.getWayaddr()); }*/
			 

			/**
			 * selectByStore
			 */
			/*List<Waybill> list = waybillDao.selectByStore(20000);
			System.out.println(list.size());
			for (Waybill waybill : list){
				System.out.println(waybill.getWayaddr());
			}*/
			
			
			/**
			 * selectByIndent
			 */
			/*Waybill waybill = waybillDao.selectByIndent(12312);
			System.out.println(waybill);
			System.out.println(waybill.getWayaddr());*/
			
			/**
			 * add
			 */
			
			 /* List<Waybill> list = waybillDao.selectAll(); 
			  Waybill waybill = new Waybill();
			  waybill.setStoreid(20000);
			  waybill.setIndentid(12312);
			  waybill.setWayaddr("测试数据3");
			  waybillDao.add(waybill);
			  sqlSession.commit();
			  list = waybillDao.selectAll(); for (Waybill w : list) {
			  System.out.println(w.getIndent().getIndentid()+"\t"+w.getWayaddr()); }*/
			 

			/**
			 * delete
			 */
			/*List<Waybill> list = waybillDao.selectAll();
			waybillDao.delete(310000012);
			sqlSession.commit();
			list = waybillDao.selectAll();
			for (Waybill w : list) {
				System.out.println(w.getIndent().getIndentid()+"\t"+w.getWayaddr());
			}*/

			/**
			 * update
			 */

			List<Waybill> list = waybillDao.selectAll();
			Waybill waybill = new Waybill();
			waybill.setWayid(310000004);
			waybill.setWayaddr("测试数据55");;
			waybillDao.update(waybill);
			sqlSession.commit();
			list = waybillDao.selectAll();
			for (Waybill w : list) {
				System.out.println(w.getIndent().getIndentid()+"\t"+w.getWayaddr());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
