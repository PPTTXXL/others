package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商品类型实体类
 */
public class Comtype {
	/**
	 * 商品类型编号
	 */
	private int comtypeid;
	/**
	 * 商品类型名称
	 */
	private String comtypename;

	public Comtype() {
		super();
	}

	public Comtype(int comtypeid, String comtypename) {
		super();
		this.comtypeid = comtypeid;
		this.comtypename = comtypename;
	}

	public int getComtypeid() {
		return comtypeid;
	}

	public void setComtypeid(int comtypeid) {
		this.comtypeid = comtypeid;
	}

	public String getComtypename() {
		return comtypename;
	}

	public void setComtypename(String comtypename) {
		this.comtypename = comtypename;
	}

}
