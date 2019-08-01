package com.ssh.crm.web.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.crm.entity.Customer;
import com.ssh.crm.service.CustomerService;

//�ͻ�Action

//���������ע�⣬����Web��
@Controller("customerAction")
//Action�Ƕ����ģ�������Ҫ����ΪPrototype��Χ
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Struts2��ע��
//�ȼ���Struts2�����ļ��е�packageԪ�ص�extends����
@ParentPackage("struts-default")
//�ȼ���Struts2�����ļ��е�packageԪ�ص�namespace����
@Namespace("/customer")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

    // ע��ͻ��������
	@Resource(name = "customerService")
    private CustomerService customerService;
	
	 // ģ����������
	private Customer customer = new Customer();
	
	
	
	@Override
	public Customer getModel() {
		return this.customer;
	}
	
	 // �ȼ���Struts2�����ļ��е�actionԪ�ص�name���Ժ�method���Եĸ���
    @Action("customer_save")
    public String save() {
        System.out.println("Action��Save����ִ����");
        customerService.save(customer);

        return NONE;
    }

}
