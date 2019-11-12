package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Repertory;

/**
 * @author King.zy
 * @category 库存表数据访问接口
 */
public interface RepertoryDao {
	/**
	 * 查询所有库存信息（多表联查-商品名称-库位仓库名称和货架名称）
	 * 
	 * @return 库存对象集合
	 */
	public List<Repertory> selectAll();

	/**
	 * 查询一条库存信息根据商品编号（多表联查-商品名称-库位仓库名称和货架名称）
	 * 
	 * @param comid商品编号
	 * @return 库存对象
	 */
	public Repertory selectByComid(int comid);

	/**
	 * 添加一条库存信息
	 * 
	 * @param repertory库存对象
	 * @return 1或0
	 */
	public int add(Repertory repertory);

	/**
	 * 删除一条库存信息根据商品id
	 * 
	 * @param comid商品编号
	 * @return 1或0
	 */
	public int delete(int comid);

	/**
	 * 修改一条库存信息
	 * 
	 * @param repertory库存对象
	 * @return 1或0
	 */
	public int update(Repertory repertory);
}
