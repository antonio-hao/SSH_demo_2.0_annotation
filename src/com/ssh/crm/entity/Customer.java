package com.ssh.crm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//客户实体类

//配置为实体类
@Entity
//配置对应的表名
@Table(name = "cst_customer")
public class Customer implements Serializable{
	
	// 配置ID，主键
    @Id
    // 配置主键生成策略为由底层数据库生成
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 配置数据库中字段的名字等属性
    @Column(name = "cust_id")
    private Long custId; // 客户编号(主键)
    @Column(name = "cust_name")
    private String custName; // 客户名称(公司名称)
    @Column(name = "cust_phone")
    private String custPhone; // 固定电话
    @Column(name = "cust_mobile")
    private String custMobile; // 移动电话
    
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	
	 @Override
	    public String toString() {
	        return "Customer{" +
	                "custId=" + custId +
	                ", custName='" + custName + '\'' +
	                ", custPhone='" + custPhone + '\'' +
	                ", custMobile='" + custMobile + '\'' +
	                '}';
	    }

}
