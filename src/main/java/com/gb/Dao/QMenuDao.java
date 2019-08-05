package com.gb.Dao;

import com.gb.beans.POJO.Q_Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("QMenuDao")
public interface QMenuDao {
	/**
	 * 查询全部菜单
	 * @return 集合
	 */
	 List<Q_Menu> findAll();
}
