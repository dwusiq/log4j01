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
	  log.info("一般消息");
	  log.debug("调试消息");
	  log.warn("警告消息");
	  log.error("错误消息");
  }
}
