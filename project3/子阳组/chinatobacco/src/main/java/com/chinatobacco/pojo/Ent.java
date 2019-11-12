package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 仓库表
 */
public class Ent {
	/**
	 * 仓库编号
	 */
	private int entid;
	/**
	 * 仓库名称
	 */
	private String entname;

	public Ent() {
		super();
	}

	public Ent(int entid, String entname) {
		super();
		this.entid = entid;
		this.entname = entname;
	}

	public int getEntid() {
		return entid;
	}

	public void setEntid(int entid) {
		this.entid = entid;
	}

	public String getEntname() {
		return entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

}
