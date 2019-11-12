package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.service.InforamationService;

public class InforamationServise {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		InforamationService service = context.getBean(InforamationService.class);
	/*	
		 List<Inforamation> list = service.selectAll();
		  System.out.println(list.size());
		  for (Inforamation inforamation : list) {
			System.err.println(inforamation.getTitle()+"\t"+inforamation.getUser().getUname());
		}
		 */


		 /* List<Inforamation> list = service.selectEight();
		  System.out.println(list.size());
		  for (Inforamation inforamation : list) {
			System.err.println(inforamation.getTitle()+"\t"+inforamation.getUser().getUname());
		}*/
		
		Inforamation waybill = service.selectOne(1002);
		  System.err.println(waybill.getTitle()+"\t"+waybill.getInfoid());
		 

		/*Waybill waybill = new Waybill();
		waybill.setIndentid(12345698);
		waybill.setStoreid(20001);
		waybill.setWayaddr("dcngfjfd");
		boolean flag = service.add(waybill);
		System.err.println(flag);*/

		/*Waybill waybill = new Waybill();
		waybill.setWayid(310000010);
		waybill.setWayaddr("西安");
		boolean flag = service.update(waybill);
		System.err.println(flag);*/

	}

}
