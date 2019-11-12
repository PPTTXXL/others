package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Province;
import com.chinatobacco.service.ProvinceService;

/**
 * @author Castle
 * @category 省的业务逻辑接口测试
 */
public class ProvinceServiceTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		ProvinceService service=context.getBean(ProvinceService.class);
		/**
		 * findAll
		 */
		/*List<Province> list = service.findAll();
		System.out.println(list.size());
		
		for (Province province : list) {
			System.out.println(province.getProvince());
		}*/
		/**
		 * findObject
		 */
		Province province=service.findObject("310000");
		System.out.println(province.getProvinceID()+"\t"+province.getProvince());

	}
}
