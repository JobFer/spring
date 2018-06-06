package com.mitocode.beans8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MitoCodeBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Despues de inicializar: " + nombreBean);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Antes de inicializar: " + nombreBean);
		return bean;
	}

}
