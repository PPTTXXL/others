package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Indent;
import com.chinatobacco.service.IndentService;

public class IndentServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	IndentService service = context.getBean(IndentService.class);

	@Test
	public void test() {
		// List<Indent> list = service.selectAll();
		// System.out.println(list);
		// for (Indent indent : list) {
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());
		// }

		// List<Indent> list = service.selectByStoreid(20001);
		// for (Indent indent : list) {
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());
		// }

		// List<Indent> list = service.selectByStateid(1);
		// for (Indent indent : list) {
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());
		// }

		// List<Indent> list = service.findForStoreByState(20001, 2);
		// for (Indent indent : list) {
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());
		// }

		// Indent indent = service.selectByIndentid(12312);
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());

		// Indent indent1 = new Indent();
		// indent1.setStoreid(20001);
		// indent1.setStateid(1);
		// List<Indent> list = service.selectQuery(indent1);
		// for (Indent indent : list) {
		// System.out.println(indent.getIndentid() + "\t" +
		// indent.getStore().getStorename());
		// }

		// Indent indent1 = new Indent();
		// indent1.setStoreid(20008);
		// indent1.setStateid(2);
		// indent1.setIndentid(42314);
		// indent1.setGrossprice(1312);
		// boolean a = service.add(indent1);
		// System.out.println(a);

		// Indent indent1 = new Indent();
		// indent1.setStoreid(20008);
		// indent1.setStateid(1);
		// indent1.setIndentid(42314);
		// indent1.setGrossprice(1);
		// boolean a = service.update(indent1);
		// System.out.println(a);

	}
}
