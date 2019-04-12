package com.ewenkai.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/demo1")
	public String demo() {
		return "你好";
	}
}
