package cn.bolinjiaoyu.manage.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bolinjiaoyu.manage.mapper.TestMapper;
import cn.bolinjiaoyu.manage.test.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testMapper;

	@Override
	public String queryCurrentDate() {
		
		return testMapper.queryCurrentDate();
	}

}
