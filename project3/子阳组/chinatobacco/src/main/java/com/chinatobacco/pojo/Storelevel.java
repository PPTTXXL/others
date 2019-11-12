package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商户等级实体类
 */
public class Storelevel {
	/**
	 * 商户等级编号
	 */
	private int lvid;
	/**
	 * 商户等级名称
	 */
	private String lvname;

	public Storelevel() {
		super();
	}

	public Storelevel(int lvid, String lvname) {
		super();
		this.lvid = lvid;
		this.lvname = lvname;
	}

	public int getLvid() {
		return lvid;
	}

	public void setLvid(int lvid) {
		this.lvid = lvid;
	}

	public String getLvname() {
		return lvname;
	}

	public void setLvname(String lvname) {
		this.lvname = lvname;
	}

}
