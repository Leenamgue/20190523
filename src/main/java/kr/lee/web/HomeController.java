package kr.lee.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller    //인젝트   주입한다?
@RequestMapping("/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@RequestMapping("/select")  //get .post방식둘다사용
	public String select() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		return "home";
	}
	
	@RequestMapping("/insert")  //get .post방식둘다사용
	public String insert() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		return "ii";
	
	}
	@RequestMapping("/update")  //get .post방식둘다사용
	public String update() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		return "iii";
	}
	@RequestMapping("/delete")  //get .post방식둘다사용
	public String delete() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		return "iii";
	}
}
