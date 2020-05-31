package com.hc.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/aop")
public class WebController {

    @RequestMapping("/fun")
    public Date fun() {
        return new Date();
    }

    @RequestMapping("/fun1")
    public String fun1(@RequestParam Integer deptno, @RequestParam String dname, @RequestParam String loc) {
        System.out.println(deptno + " " + dname + " " + loc);
        return deptno + " " + dname + " " + loc;
    }

    @RequestMapping("/fun21")
    public String fun21(String key) {
        return "key=: " + key;
    }

    @RequestMapping("/fun22")
    public Integer fun22(Integer key) {
        return key;
    }

    @RequestMapping("/fun3")
    public String fun3(String key) {
        throw new NullPointerException();
    }

    @RequestMapping("/fun41")
    public String fun41(String key) {
        throw new NullPointerException();
    }

    @RequestMapping("/fun42")
    public String fun42(String key) {
        return key;
    }

    @RequestMapping("/fun5")
    public int fun5(int num1, int num2) {
        return num1 + num2;
    }
}  