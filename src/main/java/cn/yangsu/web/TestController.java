package cn.yangsu.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("tang")
public  class TestController {
	
	@RequestMapping("test")
	@ResponseBody
	private List<String> test() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		return list;

	}
	@RequestMapping("test2")
	private String test2() {
	
		return "indix";
		
	}
}
