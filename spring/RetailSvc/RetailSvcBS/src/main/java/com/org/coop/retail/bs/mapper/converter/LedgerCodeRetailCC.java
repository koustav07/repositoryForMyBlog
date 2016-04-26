package com.org.coop.retail.bs.mapper.converter;

import org.dozer.CustomConverter;
import org.dozer.DozerConverter;
import org.dozer.Mapper;
import org.dozer.MapperAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.coop.canonical.account.beans.LedgerCodeRetailPurchaseBean;
import com.org.coop.retail.entities.LedgerCodeRetailPurchase;
import com.org.coop.retail.entities.MaterialGroup;
import com.org.coop.retail.entities.VendorMaster;
import com.org.coop.retail.repositories.RetailMaterialGroupMasterRepository;
import com.org.coop.retail.repositories.RetailVendorMasterRepository;

@Component("ledgerCodeRetailCC")
public class LedgerCodeRetailCC extends DozerConverter<LedgerCodeRetailPurchaseBean, LedgerCodeRetailPurchase> implements MapperAware, CustomConverter {
	@Autowired
	private RetailMaterialGroupMasterRepository retailMaterialGroupMasterRepository;
	
	@Autowired
	private RetailVendorMasterRepository retailVendorMasterRepository;
	
	
	public LedgerCodeRetailCC() {
		super(LedgerCodeRetailPurchaseBean.class, LedgerCodeRetailPurchase.class);
	}
	
	public LedgerCodeRetailCC(Class prototypeA, Class prototypeB) {
		super(prototypeA, prototypeB);
	}
	
	public void setMapper(Mapper arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LedgerCodeRetailPurchaseBean convertFrom(LedgerCodeRetailPurchase src, LedgerCodeRetailPurchaseBean dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LedgerCodeRetailPurchase convertTo(LedgerCodeRetailPurchaseBean src, LedgerCodeRetailPurchase dest) {
		// TODO Auto-generated method stub
		if(src != null) {
			MaterialGroup materialGrp = retailMaterialGroupMasterRepository.findOne(src.getMaterialGrpId());
			VendorMaster vendor = retailVendorMasterRepository.findOne(src.getVendorId());
			
			dest.setMaterialGroup(materialGrp);
			dest.setVendorMaster(vendor);
		}
		return dest;
	}
}
