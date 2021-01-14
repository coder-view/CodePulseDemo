package com.codepulse.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class CodePulseController {
	
	@RequestMapping(value="getdate",method=RequestMethod.GET)
	public String getDateTime() {
		//
		Date date =new Date();
		SimpleDateFormat df=new SimpleDateFormat("YYYYMMDDHHMMSS");
		return df.format(date);
	}

}
