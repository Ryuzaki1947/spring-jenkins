package com.sg.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application { 
	static final Logger logger=LoggerFactory.getLogger(Application.class);
	public static void main(String [] args) {
//		logger.info("HEY2");
		logger.info("info msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.debug("debug msg");
//		System.out.println("Hey");
	}

}
