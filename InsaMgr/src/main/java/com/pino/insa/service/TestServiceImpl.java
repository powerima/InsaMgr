package com.pino.insa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pino.insa.domain.TestVo;

@Service
public class TestServiceImpl implements TestDao {
	
	@Autowired TestDao testDao;

	@Override
	public void insertTest(TestVo vo) {
		// TODO Auto-generated method stub
		testDao.insertTest(vo);
	}
	
	
}
