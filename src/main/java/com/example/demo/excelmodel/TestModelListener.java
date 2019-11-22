package com.example.demo.excelmodel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;


/**
 * @author mojinpeng
 * @version 1.0
 * @date 2019/11/22 13:25
 */
public class TestModelListener extends AnalysisEventListener<TestModel> {

    private  static final Logger LOGGER = LoggerFactory.getLogger(TestModelListener.class);

    // 设置缓存超
    private  static  final int BATCH_COUNT = 10;

    // 解析的数据存放
    List<TestModel> list = new ArrayList<>();
    @Override
    public void invoke(TestModel testModel, AnalysisContext analysisContext) {
        LOGGER.info("解析一条信息：{}", JSON.toJSONString(testModel));
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
