package com.adaming.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.dao.impl.DaoGeneriqueImpl;
import com.adaming.utils.ServiceGenerique;

@Service
@Transactional
public class ServiceGeneriqueImpl<T> implements ServiceGenerique<T>{
	
	@Autowired
	@Qualifier("daogen")
	private DaoGeneriqueImpl<T> daogen;

}
