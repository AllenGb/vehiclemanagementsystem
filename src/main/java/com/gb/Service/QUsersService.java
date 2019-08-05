package com.gb.Service;

import com.gb.beans.POJO.Q_Users;
import com.gb.beans.VO.DataGridVO;


/*用户业务逻辑接口*/
public interface QUsersService {


        /**
         * 登录
         * @param qusers 参数实体
         * @return
         */
        Q_Users login(Q_Users qusers);

        /**
         * 分页查询
         * @param qusers 条件容器
         * @return 集合
         */
         DataGridVO<Q_Users> findByPage(Q_Users qusers);

        /**
         * 新增
         * @param qusers 参数实体
         * @return 大于0返回true，否则返回false
         */
         boolean add(Q_Users qusers);

}
