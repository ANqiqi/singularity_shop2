package com.singularity.shoponline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoppingCart")
public class shoppingCart {
	private int customerId;
	private int goodsId;
	private int paySum;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
