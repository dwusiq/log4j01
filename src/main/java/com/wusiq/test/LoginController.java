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
	  log.info("��Ϣ��ӡ");
	  log.debug("������Ϣ��ӡ");
	  log.error("������Ϣ��ӡ");
  }
}
