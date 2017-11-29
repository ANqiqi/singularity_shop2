package com.singularity.shoponline.dao;

import com.singularity.shoponline.entity.Goods;
import com.singularity.shoponline.page.PageBean;

public interface GoodsDao {
/*
	写一个接口，方法是通过页码查询内容
*/
	public PageBean<Goods>findByPage(int pc);
	
	
}
