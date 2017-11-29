package com.singularity.shoponline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class orders {
	private int ordertype;
	private int customerId;
	private int goodsId;
	private int paySum;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(int ordertype) {
		this.ordertype = ordertype;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getPaySum() {
		return paySum;
	}
	public void setPaySum(int paySum) {
		this.paySum = paySum;
	}
	
}
