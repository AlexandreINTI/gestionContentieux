package com.adaming.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.utils.DaoGenerique;

@Repository("daogen")
public class DaoGeneriqueImpl<T> implements DaoGenerique<T>{
	
	@Autowired
	private SessionFactory sessionfactory;

	public void create(T o) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T o) {
		// TODO Auto-generated method stub
		
	}

	public void update(T o) {
		// TODO Auto-generated method stub
		
	}

	public List<T> findAll(Class<T> o) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOne(Class<T> o, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
