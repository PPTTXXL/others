package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.IndentDao;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.pojo.Indent;

/**
 * @author Davi
 * @category 订单的数据访问层测试
 */
public class IndentDaoTest {
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
		IndentDao indentDao = sqlSession.getMapper(IndentDao.class);

		/**
		 * select all
		 */

		/*
		 * List<Indent> list = indentDao.selectAll();
		 * System.out.println(list.size()); for (Indent i : list) { //
		 * System.out.println(i.getStoreid());
		 * System.out.println(i.getIndentid() + "\t" + i.getStoreid() + "\t" +
		 * i.getGrossprice() + "\t" + i.getPayid() + "\t" +
		 * i.getStore().getStorename() + "\t" + i.getStore().getStoreaddr()); }
		 */

		/**
		 * selectByIndentid
		 */

		/*
		 * Indent indent = indentDao.selectByIndentid(12312);
		 * System.out.println(indent); System.out.println(indent.getIndentid());
		 */

		/**
		 * selectQuery
		 */

		/*
		 * Indent indent1 = new Indent(); List<Indent> list =
		 * indentDao.selectQuery(indent1); System.out.println(list.size()); for
		 * (Indent indent2 : list) { System.err.println(indent2.getIndentid());
		 * }
		 */

		/**
		 * add
		 */

		/*List<Indent> list = indentDao.selectAll();
		Indent indent = new Indent();
		indent.setIndentid(12345698);
		indent.setStateid(1);
		indent.setGrossprice(15630);
		indent.setStoreid(20001);
		indentDao.add(indent);
		sqlSession.commit();
		list = indentDao.selectAll();
		for (Indent i : list) {
			System.out.println(i.getIndentid() + "\t" + i.getIndentstate().getStateid());
		}*/

		/**
		 * delete
		 */

		/*
		 * List<Indent> list = indentDao.selectAll(); indentDao.delete(1);
		 * sqlSession.commit(); list = indentDao.selectAll(); for (Indent i :
		 * list) { System.out.println(i.getGrossprice()+"\t"+i.getPayid()); }
		 */

		/**
		 * update
		 */
		/*
		 * List<Indent> list = indentDao.selectAll(); Indent indent = new
		 * Indent(); indent.setIndentid(12312); indent.setStoreid(20001);
		 * indent.setGrossprice(1300); indentDao.update(indent);
		 * sqlSession.commit();
		 * 
		 * list = indentDao.selectAll(); for (Indent i : list) {
		 * System.out.println(i.getStateid() + "\t" + i.getGrossprice()); }
		 */

	}
}
