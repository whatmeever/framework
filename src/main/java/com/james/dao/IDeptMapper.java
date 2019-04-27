package com.james.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.james.pojo.Dept;

@Mapper
public interface IDeptMapper {

	@Select("select * from dept")
	List<Dept> getAllDept();
}
