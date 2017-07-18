package com.jyc.mw.controller;

import com.jyc.mw.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by daniel on 2017/7/9.
 * <p>
 * http://localhost:8080/home/index
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@RestController
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public String index() {
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
//    public ResponseEntity<String> testString(@PathVariable Long id) {
//        return new ResponseEntity<String>(String.valueOf(id), HttpStatus.OK);
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserModel testModel(@PathVariable Long id) {
        UserModel userModel = new UserModel();
        userModel.setId(123l);
        userModel.setName("daniel");
        return userModel;
    }
}
