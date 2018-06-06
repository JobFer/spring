package com.mitocode.beans7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MitoCodeBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Despues de inicializar: " + arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Antes de inicializar: " + arg1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		return arg0;
	}

}
