package com.gb.Service;


import com.gb.beans.POJO.Q_Menu;
import com.gb.beans.VO.PageMenuVO;

import java.util.Collection;
import java.util.List;

/**/
public interface QMenuService {
	/**
	 * 查询菜单数据
	 * @param lname 用户实体，用来查询不同用户的菜单
	 * @return
	 */
	 List<PageMenuVO> findMenu(String lname );
	
	/**
	 * 菜单转换
	 * @param menuData 原始的Menu数据模型集合
	 * @return 转换后的PageMenu页面模型集合
	 */
	 List<PageMenuVO> convertMenuToPageMenu(Collection<Q_Menu> menuData);
}
