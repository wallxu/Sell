package com.le.isell.entity;

import com.le.isell.util.pageutil.Page;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BaseModel implements Serializable{
    private Integer uuid;
    private Page page;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Page getPage() {
        if (page == null){
            this.page = new Page();
        }
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
