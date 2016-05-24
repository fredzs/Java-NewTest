package com.free4lab.newtest.dao;

import java.util.List;

import com.free4lab.utils.sql.AbstractDAO;
import com.free4lab.utils.sql.IEntityManagerHelper;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;

public class MajorDAO extends AbstractDAO<Major> {
	//property constants
	public static final String ZYMC = "zymc";

	@Override
	public Class getEntityClass() {
		return Major.class;
	}

	@Override
	public IEntityManagerHelper getEntityManagerHelper() {
		return new NoCacheEntityManagerHelper();
	}

	@Override
	public String getPUName() {
		return "VMC_PU";
	}

	public List<Major> findByZymc(Object zymc
	) {
		return findByProperty(ZYMC, zymc
		);
	}
}