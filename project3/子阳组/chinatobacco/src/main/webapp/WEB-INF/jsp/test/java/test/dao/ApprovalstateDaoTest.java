package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.ApprovalDao;
import com.chinatobacco.dao.ApprovalstateDao;
import com.chinatobacco.pojo.Approval;
import com.chinatobacco.pojo.Approvalstate;

public class ApprovalstateDaoTest {
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
			ApprovalstateDao dao = sqlSession.getMapper(ApprovalstateDao.class);

			// List<Approvalstate> list = dao.selectAll();
			// System.err.println(list.size());
			// for (Approvalstate approvalstate : list) {
			// System.out.println(approvalstate.getApstaid() + "\t" +
			// approvalstate.getApstaname());
			// }

			// Approvalstate approvalstate = dao.selectOne(2);
			// System.err.println(approvalstate.getApstaid() + "\t" +
			// approvalstate.getApstaname());

			/* 新增一个申请表 */

			// Approvalstate approval1 = new Approvalstate();
			//
			// approval1.setApstaname("已过期");
			// int i = dao.add(approval1);
			// System.out.println(i);

			/* 批量删除 */

			// int a[] = { 3, 4 };
			// int i = dao.delete(a);
			// System.err.println(i);

			// Approvalstate approvalstate = new Approvalstate();
			// approvalstate.setApstaid(2);
			// approvalstate.setApstaname("已通过测试");
			// int i = dao.update(approvalstate);
			// System.out.println(i);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
