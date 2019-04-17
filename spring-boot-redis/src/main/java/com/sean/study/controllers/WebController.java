package com.sean.study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**     
  * java类简单作用描述
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/19 23:58
  * @version:  1.0 2018/3/19
* */
@Controller
@RequestMapping(value = "/web")
public class WebController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.put("title", "freemarker hello word");
        return "index"; // 开头不要加上/，linux下面会出错
    }

    @RequestMapping(value = "/error")
    public String error(ModelMap map) {
        throw new RuntimeException("测试异常");
    }

}
