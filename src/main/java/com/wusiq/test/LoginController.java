package com.wusiq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoginController {
	private Logger log = LoggerFactory.getLogger(LoginController.class);
  public static void main(String[] args) {
	  LoginController lc = new LoginController();
	  lc.asd();
}
  
  public void asd(){
	  log.info("信息打印");
	  log.debug("警告信息打印");
	  log.error("错误信息打印");
  }
}
