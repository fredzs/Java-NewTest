package com.free4lab.newtest.manager;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.newtest.dao.Major;
import com.free4lab.newtest.dao.MajorDAO;


public class MajorManager {

	/*
	 * 
	 */
	private static MajorDAO majorDAO = new MajorDAO();
	private static final Logger LOGGER = Logger.getLogger(MajorManager.class);
	
	public static List<Major> getAllMajors() {
		try{
			return majorDAO.findAll();
		}catch (Exception e) {
			LOGGER.debug(e);
			return Collections.emptyList();
		}
	}

	public static boolean updateMajor(int id, String zydm, String zymc) {
		Major major = majorDAO.findById(id);
		major.setZydm(zydm);
		major.setZymc(zymc);
		try{	
			majorDAO.update(major);
			return true;
		}catch (Exception e) {
			LOGGER.debug(e);
			return false;
		}
	}

	public static boolean addMajor(String zydm, String zymc) {
		Major major = new Major(zydm, zymc);
		try{	
			majorDAO.save(major);
			return true;
		}catch (Exception e) {
			LOGGER.debug(e);
			return false;
		}
	}
	
	public static boolean delMajor(int id) {
		try{	
			majorDAO.deleteByPrimaryKey(id);
			return true;
		}catch (Exception e) {
			LOGGER.debug(e);
			return false;
		}
	}
}
