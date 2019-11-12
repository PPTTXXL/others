package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.EntDao;
import com.chinatobacco.dao.IndentstateDao;
import com.chinatobacco.pojo.Ent;
import com.chinatobacco.pojo.Indentstate;

/**
 * @author Davi
 * @category 订单状态数据访问层测试
 */
public class IndentstateDaoTest {
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
			IndentstateDao indentstateDao = sqlSession.getMapper(IndentstateDao.class);

			/**
			 * select all
			 */
			/*
			 * List<Indentstate> list = indentstateDao.selectAll();
			 * System.out.println(list.size()); for (Indentstate indentstate :
			 * list){ System.out.println(indentstate.getStatename()); }
			 */
			/**
			 * select one
			 */
			/*
			 * Indentstate indentstate = indentstateDao.selectOne(1);
			 * System.out.println(indentstate);
			 * System.out.println(indentstate.getStatename());
			 */

			/**
			 * add
			 */

			/*
			 * List<Indentstate> list = indentstateDao.selectAll(); Indentstate
			 * indentstate = new Indentstate(); indentstate.setStatename("付了");
			 * indentstateDao.add(indentstate); sqlSession.commit(); list =
			 * indentstateDao.selectAll(); for (Indentstate i : list) {
			 * System.out.println(i.getStateid() + "\t" + i.getStatename()); }
			 */

			/**
			 * delete
			 */

			List<Indentstate> list = indentstateDao.selectAll();
			indentstateDao.delete(4);
			sqlSession.commit();
			list = indentstateDao.selectAll();
			for (Indentstate i : list) {
				System.out.println(i.getStateid() + "\t" + i.getStatename());
			}

			/**
			 * update
			 */

			/*
			 * List<Indentstate> list = indentstateDao.selectAll(); Indentstate
			 * indentstate = new Indentstate(1,"已支付");
			 * indentstateDao.update(indentstate); sqlSession.commit();
			 * 
			 * list = indentstateDao.selectAll(); for (Indentstate i : list) {
			 * System.out.println(i.getStateid()+"\t"+i.getStatename()); }
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
