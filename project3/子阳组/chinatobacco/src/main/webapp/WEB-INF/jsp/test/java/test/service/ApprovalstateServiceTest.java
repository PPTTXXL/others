package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Approvalstate;
import com.chinatobacco.service.AccountService;
import com.chinatobacco.service.ApprovalstateService;

/**
 * @author Davi
 * @category 申请状态表业务逻辑测试
 */
public class ApprovalstateServiceTest {
	/*
	 * selectAll
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalstateService service = context.getBean(ApprovalstateService.class);

		List<Approvalstate> list = service.selectAll();
		System.err.println(list.size());

		for (Approvalstate approvalstate : list) {
			System.err.println(approvalstate.getApstaname());
		}
	}*/
	
	/*
	 * selectone
	 */
	
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalstateService service = context.getBean(ApprovalstateService.class);

		Approvalstate account = service.selectOne(1);
		
		System.err.println(account.getApstaname());
		
		}*/
	/*
	 * add
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalstateService service = context.getBean(ApprovalstateService.class);

		Approvalstate approvalstate = new Approvalstate();
		approvalstate.setApstaid(3);;
		approvalstate.setApstaname("测试结束");
		service.add(approvalstate);
		List<Approvalstate> list = service.selectAll();
		for (Approvalstate approvalstate2 : list) {
			System.out.println(approvalstate2.getApstaname());
		}
}*/
	/*
	 * update
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalstateService service = context.getBean(ApprovalstateService.class);

		Approvalstate approvalstate = new Approvalstate();
		approvalstate.setApstaid(3);;
		approvalstate.setApstaname("测试开始");
		service.update(approvalstate);
		List<Approvalstate> list = service.selectAll();
		for (Approvalstate approvalstate2 : list) {
			System.err.println(approvalstate2.getApstaname());
		}
	}
	
}