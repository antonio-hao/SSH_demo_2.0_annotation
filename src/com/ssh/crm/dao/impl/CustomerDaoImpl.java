package com.ssh.crm.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ssh.crm.dao.CustomerDao;
import com.ssh.crm.entity.Customer;

//�ͻ��־ò�ӿ�ʵ����

//�־ò����ע�⣬���ڳ־ò�
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Resource(name = "hibernateTemplate")
	// ע��Hibernateģ��
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Customer customer) {
		System.out.println("Dao�е�save����ִ����");
		this.hibernateTemplate.save(customer);

	}

}
