package com.web.model.business.service.impl;

import com.goclass.mapper.TbFifthResultMapper;
import com.goclass.pojo.TbFifthResult;
import com.web.model.business.service.FifthResultService;
import com.web.model.global.utils.BlobUtil;

import goclass.rpc.server.source.StageFiveResultOfClassStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FifthResultServiceImpl implements FifthResultService {


    @Autowired
    private TbFifthResultMapper tbFifthResultMapper;

    /**
     * 修改
     *
     * @param object
     */
    @Override
    public void update(Object object) {
        TbFifthResult fiveResult = new TbFifthResult();
        fiveResult.setFiveresultDatavalue(BlobUtil.setObject(object));
        fiveResult.setFiveresultId(1L);
        try {
            tbFifthResultMapper.updateByPrimaryKeyWithBLOBs(fiveResult);
            System.out.println("修改成功");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("修改失败");
        }
    }

    /**
     * 获取实体
     *
     * @return
     */
    @Override
    public Object findOne() {
        TbFifthResult fiveResult = tbFifthResultMapper.selectByPrimaryKey(1L);
        Object object = new Object();
        byte[] bytes = fiveResult.getFiveresultDatavalue();
        try{
            object = BlobUtil.getObject(bytes);
        }catch (Exception e){
            System.out.println("序列化失败");
        }
        System.out.println("获取成功");
        return object;
    }
}
