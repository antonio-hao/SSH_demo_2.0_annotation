package com.ssh.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.crm.dao.CustomerDao;
import com.ssh.crm.entity.Customer;
import com.ssh.crm.service.CustomerService;

//客户服务接口实现类

//服务层组件注解，用于服务层
@Service("customerService")
// 配置事务，使用默认配置
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// 注入客户持久层对象
	@Resource(name = "customerDao")
	private CustomerDao customerDao;

	@Override
	public void save(Customer customer) {
		System.out.println("Service中的save方法执行了");
        customerDao.save(customer);

	}

}
