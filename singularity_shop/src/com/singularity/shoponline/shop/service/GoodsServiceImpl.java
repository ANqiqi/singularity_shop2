package com.singularity.shoponline.shop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.singularity.shoponline.entity.Goods;
import com.singularity.shoponline.shop.dao.GoodsDaoImpl;

@Service
@Transactional(readOnly=true)
public class GoodsServiceImpl {

	
	@Resource
	private GoodsDaoImpl goodsDaoImpl;
	public List<Goods> listAll(){
		
		return this.goodsDaoImpl.findAll();
	}
	
}
