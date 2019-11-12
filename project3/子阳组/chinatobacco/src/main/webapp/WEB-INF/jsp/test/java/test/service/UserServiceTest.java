package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.User;
import com.chinatobacco.service.UserService;

public class UserServiceTest {
	
		@Test
		public void test(){
			ApplicationContext context =new  ClassPathXmlApplicationContext("spring/spring.xml");
			UserService service = context.getBean(UserService.class);
			
			/*List<User> list = service.selectAll();
			System.err.println(list.size());
			for (User store : list) {
				System.out.println(store.getUaddr()+"\t"+store.getUname());
			}*/
			
			/*List<User> list = service.selectByRole(2);
			System.err.println(list.size());
			for (User store : list) {
				System.out.println(store.getUaddr()+"\t"+store.getUname());
			}*/
			
			
			/*List<User> list = service.selectByName("rose");
			System.err.println(list.size());
			for (User store : list) {
				System.out.println(store.getUaddr()+"\t"+store.getUname());
			}*/
			/*User user  = new User();
			List<User> list = service.selectQuery(user);
			System.err.println(list.size());
			for (User store : list) {
				System.out.println(store.getUaddr()+"\t"+store.getUname());
			}*/
			/*User user  = service.selectById(500000);
			
			System.err.println(user.getUaddr()+"\t"+user.getUname());
			*/
			/*User user  = service.selectByPass(500000, "admin");
			
			System.err.println(user.getUaddr()+"\t"+user.getUname());
			*/
			
			User user  = new User();
			user.setRoleid(2);
			user.setUsex("nan");
			user.setPassword("lklkkk");
			boolean flag =  service.add(user);
			System.err.println(flag);
			/*
			User user  = new User();
			user.setUid(500000);
			user.setUname("lllll");
			user.setRoleid(2);
			boolean flag =  service.update(user);
			System.err.println(flag);*/
			
		}		

}
