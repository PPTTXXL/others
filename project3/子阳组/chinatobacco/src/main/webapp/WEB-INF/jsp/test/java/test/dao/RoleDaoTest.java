package test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinatobacco.dao.RoleDao;
import com.chinatobacco.pojo.Role;
/**
 * @author King.zy
 * @category 省数据访问层测试类
 */
public class RoleDaoTest {

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
			RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
			/**
			 * select all
			 */
			/*List<Role> list = roleDao.selectAll();
			System.out.println(list.size());
			for (Role role : list) {
				System.out.println(role.getName());
			}*/
			/**
			 * select one
			 */
			/*Role role = roleDao.selectOne(1);
			System.out.println(role);
			System.out.println(role.getName());*/
			/**
			 * add
			 */
			List<Role> list = roleDao.selectAll();
			Role role = new Role(7,"人事",1,1,1,1,1,1,1,1,1);
			roleDao.add(role);
			sqlSession.commit();
			list = roleDao.selectAll();
			for (Role r  : list) {
				System.out.println(r.getRoleid()+r.getName());
			}
			
			/**
			 * delete
			 */
			/*List<Role> list = roleDao.selectAll();
			roleDao.delete(3);
			sqlSession.commit();
			list = roleDao.selectAll();
			for (Role r : list) {
				System.out.println(r.getRoleid());
			}*/
			
			/**
			 * update
			 */
			
			/*List<Role> list = roleDao.selectAll();
			Role role = new Role(3,"经理",0,0,0,1,1,1,1,1,1);
			roleDao.update(role);
			sqlSession.commit();
			
			list = roleDao.selectAll();
			for (Role r : list) {
				System.out.println(r.getName()+r.getEmpmanage());
			}*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
