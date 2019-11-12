package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Commoditybag;

/**
 * @author King.zy
 * @category 商品包业务逻辑接口
 */
public interface CommoditybagService {
	/**
	 * 根据订单编号查询包内的商品（多表联查-商品名称）
	 * 
	 * @param indentid订单编号
	 * @return 商品包对象
	 */
	public List<Commoditybag> selectByIndet(int indentid);

	/**
	 * 添加商品至商品包（匹配订单号）
	 * 
	 * @param commoditybag商品包对象
	 * @return 1或0
	 */
	public boolean add(Commoditybag commoditybag);

	/**
	 * 根据订单编号删除商品包对象
	 * 
	 * @param indentid订单编号
	 * @return 1或0
	 */
	public boolean delete(int indentid);

	/**
	 * 修改
	 * 
	 * @param commoditybag商品包对象
	 * @return 1或0
	 */
	public boolean update(Commoditybag commoditybag);
}
