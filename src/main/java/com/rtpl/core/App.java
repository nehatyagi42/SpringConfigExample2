package com.rtpl.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rtpl.config.AppConfig;

public class App {

	
public static void main(String[] args) {
	ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	CustomerBo customer=(CustomerBo) context.getBean("customer");
	customer.printMessage(">>>>>>My Customer Configuration Successfully Printed>>>>>>>>>>>");
	SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
	scheduler.printMessage(">>>>>>My Scheduler Configuration Successfully Printed>>>>>>>>>>>");
	
	
}
}
