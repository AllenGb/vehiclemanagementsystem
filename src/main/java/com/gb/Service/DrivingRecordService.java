package com.gb.Service;

import com.gb.beans.POJO.DrivingRecord;

import com.gb.beans.VO.DataGridVO;

public interface DrivingRecordService {

    /***
     * 按照ID查询出车信息
     * @param id ID
     * @return 出车信息实体
     */
     DrivingRecord findDrivingRecById(int id);

    /***
     * 查询出车信息
     * @param dr 实体
     * @return 数据容器
     */
     DataGridVO<DrivingRecord> findDrivingRecDataGrid(DrivingRecord dr);
}
