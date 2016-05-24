package com.free4lab.newtest.action.majors;

import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.newtest.action.base.BaseAction;
import com.free4lab.newtest.dao.Major;
import com.free4lab.newtest.manager.MajorManager;

public class MajorListAction extends BaseAction {

	/**
	 * 显示专业信息
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MajorListAction.class);
	
	private List<Major> majors;
	
	public String execute() throws Exception{
		majors = MajorManager.getAllMajors();
		logger.info(getSessionUserEmail());
		logger.info("test");
		return SUCCESS;
	}

	public List<Major> getMajors() {
		return majors;
	}

	public void setMajors(List<Major> majors) {
		this.majors = majors;
	}
	
}
