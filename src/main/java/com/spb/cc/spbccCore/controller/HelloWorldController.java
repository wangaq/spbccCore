package com.spb.cc.spbccCore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spb.cc.spbccCore.service.ChannelService;

/**
 * 测试
 * @author wangaq
 * 
 */
@RestController
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Autowired
	private ChannelService channelService;
	
	@RequestMapping("/")
	public String sayHe() {
		return "say he he";
	}
	
	@RequestMapping("/List")
	public String getList() {
		System.out.println("-----------------------1");
		logger.info("获取数据：", channelService.getChannelList());
		System.out.println(channelService.getChannelList());
		System.out.println("-----------------------2");
		logger.debug("Logger Level ：DEBUG");
        logger.info("Logger Level ：INFO");
        logger.error("Logger Level ：ERROR");
		return "LIST";
	}

}
