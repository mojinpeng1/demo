package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.example.demo.excelmodel.TestModel;
import com.example.demo.excelmodel.TestModelListener;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author mojinpeng
 * @version 1.0
 * @date 2019/11/19 8:09
 */
@RestController
@RequestMapping(value = "/demo")
@Api(tags = "测试")
public class DemoController {
    @GetMapping(value = "/hello")
    public String hello(){
        String json = "hello spring boot";
        return  json;
    }

    Logger logger    = LoggerFactory.getLogger(this.getClass());
    @PutMapping(value = "/importExcel")
    public void importExcel(@RequestParam MultipartFile excelFile,@RequestParam String type) throws IOException {
        List<Object> dataList = null;
        EasyExcel.read(excelFile.getInputStream(), TestModel.class,new TestModelListener()).sheet().doRead();

    }
}
