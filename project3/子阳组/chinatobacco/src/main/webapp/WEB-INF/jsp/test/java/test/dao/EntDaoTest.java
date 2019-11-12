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
import com.chinatobacco.pojo.Ent;

/**
 * @author Davi
 * @category 仓库表数据访问层测试类
 */
public class EntDaoTest {
	@Test
	public void test(){
		            
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
						EntDao entDao = sqlSession.getMapper(EntDao.class);
						
						/**
						 * select all
						 */
						/*List<Ent> list = entDao.selectAll();
						System.out.println(list.size());
						for (Ent ent : list){
							System.out.println(ent.getEntname());
						}*/
						/**
						 * select one
						 */
						/*Ent ent = entDao.selectOne(1);
						System.out.println(ent);
						System.out.println(ent.getEntname());*/
						
						
						/**
						 * add
						 */
						/*List<Ent> list = entDao.selectAll();
						Ent ent = new Ent();
						ent.setEntname("北仓");
						entDao.add(ent);
						sqlSession.commit();
						
						list = entDao.selectAll();
						for (Ent e  : list) {
							System.out.println(e.getEntid()+"\t"+e.getEntname());
						}*/
                        
						
						/**
						 * delete
						 */
						/*List<Ent> list = entDao.selectAll();
						entDao.delete(4);
						sqlSession.commit();
						list = entDao.selectAll();
						for (Ent e : list) {
							System.out.println(e.getEntid()+"\t"+e.getEntname());
						}*/
						
						/**
						 * update
						 */
						
						/*List<Ent> list = entDao.selectAll();
						Ent ent = new Ent(1,"北仓");
						entDao.update(ent);
						sqlSession.commit();
						
						list = entDao.selectAll();
						for (Ent e : list) {
							System.out.println(e.getEntid()+"\t"+e.getEntname());
						}
						*/
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
	}
}
