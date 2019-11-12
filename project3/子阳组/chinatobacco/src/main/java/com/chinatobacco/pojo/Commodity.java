package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商品实体类
 */
public class Commodity {
	/**
	 * 商品编号
	 */
	private int comid;
	/**
	 * 商品类型编号
	 */
	private int comtypeid;

	/**
	 * 商品类型对象
	 */
	private Comtype comtype;
	/**
	 * 商品名称
	 */
	private String comname;
	/**
	 * 商品价格
	 */
	private double price;
	/**
	 * 商品图片地址
	 */
	private String comimg;
	/**
	 * 商品状态编号
	 */
	private int stareid;
	/**
	 * 商品状态对象
	 */
	private Comstate comstate;
	/**
	 * 商品详情
	 */
	private String info;

	public Commodity() {
		super();
	}

	public Commodity(int comid, int comtypeid, Comtype comtype, String comname, double price, String comimg,
			int stareid, Comstate comstate, String info) {
		super();
		this.comid = comid;
		this.comtypeid = comtypeid;
		this.comtype = comtype;
		this.comname = comname;
		this.price = price;
		this.comimg = comimg;
		this.stareid = stareid;
		this.comstate = comstate;
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public int getComtypeid() {
		return comtypeid;
	}

	public void setComtypeid(int comtypeid) {
		this.comtypeid = comtypeid;
	}

	public Comtype getComtype() {
		return comtype;
	}

	public void setComtype(Comtype comtype) {
		this.comtype = comtype;
	}

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getComimg() {
		return comimg;
	}

	public void setComimg(String comimg) {
		this.comimg = comimg;
	}

	public int getStareid() {
		return stareid;
	}

	public void setStareid(int stareid) {
		this.stareid = stareid;
	}

	public Comstate getComstate() {
		return comstate;
	}

	public void setComstate(Comstate comstate) {
		this.comstate = comstate;
	}

}
