package com.le.isell.service.impl;

import com.le.isell.dao.BaseDao;
import com.le.isell.entity.BaseModel;
import com.le.isell.service.BaseService;
import com.le.isell.util.pageutil.Page;

import java.util.List;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BaseServiceImpl<T, QT extends BaseModel> implements BaseService<T, QT> {
    private BaseDao baseDao = null;
    public void setDao(BaseDao baseDao){
        this.baseDao = baseDao;
    }
    @Override
    public int create(T t) {
        return baseDao.create(t);
    }

    @Override
    public int update(T t) {
        return baseDao.update(t);
    }

    @Override
    public int delete(int uuid) {
        return baseDao.delete(uuid);
    }

    @Override
    public T getByUuid(int uuid) {
        return (T)baseDao.getByUuid(uuid);
    }

    @Override
    public Page<T> getByConditionPage(QT qt) {
        List<T> list = baseDao.getByConditionPage(qt);
        qt.getPage().setResult(list);

        return qt.getPage();
    }
}
