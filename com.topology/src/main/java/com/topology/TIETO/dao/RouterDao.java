package com.topology.TIETO.dao;

import java.io.File;

import com.topology.TIETO.entity.Router;

public interface RouterDao {

	public Router[] parseFile(File file) throws Exception;
}
