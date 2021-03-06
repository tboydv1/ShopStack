package com.shopstack.service.businessuser;

import com.shopstack.entities.business.Business;
import com.shopstack.entities.user.BusinessUser;
import com.shopstack.entities.user.VerificationToken;

public interface BussinessUserService {

	public void createVerificationTokenForUser(final BusinessUser businessUser, final String token);
	
	public VerificationToken getUserVerificationToken(String token);
	
	public BusinessUser registerNewUserAccount(BusinessUser businessUser, String role) throws EmailExistsException;
	
	
	
}
