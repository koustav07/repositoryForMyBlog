package com.org.coop.society.data.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.coop.society.data.admin.entities.BranchMaster;
import com.org.coop.society.data.admin.entities.CountryMaster;
import com.org.coop.society.data.admin.entities.DistrictMaster;
import com.org.coop.society.data.admin.entities.User;

public interface CountryMasterRepository extends JpaRepository<CountryMaster, Integer> {
	public CountryMaster findByCountryId(int countryId);
	public CountryMaster findByCountryCode(String countryCode);
}
