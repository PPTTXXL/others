package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.MoneylistDao;
import com.chinatobacco.dao.MoneylisttypeDao;
import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.pojo.Moneylist;
import com.chinatobacco.pojo.Moneylisttype;

/**
 * @author Davi
 * @category 流水类型表数据访问接口测试类
 */
public class MoneylisttypeDaoTest {
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
		MoneylisttypeDao moneylisttypeDao = sqlSession.getMapper(MoneylisttypeDao.class);
		
		/**
		 * select one
		 */
		/*Moneylisttype moneylisttype = moneylisttypeDao.selectOne(1);
		System.out.println(moneylisttype);
		System.out.println(moneylisttype.getName());*/

		/**
		 * select all
		 */
		
		 /*List<Moneylisttype> list = moneylisttypeDao.selectAll();
		 System.out.println(list.size()); for (Moneylisttype m : list) {
		 System.out.println(m.getId()+"\t"+m.getName());
		 }*/
		 

		
		/**
		 * add
		 */
		
		 /*List<Moneylisttype> list = moneylisttypeDao.selectAll(); 
		 Moneylisttype moneylisttype = new Moneylisttype(); 
		 moneylisttype.setId(3);
		 moneylisttype.setName("待定");;
		 moneylisttypeDao.add(moneylisttype); 
		 sqlSession.commit(); 
		 list = moneylisttypeDao.selectAll(); 
		 for (Moneylisttype m : list) {
		 System.out.println(m.getId() + "\t" + m.getName()); 
		 }*/
		 

		/**
		 * delete
		 */

		/*List<Moneylisttype> list = moneylisttypeDao.selectAll();
		moneylisttypeDao.delete(3);
		sqlSession.commit();
		list = moneylisttypeDao.selectAll();
		for (Moneylisttype m : list) {
			System.out.println(m.getId()+ "\t" + m.getName());
		}*/
		
		/**
		 * update
		 */
		List<Moneylisttype> list = moneylisttypeDao.selectAll();
		Moneylisttype moneylisttype = new Moneylisttype();
		moneylisttype.setId(1);
		moneylisttype.setName("支出");
		moneylisttypeDao.update(moneylisttype);
		sqlSession.commit();
		
		list = moneylisttypeDao.selectAll();
		for (Moneylisttype m : list) {
			System.out.println(m.getId()+"\t"+m.getName());
	}
}
}

