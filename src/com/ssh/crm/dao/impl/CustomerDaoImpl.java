package com.ssh.crm.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ssh.crm.dao.CustomerDao;
import com.ssh.crm.entity.Customer;

//客户持久层接口实现类

//持久层组件注解，用于持久层
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Resource(name = "hibernateTemplate")
	// 注入Hibernate模板
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Customer customer) {
		System.out.println("Dao中的save方法执行了");
		this.hibernateTemplate.save(customer);

	}

}
