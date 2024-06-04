package com.finalProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.model.Enquiry;
import com.finalProject.repo.EnquiryRepo;
import com.finalProject.service.Enquiry_And_CbilServiceI;

@Service
public class Enquiry_Cibil_ServiceImpl implements Enquiry_And_CbilServiceI{
	
	@Autowired
	EnquiryRepo er;

	@Override
	public Enquiry saveEnquiry(Enquiry e) {
		er.save(e);
		return e;
	}

}
