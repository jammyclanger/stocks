package com.stoxs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stoxs.impl.StoxsImpl;

@RestController
public class StoxsController {
	
	@Autowired
	private StoxsImpl stoxsImpl;
	
    @RequestMapping("/")
    public String index() {
    	return stoxsImpl.getGuardianNews("oil");
    }
}
