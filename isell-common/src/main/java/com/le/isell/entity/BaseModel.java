package com.le.isell.entity;

import com.le.isell.util.page.Page;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BaseModel {
    private Integer uuid;
    private Page page;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
