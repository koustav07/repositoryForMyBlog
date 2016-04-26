package com.org.coop.retail.service;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.coop.canonical.beans.UIModel;
import com.org.coop.retail.servicehelper.CustomerSetupServiceHelperImpl;

@Service
public class CustomerSetupServiceImpl {

	private static final Logger log = Logger.getLogger(CustomerSetupServiceImpl.class); 
	
	@Autowired
	private CustomerSetupServiceHelperImpl customerSetupServiceHelperImpl;
	
	public UIModel getCustomerAccounts(int branchId, int customerId, int accountId, String panNo, 
			String aadharNo, String mobileNo, Date startDate, Date endDate,int pageNo, int recordsPerPage) {
		return customerSetupServiceHelperImpl.getCustomerAccounts(branchId, customerId, accountId, panNo, aadharNo, mobileNo, startDate, endDate, pageNo, recordsPerPage);
	}
	
	public UIModel saveCustomerAccounts(UIModel uiModel) {
		customerSetupServiceHelperImpl.saveCustomerAccounts(uiModel);
		
		int pageNo = uiModel.getPageNo() == 0 ? 1 : uiModel.getPageNo();
		int recordsPerPage = uiModel.getRecordsPerPage() == 0 ? 100 : uiModel.getRecordsPerPage();
		return customerSetupServiceHelperImpl.getCustomerAccounts(uiModel.getBranchBean().getBranchId(), 0, 0, null, null, null, uiModel.getStartDate(), uiModel.getEndDate(), pageNo, recordsPerPage);
	}
	
	public UIModel deleteCustomerAccounts(UIModel uiModel) {
		return customerSetupServiceHelperImpl.deleteCustomerAccounts(uiModel);
	}
}
