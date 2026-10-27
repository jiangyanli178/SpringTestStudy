package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



//Lombok工具,省去写get和set的方法.

@RestController
@RequestMapping("/book")
//@Controller
//@ResponseBody
public class book {
//    @RequestMapping     映射
//    @RequestParam("xx")  required = false    重命名和设置为非必传
//    @RequestBody  传json
//    @RuquestPart  传文件
//    {"/m9/{userId}"}      @PathVariable  需要使用url内的路径作为要用的东西,而不是后面的参数

//    需求：写一个用户查询接口
//    实体 User：id (Long)、username (String)、age (Integer)、email (String)
//    接口：GET /user/list
//    功能：查询全部用户，返回统一 json
//    额外：再加一个接口 GET /user/{id} 根据 id 查单个用户
//    要求：
//    Controller、Service、Mapper 分层
//    返回统一结果类 Result
// 考察点：
//    Controller 接收路径变量、MP 查询、JSON 返回、分层结构
//    自测验证：Postman/ApiFox 发 GET 请求，看能不能拿到 json
    @RequestMapping("/getUser")
    public User getUser(@RequestBody User user){


        return user;
    }
}
