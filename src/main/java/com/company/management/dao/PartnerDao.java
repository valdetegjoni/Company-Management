package com.company.management.dao;

import com.company.management.model.Partner;
import com.company.management.model.PartnerService;
import com.company.management.model.ServiceOffered;

public interface PartnerDao {

	public void provideService(PartnerService ps);
	public Partner insertPartner(Partner partner);
	public Partner validatePartner(Partner partner);
	public void requestInvoice(ServiceOffered so);
	public void updateServiceOffered(PartnerService ps);
	public void insertServiceOffered(ServiceOffered so);
	public void deleteServiceOffered(PartnerService ps);
	

}
