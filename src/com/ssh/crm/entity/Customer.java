package com.ssh.crm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//�ͻ�ʵ����

//����Ϊʵ����
@Entity
//���ö�Ӧ�ı���
@Table(name = "cst_customer")
public class Customer implements Serializable{
	
	// ����ID������
    @Id
    // �����������ɲ���Ϊ�ɵײ����ݿ�����
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // �������ݿ����ֶε����ֵ�����
    @Column(name = "cust_id")
    private Long custId; // �ͻ����(����)
    @Column(name = "cust_name")
    private String custName; // �ͻ�����(��˾����)
    @Column(name = "cust_phone")
    private String custPhone; // �̶��绰
    @Column(name = "cust_mobile")
    private String custMobile; // �ƶ��绰
    
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
