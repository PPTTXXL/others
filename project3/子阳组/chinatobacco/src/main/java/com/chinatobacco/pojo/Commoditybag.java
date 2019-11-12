package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商品包实体类（专门存储订单中已经下单的商品）
 */
public class Commoditybag {
	/**
	 * 编号
	 */
	private int bagid;
	/**
	 * 商品编号
	 */
	private int comid;
	/**
	 * 商品对象
	 */
	private Commodity commodity;
	/**
	 * 订单编号
	 */
	private int indentid;
	/**
	 * 数量
	 */
	private int spnum;

	public Commoditybag() {
		super();
	}

	public Commoditybag(int bagid, int comid, Commodity commodity, int indentid, int spnum) {
		super();
		this.bagid = bagid;
		this.comid = comid;
		this.commodity = commodity;
		this.indentid = indentid;
		this.spnum = spnum;
	}

	public int getBagid() {
		return bagid;
	}

	public void setBagid(int bagid) {
		this.bagid = bagid;
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

	public int getIndentid() {
		return indentid;
	}

	public void setIndentid(int indentid) {
		this.indentid = indentid;
	}

	public int getSpnum() {
		return spnum;
	}

	public void setSpnum(int spnum) {
		this.spnum = spnum;
	}

}
