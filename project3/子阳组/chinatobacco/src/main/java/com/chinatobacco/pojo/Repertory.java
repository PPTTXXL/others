package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 库存表实体类
 */
public class Repertory {
	/**
	 * 库存编号
	 */
	private int id;
	/**
	 * 商品编号
	 */
	private int comid;
	/**
	 * 商品对象
	 */
	private Commodity commodity;
	/**
	 * 库存数量
	 */
	private int num;
	/**
	 * 库位编号
	 */
	private int locid;
	/**
	 * 库位对象
	 */
	private Location location;

	public Repertory() {
		super();
	}

	public Repertory(int id, int comid, Commodity commodity, int num, int locid, Location location) {
		super();
		this.id = id;
		this.comid = comid;
		this.commodity = commodity;
		this.num = num;
		this.locid = locid;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getLocid() {
		return locid;
	}

	public void setLocid(int locid) {
		this.locid = locid;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
