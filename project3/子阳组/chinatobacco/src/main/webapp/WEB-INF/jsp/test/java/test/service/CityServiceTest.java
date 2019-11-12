package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.City;
import com.chinatobacco.service.CityServcice;

/**
 * @author Davi
 * @author 城市业务逻辑测试类
 */
public class CityServiceTest {
	/*
	 * selectAll
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CityServcice service = context.getBean(CityServcice.class);

		List<City> list = service.selectAll("110000");
		System.err.println(list.size());

		for (City city : list) {
			System.out.println(city.getCity());
		}
	}*/
	
	/*
	 * selectone
	 */
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CityServcice service = context.getBean(CityServcice.class);

		City city = service.selectOne("120100");
		
		System.err.println(city.getCity());
		
		}
}

