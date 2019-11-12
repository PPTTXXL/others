package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Shelf;

/**
 * @author King.zy
 * @category 货架的数据访问接口
 */
public interface ShelfDao {
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
	 * @return 1或0
	 */
	public int add(Shelf shelf);

	/**
	 * 删除一个货架
	 * 
	 * @param Shelfid货架编号
	 * @return 1或0
	 */
	public int delete(int shelfid);

	/**
	 * 修改一个货架信息
	 * 
	 * @param Shelf
	 *            货架对象
	 * @return 1或0
	 */
	public int update(Shelf shelf);
}
