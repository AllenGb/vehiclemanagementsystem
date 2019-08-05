package com.gb.Service.impl;

import com.gb.Dao.QMenuDao;
import com.gb.Service.QMenuService;
import com.gb.beans.POJO.Q_Menu;
import com.gb.beans.VO.PageMenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("QMenuServiceImpl")
public class QMenuServiceImpl implements QMenuService {

    @Autowired
    private QMenuDao QMenuDao;


    public List<PageMenuVO> findMenu(String lname) {

        //总容器存放数据模型集合
        Collection<Q_Menu> menuData=null;

        if(lname.equals("admin")) {
            //管理员查询全部
            menuData=QMenuDao.findAll();
        }else {
            //非管理员查询对应权限过滤后的菜单
        }

        return convertMenuToPageMenu(menuData);
    }


    public List<PageMenuVO> convertMenuToPageMenu(Collection<Q_Menu> menuData) {
        List<PageMenuVO> pageMenuData=null;

        if(menuData !=null && menuData.size()>0) {
            //生成相同大小的容器
            pageMenuData=new ArrayList<PageMenuVO>(menuData.size());

            PageMenuVO pmvo=null;
            Map<String,String> attributes=null;

            for(Q_Menu menu:menuData) {
                pmvo=new PageMenuVO();

                /*转换开始*/
                pmvo.setId(menu.getId());//转换id
                pmvo.setPid(menu.getPid());//转换pid
                pmvo.setText(menu.getText());//转换text

                attributes =new HashMap<String,String>();//自定义属性容器
                attributes.put("url", menu.getUrl());//将url地址放入容器
                pmvo.setAttributes( attributes);
                /*转换结束*/

                pageMenuData.add(pmvo);
            }
        }

        return pageMenuData;
    }
}
