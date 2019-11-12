package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.LocationDao;
import com.chinatobacco.dao.MoneylistDao;
import com.chinatobacco.pojo.County;
import com.chinatobacco.pojo.Location;
import com.chinatobacco.pojo.Moneylist;

/**
 * @author Davi
 * @category 财务流水表测试类
 */
public class MoneylistDaoTest {
	@Test
	public void test() throws IOException, ParseException {
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
		MoneylistDao moneylistDao = sqlSession.getMapper(MoneylistDao.class);

		/**
		 * select all
		 */
		/*
		 * List<Moneylist> list = moneylistDao.selectAll();
		 * System.out.println(list.size()); for (Moneylist m : list) {
		 * System.out.println(m.getMoneynum()+"\t"+m.getDirection()); }
		 */

		/**
		 * selectByType
		 */
		/*
		 * List<Moneylist> list = moneylistDao.selectByType(1);
		 * System.out.println(list.size()); for (Moneylist moneylist : list){
		 * System.out.println(moneylist.getDirection()); }
		 */

		/**
		 * selectByDate
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2019-10-19");
		System.out.println(date);
		List<Moneylist> list = moneylistDao.selectByDate(date);
		System.out.println(list.size());
		for (Moneylist moneylist1 : list) {
			System.err.println(moneylist1.getDate());
		}

		/**
		 * selectQuery
		 */
		/*
		 * Moneylist moneylist = new Moneylist(); List<Moneylist> list =
		 * moneylistDao.selectQuery(moneylist); System.out.println(list.size());
		 * for (Moneylist moneylist1 : list) {
		 * System.err.println(moneylist.getDirection()); }
		 */

		/**
		 * add
		 */
		/*
		 * List<Moneylist> list = moneylistDao.selectAll(); Moneylist moneylist
		 * = new Moneylist(); moneylist.setId(1);
		 * moneylist.setMoneynum(123456);; moneylist.setDirection("测试的");
		 * moneylistDao.add(moneylist); sqlSession.commit();
		 * 
		 * list = moneylistDao.selectAll(); for (Moneylist m : list) {
		 * System.out.println(m.getMoneynum() + "\t" + m.getDirection()); }
		 */

		/**
		 * delete
		 */

		/*
		 * List<Moneylist> list = moneylistDao.selectAll();
		 * moneylistDao.delete(100000000); sqlSession.commit(); list =
		 * moneylistDao.selectAll(); for (Moneylist l : list) {
		 * System.out.println(l.getDirection()+ "\t" + l.getMoneynum()); }
		 */

	}
}
