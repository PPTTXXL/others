package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.service.ComtypeService;

public class ComtypeServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	ComtypeService service = context.getBean(ComtypeService.class);

	@Test
	public void test() {
		// List<Comtype> list = service.selectAll();
		// for (Comtype comtype : list) {
		// System.out.println(comtype.getComtypeid() + "\t" +
		// comtype.getComtypename());
		// }

		// Comtype comtype = service.selectOne(1);
		// System.out.println(comtype.getComtypeid() + "\t" +
		// comtype.getComtypename());

		// Comtype comtype = new Comtype();
		// comtype.setComtypename("xx型");
		// boolean a = service.add(comtype);
		// System.out.println(a);

		// Comtype comtype = new Comtype();
		// comtype.setComtypeid(3);
		// comtype.setComtypename("YYxing");
		// boolean a = service.update(comtype);
		// System.out.println(a);

	}
}
