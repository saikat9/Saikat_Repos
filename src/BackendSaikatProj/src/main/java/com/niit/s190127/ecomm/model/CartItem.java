package com.niit.s190127.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CartItem {
	
	@Id
	@GeneratedValue
	private int cartitemId;
	private String productName;
	private String productDesc;
	private int supplierId;
	private int categoryId;
	private int price;	
	private String supplierName;
	private String supplierAddr;
	private String categoryName;
	private String categoryDesc;
	/**
	 * @return the cartitemId
	 */
	public int getCartitemId() {
		return cartitemId;
	}
	/**
	 * @param cartitemId the cartitemId to set
	 */
	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	/**
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the supplierAddr
	 */
	public String getSupplierAddr() {
		return supplierAddr;
	}
	/**
	 * @param supplierAddr the supplierAddr to set
	 */
	public void setSupplierAddr(String supplierAddr) {
		this.supplierAddr = supplierAddr;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}
	/**
	 * @param categoryDesc the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

}
