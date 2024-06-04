package com.finalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.service.Enquiry_And_CbilServiceI;


@RestController
public class EnquiryController {
	
	@Autowired
	Enquiry_And_CbilServiceI es;

}
