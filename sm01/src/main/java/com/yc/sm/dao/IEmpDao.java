package com.yc.sm.dao;

import java.util.List;

import com.yc.sm.bean.Emp;

/**
 * 员工信息数据模型层接口
 * @author Administrator
 */
public interface IEmpDao {
	/**
	 * 添加员工信息
	 * @param emp
	 * @return
	 */
	public int add(Emp emp);
	
	/**
	 * 修改员工信息
	 * @param emp
	 * @return
	 */
	public int update(Emp emp);
	
	/**
	 * 查询所有员工信息
	 * @return
	 */
	public List<Emp> findAll();
	
	/**
	 * 根据部门信息查询员工信息
	 * @param deptno
	 * @return
	 */
	public List<Emp> findByDeptno(Integer deptno);
}
