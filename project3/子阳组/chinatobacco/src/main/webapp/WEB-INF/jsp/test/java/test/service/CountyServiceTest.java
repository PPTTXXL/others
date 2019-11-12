package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.County;
import com.chinatobacco.service.CountyService;

public class CountyServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	CountyService service = context.getBean(CountyService.class);

	@Test
	public void test() {
		// List<County> list = service.findAreasByCid("110100");
		// for (County county : list) {
		// System.out.println(county.getAreaID() + county.getAreas());
		// }
		
		County county = service.findObject("110109");
		System.out.println(county.getAreaID() + county.getAreas());
	}
}
