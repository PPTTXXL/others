package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Commodity;

/**
 * @author King.zy
 * @category 商品类业务逻辑接口
 */
public interface CommodityService {
	/**
	 * 查询所有商品（多表联查-状态名称，类型名称）
	 * 
	 * @return 商品对象集合
	 */
	public List<Commodity> selectAll();

	/**
	 * 查询一个商品对象（多表联查-状态名称，类型名称）
	 * 
	 * @param comid商品编号
	 * @return
	 */
	public Commodity selectOne(int comid);

	/**
	 * 根据类别查询商品（多表联查-状态名称，类型名称）
	 * 
	 * @param comtypeid商品类型编号
	 * @return 商品对象集合
	 */
	public List<Commodity> selectByType(int comtypeid);

	/**
	 * 根据状态查询商品（多表联查-状态名称，类型名称）
	 * 
	 * @param stareid状态编号
	 * @return 商品对象集合
	 */
	public List<Commodity> selectByState(int stareid);

	/**
	 * 条件查询（多表联查-状态名称，类型名称）
	 * 
	 * @param commodity
	 *            商品对象
	 * @return 商品对象集合
	 */
	public List<Commodity> selectQuery(Commodity commodity);

	/**
	 * 模糊查询（多表联查-状态名称，类型名称）
	 * 
	 * @param comname商品名称
	 * @return 商品对象集合
	 */
	public List<Commodity> selectByName(String comname);

	/**
	 * 添加商品对象
	 * 
	 * @param commodity商品对象
	 * @return 1或0
	 */
	public boolean add(Commodity commodity);

	/**
	 * 批量删除商品
	 * 
	 * @param comid商品编号数组
	 * @return 1或0
	 */
	public boolean delete(int[] comid);

	/**
	 * 修改商品信息
	 * 
	 * @param commodity商品对象
	 * @return 1或0
	 */
	public boolean update(Commodity commodity);
}
