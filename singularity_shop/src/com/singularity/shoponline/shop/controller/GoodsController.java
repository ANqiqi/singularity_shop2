package com.singularity.shoponline.shop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.singularity.shoponline.entity.Goods;
import com.singularity.shoponline.shop.service.GoodsServiceImpl;

@Controller
@RequestMapping("Goods")
public class GoodsController {

	@Resource
	private GoodsServiceImpl goodsServiceImpl;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Goods> list=this.goodsServiceImpl.listAll();
		model.addAttribute("list", list);
		return "list";
	};
	
}
