package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.FileModel;
import com.le.isell.entity.FileQueryModel;

@Repository
public interface FileDao extends BaseDao<FileModel,FileQueryModel>{
	
}
