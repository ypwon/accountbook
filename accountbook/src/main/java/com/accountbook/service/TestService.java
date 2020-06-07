package com.accountbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accountbook.dto.TestDTO;
import com.accountbook.mapper.*;

@Service
@Transactional
public class TestService {

	@Autowired
	public TestMapper mapper;
	
	public List<TestDTO> selectTest(){
		return mapper.selectTest();
	}
}
