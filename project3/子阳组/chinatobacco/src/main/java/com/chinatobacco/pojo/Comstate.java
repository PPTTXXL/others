package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商品状态实体类
 */
public class Comstate {
	/**
	 * 商品状态编号
	 */
	private int stareid;
	/**
	 * 商品状态名称
	 */
	private String statename;

	public Comstate() {
		super();
	}

	public Comstate(int stareid, String statename) {
		super();
		this.stareid = stareid;
		this.statename = statename;
	}

	public int getStareid() {
		return stareid;
	}

	public void setStareid(int stareid) {
		this.stareid = stareid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}
