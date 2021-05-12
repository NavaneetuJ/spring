package com.javapoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructor.injection.Employee;  

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  

		Student student=(Student)factory.getBean("studentbean");  
		student.displayInfo();  
	} 

}


