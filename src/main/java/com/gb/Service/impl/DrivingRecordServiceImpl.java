package com.gb.Service.impl;

import com.gb.Dao.DrivingRecordDao;
import com.gb.Service.DrivingRecordService;
import com.gb.beans.POJO.DrivingRecord;

import com.gb.beans.VO.DataGridVO;
import com.gb.util.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("DrivingRecordServiceImpl")
public class DrivingRecordServiceImpl implements DrivingRecordService {

    @Autowired
    private DrivingRecordDao drivingRecordDao;


    @Override
    public DrivingRecord findDrivingRecById(int id) {
        return drivingRecordDao.findDrivingRecordById(id);
    }

    @Override
    public DataGridVO<DrivingRecord> findDrivingRecDataGrid(DrivingRecord dr) {
        DataGridVO<DrivingRecord> dg_dr=new DataGridVO<DrivingRecord>();
        Map<String,Object> drMap=new HashMap<String,Object>();
        Page page=new Page(dr.getPage(),dr.getRows());
        drMap.put("begin", page.getBegin());
        drMap.put("end", page.getEnd());
        if(dr.getCar()!=null && dr.getCar().getCarNo()!=null){
            drMap.put("drCarNo", "%"+dr.getCar().getCarNo()+"%");
        }


        //Long count=findDrivingRecCount(dr,u);
        List<DrivingRecord> ldr=drivingRecordDao.findDrivingRecDataGrid(drMap);

        if(ldr!=null){
            Long count=(long) ldr.size();
            dg_dr.setRows(ldr);
            dg_dr.setTotal(count);
        }
        return dg_dr;
    }


}
