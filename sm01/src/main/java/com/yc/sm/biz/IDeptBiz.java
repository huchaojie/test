package com.yc.sm.biz;

import java.util.List;

import com.yc.sm.bean.Dept;

public interface IDeptBiz {
	/**
	 * 添加部门信息
	 * @param dept
	 * @return
	 */
	public int add(Dept dept);

	/**
	 * 修改部门信息
	 * @param dept
	 * @return
	 */
	public int update(Dept dept);

	/**
	 * 查询所有部门信息
	 * @return
	 */
	public List<Dept> findAll();
}
