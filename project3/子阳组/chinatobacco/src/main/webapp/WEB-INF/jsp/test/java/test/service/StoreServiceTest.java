package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.StoreService;

public class StoreServiceTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		StoreService service = context.getBean(StoreService.class);

		/*
		 * List<Store> list = service.selectAll();
		 * System.err.println(list.size()); for (Store store : list) {
		 * System.out.println(store.getLvid()+"\t"+store.getStoreaddr()); }
		 */

		/*
		 * List<Store> list = service.selectByLv(3);
		 * System.err.println(list.size()); for (Store store : list) {
		 * System.err.println(store.getStoreaddr()+"\t"+store.getStorename()); }
		 */

		/*
		 * List<Store> list = service.selectByName("安抚");
		 * System.err.println(list.size()); for (Store store : list) {
		 * System.err.println(store.getPassword()+"\t"+store.getStoreaddr()+"\t"
		 * +store.getStorename()); }
		 */

		/*
		 * Store store = new Store(); store.setStoreaddr("西安");
		 * store.setLvid(1); store.setPassword("1111"); store.setStoreid(5);
		 * store.setStorename("lalalla"); boolean flag = service.add(store);
		 * System.err.println(flag);
		 */
		List<Store> list = service.selectAll();
		System.err.println(list.size());
		for (Store store1 : list) {
			System.out.println(store1.getStoreid()+"\t"+store1.getStorelevel().getLvid() + "\t" + store1.getStoreaddr());
		}

		Store store = new Store();
		store.setStoreid(20001);
		store.setLvid(2);
		store.setStoreaddr("ai");
		boolean flag = service.update(store);
		System.err.println(flag);
		List<Store> list2 = service.selectAll();
		System.err.println(list2.size());
		for (Store store1 : list2) {
			System.out.println(store1.getStoreid()+"\t"+store1.getStorelevel().getLvid() + "\t" + store1.getStoreaddr());
		}

	}
}
