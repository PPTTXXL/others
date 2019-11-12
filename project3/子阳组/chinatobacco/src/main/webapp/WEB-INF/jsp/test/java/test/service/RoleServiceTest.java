package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Role;
import com.chinatobacco.service.RoleService;
/**
 * @author Castle
 * @category 角色的业务逻辑接口测试
 */
public class RoleServiceTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		RoleService service=context.getBean(RoleService.class);
		/**
		 * select all
		 */
//		List<Role> list=service.selectAll();
//		System.out.println(list.size());
//		
//		for (Role role : list) {
//			System.out.println(role.getCommoditymanage());
//		}
		/**
		 * select one
		 */
//		Role role = service.selectOne(1);
//		System.out.println(role);
//		System.out.println(role.getName());
		/**
		 * add
		 */
		/*List<Role> list = service.selectAll();
		Role role = new Role(3,"经理",1,0,0,0,1,1,1,1,1);
		service.add(role);
		list = service.selectAll();
		for (Role r  : list) {
			System.out.println(r.getRoleid()+r.getName());
		}*/
		/**
		 * delete
		 */
		List<Role> list = service.selectAll();
		service.delete(3);
		list = service.selectAll();
		for (Role r : list) {
			System.out.println(r.getRoleid()+r.getName());
		}
		/**
		 * update
		 */
		
		/*List<Role> list = service.selectAll();
		Role role = new Role(5,"经理",0,0,0,1,1,1,1,1,1);
		service.update(role);
		
		list = service.selectAll();
		for (Role r : list) {
			System.out.println(r.getName()+r.getEmpmanage());
		}*/
	}
	
}
