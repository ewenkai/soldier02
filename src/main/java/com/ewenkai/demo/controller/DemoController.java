package com.ewenkai.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewenkai.demo.pojo.CstCustomer;

import com.ewenkai.demo.service.CustomerServcie;


@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private CustomerServcie customerServcie;
	
	@RequestMapping("/demo1")
	public String demo() {
		return "你好";
	}
	@RequestMapping("/findAll")
	public List<CstCustomer> findAll() {
		List<CstCustomer> list=customerServcie.findAll();
		return list;
	}
}
