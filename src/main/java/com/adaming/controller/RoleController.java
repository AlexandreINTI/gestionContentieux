package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.entity.Role;
import com.adaming.service.interfaces.IRoleService;

@Controller
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value="roles", method = RequestMethod.GET)
	public  List<Role> findAll(){
		return roleService.findAll(Role.class);
	}
}
