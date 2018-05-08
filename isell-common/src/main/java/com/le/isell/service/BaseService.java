package com.le.isell.service;

import com.le.isell.entity.BaseModel;

import java.util.List;

/**
 * Created by Administrator on 2018/5/7.
 */
public interface BaseService<T, QT extends BaseModel> {
    //保存
    public int create(T t);
    //修改
    public int update(T t);
    //删除
    public int delete(int uuid);

    //查询一个对象
    public T getByUuid(int uuid);
    //查询多个对象
    public List<T> getByConditionPage(QT qt);
}
