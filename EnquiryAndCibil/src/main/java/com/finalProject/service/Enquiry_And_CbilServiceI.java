package com.finalProject.service;

import com.finalProject.model.Enquiry;

public interface Enquiry_And_CbilServiceI {

	Enquiry saveEnquiry(Enquiry e);

	void deleteRecord(String enquiryid);

}
