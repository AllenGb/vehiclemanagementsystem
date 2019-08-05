package com.gb.Dao;

import com.gb.beans.POJO.Q_Users;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/* 数据访问层*/
@Repository("QUsersDao")
public interface QUsersDao {
    /**
     * 登录
     * @param params 参数
     * @return Q_Users
     */
     Q_Users findByLogin(Map<String,Object> params);

    /**
     * 按条件分页查询
     * @param params 条件容器
     * @return 集合
     */
     List<Q_Users> findByPage(Map<String,Object> params);

    /**
     * 查询总数
     * @param params 条件容器
     * @return 总数
     */
     long count(Map<String,Object> params);

    /**
     * 新增
     * @param qusers 实体
     * @return 受影响的行数
     */
     int add(Q_Users qusers);
}
