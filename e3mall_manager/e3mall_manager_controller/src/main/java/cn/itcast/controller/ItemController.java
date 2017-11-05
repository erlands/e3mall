package cn.itcast.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.domain.TbItem;
import cn.itcast.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		System.err.println("-------------------->");
		return "sb";
	}
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	@RequestMapping("/findById/{itemId}")
	@ResponseBody
	public TbItem findById(@PathVariable("itemId") Long itemId){
		return itemService.findItemById(itemId);
	}
	
}
