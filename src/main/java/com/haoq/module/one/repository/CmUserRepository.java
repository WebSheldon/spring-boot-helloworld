package com.haoq.module.one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.haoq.module.one.bean.CmUser;

public interface CmUserRepository extends CrudRepository<CmUser, String> {
	
	@Query(value = "from CmUser")
	public List<CmUser> findAll();
	
	public CmUser findByLoginName(String loginName);
	
	
}
