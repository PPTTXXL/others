package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 角色表实体类
 */
public class Role {
	/* 所有权限，1代表有此权限，0代表无此权限 */
	/**
	 * 角色编号
	 */
	private int roleid;
	/**
	 * 角色名称
	 */
	private String name;
	/**
	 * 员工管理权限
	 */
	private int empmanage;
	/**
	 * 角色管理权限
	 */
	private int rolemanage;
	/**
	 * 商户管理权限
	 */
	private int storemanage;
	/**
	 * 库位管理权限
	 */
	private int entrepotmanage;
	/**
	 * 库存管理权限
	 */
	private int repertorymanage;
	/**
	 * 财务管理权限
	 */
	private int financemanage;
	/**
	 * 订单管理权限
	 */
	private int indentmanage;
	/**
	 * 商品管理权限
	 */
	private int commoditymanage;
	/**
	 * 配送管理权限
	 */
	private int delivery;

	public Role() {
		super();
	}

	public Role(int roleid, String name, int empmanage, int rolemanage, int storemanage, int entrepotmanage,
			int repertorymanage, int financemanage, int indentmanage, int commoditymanage, int delivery) {
		super();
		this.roleid = roleid;
		this.name = name;
		this.empmanage = empmanage;
		this.rolemanage = rolemanage;
		this.storemanage = storemanage;
		this.entrepotmanage = entrepotmanage;
		this.repertorymanage = repertorymanage;
		this.financemanage = financemanage;
		this.indentmanage = indentmanage;
		this.commoditymanage = commoditymanage;
		this.delivery = delivery;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpmanage() {
		return empmanage;
	}

	public void setEmpmanage(int empmanage) {
		this.empmanage = empmanage;
	}

	public int getRolemanage() {
		return rolemanage;
	}

	public void setRolemanage(int rolemanage) {
		this.rolemanage = rolemanage;
	}

	public int getStoremanage() {
		return storemanage;
	}

	public void setStoremanage(int storemanage) {
		this.storemanage = storemanage;
	}

	public int getEntrepotmanage() {
		return entrepotmanage;
	}

	public void setEntrepotmanage(int entrepotmanage) {
		this.entrepotmanage = entrepotmanage;
	}

	public int getRepertorymanage() {
		return repertorymanage;
	}

	public void setRepertorymanage(int repertorymanage) {
		this.repertorymanage = repertorymanage;
	}

	public int getFinancemanage() {
		return financemanage;
	}

	public void setFinancemanage(int financemanage) {
		this.financemanage = financemanage;
	}

	public int getIndentmanage() {
		return indentmanage;
	}

	public void setIndentmanage(int indentmanage) {
		this.indentmanage = indentmanage;
	}

	public int getCommoditymanage() {
		return commoditymanage;
	}

	public void setCommoditymanage(int commoditymanage) {
		this.commoditymanage = commoditymanage;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

}
