package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 货架表实体类
 */
public class Shelf {
	/**
	 * 货架编号
	 */
	private int shelfid;
	/**
	 * 货架名称
	 */
	private String shelfname;

	public Shelf() {
		super();
	}

	public Shelf(int shelfid, String shelfname) {
		super();
		this.shelfid = shelfid;
		this.shelfname = shelfname;
	}

	public int getShelfid() {
		return shelfid;
	}

	public void setShelfid(int shelfid) {
		this.shelfid = shelfid;
	}

	public String getShelfname() {
		return shelfname;
	}

	public void setShelfname(String shelfname) {
		this.shelfname = shelfname;
	}

}
