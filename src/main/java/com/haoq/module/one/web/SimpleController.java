package com.haoq.module.one.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haoq.module.one.bean.CmUser;
import com.haoq.module.one.repository.CmUserRepository;

@Controller
public class SimpleController {
	
	@Autowired
	private CmUserRepository cmUserRepository;
	
	@RequestMapping(value = "/user/{loginName}")
	public ModelAndView login(@PathVariable("loginName") String loginName, ModelAndView modelAndView) {
		System.out.println(loginName);
		CmUser user = cmUserRepository.findByLoginName(loginName);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/one");
        return modelAndView;
    }
	
}
