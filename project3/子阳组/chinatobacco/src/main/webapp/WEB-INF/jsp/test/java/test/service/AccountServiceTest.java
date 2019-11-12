package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.service.AccountService;

/**
 * @author Davi
 * @category 账户业务逻辑测试
 */
public class AccountServiceTest {
	/*
	 * selectAll
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		AccountService service = context.getBean(AccountService.class);

		List<Account> list = service.selectAll();
		System.err.println(list.size());

		for (Account account : list) {
			System.err.println(account.getBalance());
		}
	}*/
	
	/*
	 * selectone
	 */
	
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		AccountService service = context.getBean(AccountService.class);

		Account account = service.selectOne(12345678);
		
		System.err.println(service);
		
		}
*/
	/*
	 * add
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		AccountService service = context.getBean(AccountService.class);

		Account account = new Account();
		account.setAccid(1234567);
		account.setBalance(333333);
		service.add(account);
		List<Account> list = service.selectAll();
		for (Account account2 : list) {
			System.out.println(account2.getBalance());
		}*/
	
	/*
	 * update
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		AccountService service = context.getBean(AccountService.class);

		Account account = new Account();
		account.setAccid(1234567);
		account.setBalance(444444);
		service.update(account);
		List<Account> list = service.selectAll();
		for (Account account2 : list) {
			System.out.println(account2.getBalance());
		}
	}
}

