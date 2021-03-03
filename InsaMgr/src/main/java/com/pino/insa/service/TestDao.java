package com.pino.insa.service;

import org.apache.ibatis.annotations.Mapper;

import com.pino.insa.domain.TestVo;

@Mapper
public interface TestDao {
	public void insertTest(TestVo vo);	//등록
}
