package com.singularity.shoponline.dao;

import java.sql.Connection;

import com.singularity.shoponline.entity.Goods;
import com.singularity.shoponline.page.PageBean;

public class GoodsDaoImpl implements GoodsDao{

	@Override
	public PageBean<Goods> findByPage(int pc) {
		// TODO Auto-generated method stub
		int ps=3;
		int all=0;
		/*
		初始化当前页面记录数为ps 3
		要查询内容在数据库总数据数all为0
		下面sql语句
		select count（*）from student
		select * from student limit 1,3
		分别是获取all
		选取要分页显示的内容，显示3条记录，从第二条记录开始
		
		*/
		String sql="select count(*)from goods";
		
		
		
		
		return null;
	}

}
