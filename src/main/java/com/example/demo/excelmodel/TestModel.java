package com.example.demo.excelmodel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Excel导入对应实体类
 * @author mojinpeng
 * @version 1.0
 * @date 2019/11/20 13:56
 */
@Data

public class TestModel  implements Serializable {

    @ExcelIgnore
    private  Integer id;

    @ExcelProperty(value = "类型", index = 0)
    private  String type;

    @ExcelProperty(value = "金额",index = 1)
    private  String sum;

    @ExcelProperty(value = "来源", index = 2)
    private  String name;

    @ExcelProperty(value = "日期", index = 3)
    private  String date;

    @ExcelProperty(value = "状态", index = 4)
    private  String status;

    @ExcelProperty(value = "备注",index = 5)
    private String descr;
}
