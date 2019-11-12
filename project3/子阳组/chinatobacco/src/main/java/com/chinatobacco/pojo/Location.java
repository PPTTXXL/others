package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 库位表实体类
 */
public class Location {
	/**
	 * 库位编号
	 */
	private int locid;
	/**
	 * 仓库编号
	 */
	private int entid;
	/**
	 * 仓库对象
	 */
	private Ent ent;
	/**
	 * 货架编号
	 */
	private int shelfid;
	/**
	 * 货架对象
	 */
	private Shelf shelf;

	public Location() {
		super();
	}

	public Location(int locid, int entid, Ent ent, int shelfid, Shelf shelf) {
		super();
		this.locid = locid;
		this.entid = entid;
		this.ent = ent;
		this.shelfid = shelfid;
		this.shelf = shelf;
	}

	public int getLocid() {
		return locid;
	}

	public void setLocid(int locid) {
		this.locid = locid;
	}

	public int getEntid() {
		return entid;
	}

	public void setEntid(int entid) {
		this.entid = entid;
	}

	public Ent getEnt() {
		return ent;
	}

	public void setEnt(Ent ent) {
		this.ent = ent;
	}

	public int getShelfid() {
		return shelfid;
	}

	public void setShelfid(int shelfid) {
		this.shelfid = shelfid;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

}
