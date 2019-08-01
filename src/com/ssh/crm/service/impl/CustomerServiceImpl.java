package com.ssh.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.crm.dao.CustomerDao;
import com.ssh.crm.entity.Customer;
import com.ssh.crm.service.CustomerService;

//�ͻ�����ӿ�ʵ����

//��������ע�⣬���ڷ����
@Service("customerService")
// ��������ʹ��Ĭ������
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// ע��ͻ��־ò����
	@Resource(name = "customerDao")
	private CustomerDao customerDao;

	@Override
	public void save(Customer customer) {
		System.out.println("Service�е�save����ִ����");
        customerDao.save(customer);

	}

}
