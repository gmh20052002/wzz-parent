package com.gmh.wzz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmh.wzz.api.WzzService;
import com.gmh.wzz.api.model.TbWzzInfo;
import com.gmh.wzz.api.model.TbWzzWifi;


@Controller
@RequestMapping("/wzz")
public class MainController {
	@Autowired
	WzzService wzzService;

    @RequestMapping(value="/publishInfo", method=RequestMethod.POST)
	public @ResponseBody Object publishInfo(TbWzzInfo info, HttpServletRequest request,HttpServletResponse response){
    	String token = request.getHeader("token");
    	String result = wzzService.publishInfo(info);
		return result;
	}
	
    @RequestMapping(value="/shareWifi", method=RequestMethod.POST)
	public @ResponseBody Object sharedWifi(TbWzzWifi wifi, HttpServletRequest request,HttpServletResponse response){
    	String result = wzzService.shareWifi(wifi);
		return result;
	}
    
}
