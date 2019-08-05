package com.gb.Dao;


import com.gb.beans.POJO.DrivingRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("DrivingRecordDao")
public interface DrivingRecordDao {

    //通过id查询出车信息
    DrivingRecord findDrivingRecordById(int id);

    //查询所有出车信息，带分页和模糊查询
    List<DrivingRecord> findDrivingRecDataGrid(Map<String,Object> drMap);

    //查询出车总数，带模糊查询
    //  Long findDrivingRecordCount( Map<String,Object> drMap);
    /*
    //查询出车总数，带模糊查询
     Long findDrivingRecCount( Map<String,Object> drMap);


    //新增
     int addDrivingRecord(DrivingRecord dr);
    //回车修改
     int backDrivingRecord(DrivingRecord dr);
    //修改
     int updDrivingRecord(DrivingRecord dr);
    //删除
     int delDrivingRecord(DrivingRecord dr);
*/


}
