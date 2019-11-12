package com.chinatobacco.pojo;

import java.util.Date;

/**
 * @author King.zy
 * @category 我的收藏实体类
 */
public class Collect {
	/**
	 * 收藏编号
	 */
	private int collid;
	/**
	 * 商品编号
	 */
	private int comid;
	/**
	 * 商品对象
	 */
	private Commodity commodity;
	/**
	 * 收藏日期
	 */
	private Date colldate;
	/**
	 * 商户编号
	 */
	private int storeid;

	public Collect() {
		super();
	}

	public Collect(int collid, int comid, Commodity commodity, Date colldate, int storeid) {
		super();
		this.collid = collid;
		this.comid = comid;
		this.commodity = commodity;
		this.colldate = colldate;
		this.storeid = storeid;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public int getCollid() {
		return collid;
	}

	public void setCollid(int collid) {
		this.collid = collid;
	}

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Date getColldate() {
		return colldate;
	}

	public void setColldate(Date colldate) {
		this.colldate = colldate;
	}

}
