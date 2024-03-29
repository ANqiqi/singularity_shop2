package com.singularity.shoponline.shop.dao;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.singularity.shoponline.entity.Goods;

@Repository
public class GoodsDaoImpl {

	
	@Resource
	private SessionFactory sessionFactory;
	public List<Goods> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from Goods");
		return q.list();
	}
}
