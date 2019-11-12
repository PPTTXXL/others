package test.service;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Ent;
import com.chinatobacco.service.EntService;

public class EntServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	EntService service = context.getBean(EntService.class);

	@Test
	public void rest() {
		// List<Ent> list = service.selectAll();
		// for (Ent ent : list) {
		// System.out.println(ent.getEntid() + "\t" + ent.getEntname());
		// }

		// Ent ent = service.selectOne(1);
		// System.out.println(ent.getEntid() + "\t" + ent.getEntname());

		// Ent ent = new Ent();
		// ent.setEntname("天上人间");
		// boolean a = service.add(ent);
		// System.out.println(a);

		Ent ent = new Ent();
		ent.setEntname("天阙");
		ent.setEntid(4);
		boolean a = service.update(ent);
		System.out.println(a);
	}

}
