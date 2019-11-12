package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Comtype;

/**
 * @author King.zy
 * @category 商品类型数据访问接口
 */
public interface ComtypeDao {
	/**
	 * 查询所有商品类型
	 * 
	 * @return 商品类型对象集合
	 */
	public List<Comtype> selectAll();

	/**
	 * 查询一种商品类型
	 * 
	 * @return 商品对象
	 */
	public Comtype selectOne(int comtypeid);

	/**
	 * 添加一种商品类型
	 * 
	 * @param comtype商品类型对象
	 * @return 1和0
	 */
	public int add(Comtype comtype);

	/**
	 * 删除一种商品类型
	 * 
	 * @param comtypeid商品编号
	 * @return 1或0
	 */
	public int delete(int comtypeid);
	
	/**
	 * 修改状态信息
	 * @param comtype状态对象
	 * @return 1或0
	 */
	public int update(Comtype comtype);

}
