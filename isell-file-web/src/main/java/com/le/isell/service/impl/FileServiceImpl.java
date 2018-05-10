package com.le.isell.service.impl;


import com.le.isell.dao.FileDao;
import com.le.isell.entity.FileModel;
import com.le.isell.entity.FileQueryModel;
import com.le.isell.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FileServiceImpl extends BaseServiceImpl<FileModel,FileQueryModel> implements FileService {
	private FileDao fileDao;

	@Autowired
	public void setFileDao(FileDao fileDao) {
		this.fileDao = fileDao;
		super.setDao(fileDao);
	}
}