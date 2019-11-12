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
import com.chinatobacco.pojo.Approval;

public class ApprovalDaoTest {
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
			ApprovalDao dao = sqlSession.getMapper(ApprovalDao.class);
			/* 查询所有申请表（多表联查-用户姓名，状态名称） */

			// List<Approval> list = dao.selectAll();
			// System.err.println(list.size());
			// for (Approval approval : list) {
			// System.out.println(approval.getApprovalid() + "\t" +
			// approval.getUser().getUname());
			// }

			/* 查询该用户的申请表（多表联查-用户姓名，状态名称） */

			// List<Approval> list = dao.selectByUid(500000);
			// System.err.println(list);
			// for (Approval approval : list) {
			// System.out.println(approval.getApprovalid() + "\t" +
			// approval.getUser().getUname() + "\t"
			// + approval.getApprovalstate().getApstaname());
			// }

			// Approval approval = dao.selectOne(2222);
			// System.out.println(approval.getUser().getUname());

			/* 条件查询申请表（多表联查-用户姓名，状态名称） */

			// Approval approval1 = new Approval();
			// System.out.println("w" + approval1.getApprovalid());
			// approval1.setUid(500001);
			// List<Approval> list = dao.selectQuery(approval1);
			// for (Approval approval : list) {
			// System.out.println(approval.getApprovalid() + "\t" +
			// approval.getUser().getUname() + "\t"
			// + approval.getApprovalstate().getApstaname());
			// }

			// 新增一个申请表
			// Approval approval1 = new Approval();
			//
			// approval1.setApprovalid(312412);
			// approval1.setApprovalnum(125454);
			// approval1.setReason("asfasf按时");
			// approval1.setUid(500001);
			// approval1.setApstaid(1);
			// ;
			//
			// int i = dao.add(approval1);
			// System.out.println(i);
			// List<Approval> list = dao.selectAll();
			// System.err.println(list);
			// for (Approval approval : list) {
			// System.out.println(approval.getApprovalid() + "\t" +
			// approval.getUser().getUname() + "\t"
			// + approval.getApprovalstate().getApstaname());
			// }
			/* 批量删除申请表 */

			// int a[] = { 2222, 56565 };
			// int i = dao.delete(a);
			// System.err.println(i);

			 Approval approval1 = new Approval();
			 approval1.setApprovalid(565555);
			 approval1.setApstaid(2);
			 approval1.setReason("gggggg");
			 int i = dao.update(approval1);
			 System.out.println(i);
			 List<Approval> list = dao.selectAll();
			 System.err.println(list.size());
			 for (Approval approval : list) {
			
			 System.out.println(approval.getApprovalid() + "\t" +
			 approval.getUser().getUname());
			 }

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
