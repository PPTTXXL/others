package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Approval;
import com.chinatobacco.service.AccountService;
import com.chinatobacco.service.ApprovalService;

/**
 * @author Davi
 * @category 资金申请审批业务逻辑测试
 */
public class ApprovalServiceTest {
	/*
	 * selectAll
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		List<Approval> list = service.selectAll();
		System.err.println(list.size());

		for (Approval approval : list) {
			System.err.println(approval.getApprovalnum()+"\t"+approval.getReason());
		}
}*/
	
	/*
	 * selectone
	 */
	
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		Approval approval = service.selectOne(312412);
		
		System.err.println(approval.getApprovalnum());
		
		}*/
	
	/*
	 * selectByUid
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		List<Approval> list = service.selectByUid(500001);
		System.err.println(list.size());

		for (Approval approval : list) {
			System.err.println(approval.getApprovalnum()+"\t"+approval.getReason());
		}
}*/
	
	/*
	 * selectQuery
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		Approval approval = new Approval();
		service.selectQuery(approval);
		List<Approval> list = service.selectAll();
		for (Approval approval2 : list) {
			System.err.println(approval2.getReason());
		}
	}*/
	
	/*
	 * add
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		Approval approval = new Approval();
		approval.setApprovalid(565656);
		approval.setUid(500001);
		approval.setApstaid(1);
		approval.setReason("吃的啥呀");
		service.add(approval);
		List<Approval> list = service.selectAll();
		for (Approval approval2 : list) {
			System.out.println(approval2.getApprovalnum()+"\t"+approval2.getReason());
		}
}*/
	/*
	 * update
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		ApprovalService service = context.getBean(ApprovalService.class);

		Approval approval = new Approval();
		approval.setApprovalid(312412);;
		approval.setReason("展示给那个");;
		service.update(approval);
		List<Approval> list = service.selectAll();
		for (Approval approval2 : list) {
			System.err.println(approval2.getApprovalnum()+"\t"+approval2.getReason());
		}
	}
}