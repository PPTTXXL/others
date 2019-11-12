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
import com.chinatobacco.dao.InforamationDao;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.pojo.Indent;
import com.chinatobacco.pojo.Inforamation;

/**
 * @author Davi
 * @category 信息数据接口测试类
 */
public class InforamationDaoTest {
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
		InforamationDao inforamationDao = sqlSession.getMapper(InforamationDao.class);

		/**
		 * select all
		 */
		/*
		 * List<Inforamation> list = inforamationDao.selectAll();
		 * System.out.println(list.size()); for (Inforamation i : list) {
		 * System.out.println(i.getTitle()+"\t"+i.getInfo()); }
		 */

		/**
		 * selectEight
		 */
		/*
		 * List<Inforamation> list = inforamationDao.selectEight();
		 * System.out.println(list.size()); for (Inforamation i2 : list) {
		 * System.out.println(i2.getInfoid()+"\t"+ i2.getTitle()); }
		 */

		/**
		 * select one
		 */
		/*
		 * Inforamation inforamation = inforamationDao.selectOne(1001);
		 * System.out.println(inforamation);
		 * System.out.println(inforamation.getTitle());
		 */

		/**
		 * add
		 */
		/*
		 * List<Inforamation> list = inforamationDao.selectAll(); Inforamation
		 * inforamation = new Inforamation(); inforamation.setUid(500001);
		 * inforamation.setTitle("更新数据2"); inforamation.setOutline("测试更新2");
		 * inforamation.setInfo("测试"); inforamationDao.add(inforamation);
		 * sqlSession.commit();
		 * 
		 * list = inforamationDao.selectAll(); for (Inforamation i : list) {
		 * System.out.println(i.getInfoid()+"\t"+i.getUid()); }
		 */

		/**
		 * delete
		 */
		/*
		 * List<Inforamation> list = inforamationDao.selectAll();
		 * System.out.println(list.size()); for (Inforamation inforamation :
		 * list) { System.err.println(inforamation.getInfoid()); } int[] array =
		 * {1007,1008}; inforamationDao.delete(array); sqlSession.commit(); list
		 * = inforamationDao.selectAll(); for (Inforamation i1 : list) {
		 * System.out.println(i1.getTitle()+"\t"+i1.getOutline()); }
		 */

		/**
		 * update
		 */

		List<Inforamation> list = inforamationDao.selectAll();
		Inforamation inforamation = new Inforamation();
		inforamation.setInfoid(1002);
		inforamation.setTitle("更新数据1");
		inforamation.setOutline("测试更新1");
		inforamation.setInfo("测试");
		inforamationDao.update(inforamation);
		sqlSession.commit();
		list = inforamationDao.selectAll();
		for (Inforamation i : list) {
			System.out.println(i.getTitle() + "\t" + i.getInfo());
		}

	}
}
