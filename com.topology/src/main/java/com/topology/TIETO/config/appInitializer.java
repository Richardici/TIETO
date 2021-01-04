package com.topology.TIETO.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class appInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
	
 
	@Override
	protected Class < ? > [] getServletConfigClasses() {
		return new Class[] { webMVCconfig.class };
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
 
}