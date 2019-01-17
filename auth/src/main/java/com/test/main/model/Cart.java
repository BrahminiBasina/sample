package com.test.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CompositeKey.class)
public class Cart extends AuditLog{
	
	@Id
	private Long productId;	
	@Id
	private Long userId;
	private String username;
	private String orderQty;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	

}
