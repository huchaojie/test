package com.yc.sm.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.sm.bean.Dept;
import com.yc.sm.biz.IDeptBiz;
import com.yc.sm.dao.IDeptDao;

/**
 * 部门信息业务模型层实现类
 * @author Administrator
 */
@Service
public class DeptBizImpl implements IDeptBiz{
	@Autowired
	private IDeptDao deptDao;
	
	@Override
	public int add(Dept dept) {
		return deptDao.add(dept);
	}

	@Override
	public int update(Dept dept) {
		return deptDao.update(dept);
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
