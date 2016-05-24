package com.free4lab.newtest.action.majors;

import org.apache.log4j.Logger;

import com.free4lab.newtest.action.base.BaseAction;
import com.free4lab.newtest.manager.MajorManager;

public class DelMajorAction extends BaseAction {

	/**
	 * 删除专业信息
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MajorListAction.class);
	
	private int id;
	private String result = "fail";
	
	public String execute() throws Exception{
		if(MajorManager.delMajor(id)){
			this.result = "success";
			logger.info("test");
		}
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
