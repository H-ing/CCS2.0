package com.web.model.business.service;

public interface FifthResultService {
    /**
     * 更新
     * @param object
     */
    public void update(Object object);


    /**
     * 获取实体
     * @return
     */
    public Object findOne();
    
    public Object getKeBiao();
    
    public void setKeBiao(Object object);
}
