package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.chinatobacco.pojo.Repertory;
import com.chinatobacco.service.RepertoryService;
/**
 * @author Castle
 * @category 库存表业务逻辑接口测试
 */
public class RepertoryServiceTest {


@Test
public void test(){
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
	
	RepertoryService service=context.getBean(RepertoryService.class);
	
	/**
	 * selectAll
	 */
	/*List<Repertory> list = service.selectAll();
	System.out.println(list.size());
	
	for (Repertory repertory : list) {
		System.out.println(repertory.getLocation().getLocid());
		}
		*/
	
	/**
	 * selectByComid
	 */
	/*Repertory repertory=service.selectByComid(10003);
	System.out.println(repertory.getCommodity().getComid()+"\t"+repertory.getNum()+"\t"+repertory.getLocation().getLocid());*/
	/**
	 * add
	 */
	/*List<Repertory> list=service.selectAll();
	Repertory repertory=new Repertory();
	repertory.setComid(10002);
	repertory.setLocid(3);
	repertory.setNum(38);
	service.add(repertory);
	list=service.selectAll();
	for (Repertory r : list) {
		System.out.println(r.getCommodity().getComid()+"\t"+r.getNum()+"\t"+r.getLocation().getLocid());
	}*/
	/**
	 * delete
	 */
	 List<Repertory> list = service.selectAll();
	 service.delete(1002); 
	 list = service.selectAll(); 
	 for(Repertory r : list) { 
		 System.out.println(r.getCommodity().getComid()+"\t"+r.getId()+"\t"+r.getNum()+"\t"+r.getLocation().getLocid()); 
	 }
	 
	/**
	 * update
	 */
//	 Repertory repertory = new Repertory();
//	 repertory.setId(1002);
//	 repertory.setComid(10005);
//	 repertory.setNum(2222);
//	 repertory.setLocid(2);
//	 boolean i = service.update(repertory);
//	 System.out.println(i);
//	 List<Repertory> list = service.selectAll();
//	 System.err.println(list.size());
//	 for (Repertory r : list) {
//	 System.out.println(r.getCommodity().getComid()+"\t"+r.getId()+"\t"+r.getNum()+"\t"+r.getLocation().getLocid());
//	 }

}
}
