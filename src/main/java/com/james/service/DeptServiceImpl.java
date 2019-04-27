package com.james.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.dao.IDeptMapper;
import com.james.pojo.Dept;

@Service
public class DeptServiceImpl implements  IDeptService{
	
	@Autowired
	private IDeptMapper deptDao;

	@Override
	public List<Dept> getAllDept(){
		return deptDao.getAllDept();
	}
}
