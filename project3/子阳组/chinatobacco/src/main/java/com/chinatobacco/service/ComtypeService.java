package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Comtype;

/**
 * @author King.zy
 * @category 商品类型业务逻辑接口
 */
public interface ComtypeService {
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
	public boolean add(Comtype comtype);

	/**
	 * 删除一种商品类型
	 * 
	 * @param comtypeid商品编号
	 * @return 1或0
	 */
	public boolean delete(int comtypeid);

	/**
	 * 修改状态信息
	 * 
	 * @param comtype状态对象
	 * @return 1或0
	 */
	public boolean update(Comtype comtype);
}
