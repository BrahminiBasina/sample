package com.test.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Product extends AuditLog{
	
	@Id
	@Column
	private Long productId;
	@Column
	private String productName;
	@Column
	private String description;
	@Column
	private int qtyAvailable;
	@Column
	private String currency;
	@Column
	private String price;
	@Column
	private String category;
	
   //@ColumnDefault("DEACTIVE")
   //@Pattern(regexp="(ACTIVE,DEACTIVE,SOLD)",message="Invalid value")
	public enum Statusvalue {ACTIVE,DEACTIVE,SOLD}
	@Column
	private Statusvalue status=Statusvalue.DEACTIVE;
	/*@PrePersist
	public void prePersist() {
	    if(status == null) 
	        status = Statusvalue.DEACTIVE;
	}*/
	@Column
	private String productOwner;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQtyAvailable() {
		return qtyAvailable;
	}
	public void setQtyAvailable(int qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public Statusvalue getStatus() {
		return status;
	}
	public void setStatus(Statusvalue status) {
		this.status = status;
	}
	
	

}
