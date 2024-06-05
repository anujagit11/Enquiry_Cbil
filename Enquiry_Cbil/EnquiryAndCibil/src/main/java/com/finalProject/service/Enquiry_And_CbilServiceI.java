package com.finalProject.service;

import java.util.List;

import com.finalProject.model.Enquiry;

public interface Enquiry_And_CbilServiceI {

	Enquiry saveEnquiry(Enquiry e);

	Enquiry getSingleEnquiry(String enquiryid);
	
	void deleteRecord(String enquiryid);

	List<Enquiry> getAllEnquiryData();

	public void UpdateRecord(Enquiry e, String enquiryid);

	void deleteAll();

}
