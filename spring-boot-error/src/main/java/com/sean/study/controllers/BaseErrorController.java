package com.sean.study.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
  * java异常类处理
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/20 19:34
  * @version:  1.0 2018/3/20
* */
@Controller
@RequestMapping(value = "/error")
public class BaseErrorController implements ErrorController {

	private static final Logger logger = LoggerFactory.getLogger(BaseErrorController.class);

	@Override
	public String getErrorPath() {
		logger.info("出错啦！进入自定义错误控制器");
		return "comm/error";
	}

	@RequestMapping
	public String error() {
		return getErrorPath();
	}

}
