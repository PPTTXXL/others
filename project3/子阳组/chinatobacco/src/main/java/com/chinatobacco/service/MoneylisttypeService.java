package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Moneylisttype;

/**
 * @author King.zy
 * @category 流水类型业务逻辑接口
 */
public interface MoneylisttypeService {
	/**
	 * 查询一种流水类型
	 * 
	 * @param id流水类型id
	 * @return 流水类型对象
	 */
	public Moneylisttype selectOne(int id);

	/**
	 * 查询所有流水类型
	 * 
	 * @return 流水类型对象集合
	 */
	public List<Moneylisttype> selectAll();

	/**
	 * 新增一种流水类型
	 * 
	 * @param moneylisttype流水类型对象
	 * @return boolean
	 */
	public boolean add(Moneylisttype moneylisttype);

	/**
	 * 删除一个流水类型
	 * 
	 * @param id类型id
	 * @return boolean
	 */
	public boolean delete(int id);

	/**
	 * 修改一个流水类型
	 * 
	 * @param moneylisttype流水类型对象
	 * @return boolean
	 */
	public boolean update(Moneylisttype moneylisttype);
}
