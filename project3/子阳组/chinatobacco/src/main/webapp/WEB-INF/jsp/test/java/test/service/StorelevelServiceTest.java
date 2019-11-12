package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Storelevel;
import com.chinatobacco.service.StorelevelService;

/**
 * @author King.zy
 * @category 省数据访问层测试类
 * 
 */
public class StorelevelServiceTest {

	/*@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		StorelevelService service = context.getBean(StorelevelService.class);
		List<Storelevel> list = service.selectAll();
		System.err.println(list.size());
		for (Storelevel storelevel : list) {
			System.err.println(storelevel.getLvid() + "\t" + storelevel.getLvname());
		}

	}

	@Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		StorelevelService service = context.getBean(StorelevelService.class);
		Storelevel storelevel = service.selectOne(6);
		System.err.println(storelevel.getLvid() + "\t" + storelevel.getLvname());
	}*/
	/*@Test
	public void test3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		StorelevelService service = context.getBean(StorelevelService.class);
		Storelevel storelevel =new Storelevel();
		 
		storelevel.setLvid(8);
		storelevel.setLvname("hdja");
		service.add(storelevel);
		List<Storelevel> list =  service.selectAll();
		
		for (Storelevel storelevel2 : list) {
			System.err.println(storelevel2.getLvid() + "\t" + storelevel2.getLvname());
		}
	}*/
	@Test
	public void test4() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		StorelevelService service = context.getBean(StorelevelService.class);
		Storelevel storelevel =new Storelevel();
		 
		storelevel.setLvid(8);
		storelevel.setLvname("kdjfkdjfk");
		service.update(storelevel);
		List<Storelevel> list =  service.selectAll();
		
		for (Storelevel storelevel2 : list) {
			System.err.println(storelevel2.getLvid() + "\t" + storelevel2.getLvname());
		}
	}
}
