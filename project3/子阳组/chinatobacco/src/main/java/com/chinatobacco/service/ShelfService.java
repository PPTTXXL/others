package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Shelf;

/**
 * @author King.zy
 * @category 货架的业务逻辑接口
 */
public interface ShelfService {
	/**
	 * 查询所有货架
	 * 
	 * @return 货架对象集合
	 */
	public List<Shelf> selectAll();

	/**
	 * 查询一个货架
	 * 
	 * @param Shelfid货架编号
	 * @return 货架对象
	 */
	public Shelf selectOne(int shelfid);

	/**
	 * 添加货架对象
	 * 
	 * @param Shelf货架对象
	 * @return boolean
	 */
	public boolean add(Shelf shelf);

	/**
	 * 删除一个货架
	 * 
	 * @param Shelfid货架编号
	 * @return boolean
	 */
	public boolean delete(int shelfid);

	/**
	 * 修改一个货架信息
	 * 
	 * @param Shelf货架对象
	 * @return boolean
	 */
	public boolean update(Shelf shelf);
}
