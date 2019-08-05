package com.gb.controller;


import com.gb.Service.DrivingRecordService;
import com.gb.beans.POJO.DrivingRecord;
import com.gb.beans.VO.DataGridVO;
import com.gb.util.JSONTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller("DrivingRecordController")
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("api/DrivingRecord")
public class DrivingRecordController {

    @Autowired
    private DrivingRecordService DrivingRecordService;


    //通过ID查询出车信息
    @RequestMapping("findDrivingRecById")
    @ResponseBody
    public String findDrivingRecById(int id) {
        return JSONTool.writeJson(DrivingRecordService.findDrivingRecById(id));

    }

    //查询所有出车信息
    @RequestMapping(value="findDrivingRecDG")
    @ResponseBody
    public String findDrivingRecDG(DrivingRecord dr) {

            return JSONTool.writeJson(DrivingRecordService.findDrivingRecDataGrid(dr));


    }
}
