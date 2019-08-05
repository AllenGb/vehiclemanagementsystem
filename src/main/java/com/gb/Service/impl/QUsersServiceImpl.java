package com.gb.Service.impl;

import com.gb.Dao.QUsersDao;
import com.gb.Service.QUsersService;
import com.gb.beans.POJO.Q_Users;
import com.gb.beans.VO.DataGridVO;
import com.gb.util.SysStr;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*业务实现层*/

@Service("QUsersService")
public class QUsersServiceImpl implements QUsersService {

    @Autowired
    private QUsersDao QUsersDao;



    @Override
    public Q_Users login(Q_Users qusers) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("uname", qusers.getLname());
        params.put("upass", qusers.getLpass());

        return QUsersDao.findByLogin(params);
    }

    @Override
    public DataGridVO<Q_Users> findByPage(Q_Users qusers) {
        DataGridVO<Q_Users> dgvo=null;

        Map<String,Object> params=new HashMap<String,Object>();

        //滤除管理员信息
        params.put("adminName", SysStr.adminName);

        //使用第三方插件分页
        PageHelper.startPage(qusers.getPage(), qusers.getRows());

        List<Q_Users> quList=QUsersDao.findByPage(params);

        if(quList !=null && quList.size()>0) {
            dgvo=new DataGridVO<Q_Users>();
            dgvo.setRows(quList);
            dgvo.setTotal(QUsersDao.count(params));
        }

        return dgvo;
    }

    public boolean add(Q_Users qusers) {
        return QUsersDao.add(qusers)>0?true:false;
    }
}
