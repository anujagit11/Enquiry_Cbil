package com.finalProject.service;

import java.util.List;

import com.finalProject.model.Enquiry;

public interface Enquiry_And_CbilServiceI {

	Enquiry saveEnquiry(Enquiry e);

	List<Enquiry> findAllData();

	Enquiry updateEnquiry(String enquiryid, Enquiry enquiry);

}
