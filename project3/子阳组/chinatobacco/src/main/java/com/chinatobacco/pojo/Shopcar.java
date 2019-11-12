package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 购物车表
 */
public class Shopcar {
	/**
	 * 购物车编号
	 */
	private int carid;
	/**
	 * 商品编号
	 */
	private int comid;
	/**
	 * 商品对象
	 */
	private Commodity commodity;
	/**
	 * 商户编号
	 */
	private int storeid;

	public Shopcar() {
		super();
	}

	public Shopcar(int carid, int comid, Commodity commodity, int storeid) {
		super();
		this.carid = carid;
		this.comid = comid;
		this.commodity = commodity;
		this.storeid = storeid;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
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

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

}
