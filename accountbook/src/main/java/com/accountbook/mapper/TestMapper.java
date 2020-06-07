package com.accountbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.accountbook.dto.TestDTO;

@Repository
@Mapper
public interface TestMapper {
	List<TestDTO> selectTest();
}
