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

//客户Action

//控制器组件注解，用于Web层
@Controller("customerAction")
//Action是多例的，所以需要配置为Prototype范围
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Struts2的注解
//等价于Struts2配置文件中的package元素的extends属性
@ParentPackage("struts-default")
//等价于Struts2配置文件中的package元素的namespace属性
@Namespace("/customer")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

    // 注入客户服务对象
	@Resource(name = "customerService")
    private CustomerService customerService;
	
	 // 模型驱动对象
	private Customer customer = new Customer();
	
	
	
	@Override
	public Customer getModel() {
		return this.customer;
	}
	
	 // 等价于Struts2配置文件中的action元素的name属性和method属性的复合
    @Action("customer_save")
    public String save() {
        System.out.println("Action的Save方法执行了");
        customerService.save(customer);

        return NONE;
    }

}
