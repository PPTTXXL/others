package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Comstate;
import com.chinatobacco.service.ComstateService;

public class ComstateServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	ComstateService service = context.getBean(ComstateService.class);

	@Test
	public void test() {
//		List<Comstate> list = service.selectAll();
//		System.err.println(list.size());
//		for (Comstate c : list) {
//			System.out.println(c.getStareid() + "\t" + c.getStatename());
//		}
//
//		Comstate c = service.selectOne(1);
//		System.out.println(c.getStareid() + "\t" + c.getStatename());
//
//		Comstate comstate = new Comstate();
//		comstate.setStatename("哈咯");
//		boolean a = service.add(comstate);
//		System.out.println(a);

		Comstate ca = new Comstate();
		ca.setStatename("挖啊");
		ca.setStareid(4);
		boolean b = service.update(ca);
		System.out.println(b);
	}
}
