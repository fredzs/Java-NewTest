package com.free4lab.newtest.action.majors;

import org.apache.log4j.Logger;

import com.free4lab.newtest.action.base.BaseAction;
import com.free4lab.newtest.manager.MajorManager;

public class AddMajorAction extends BaseAction {

	/**
	 * 增加专业信息
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MajorListAction.class);
	
	private String zydm;
	private String zymc;
	
	public String execute() throws Exception{
		if(MajorManager.addMajor(zydm, zymc)){
			logger.info("test");
		}
		return SUCCESS;
	}

	public String getZydm() {
		return zydm;
	}

	public void setZydm(String zydm) {
		this.zydm = zydm;
	}

	public String getZymc() {
		return zymc;
	}

	public void setZymc(String zymc) {
		this.zymc = zymc;
	}
	
}
