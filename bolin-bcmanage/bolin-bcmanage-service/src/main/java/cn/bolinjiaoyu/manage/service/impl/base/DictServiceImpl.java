package cn.bolinjiaoyu.manage.service.impl.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.bolinjiaoyu.manage.mapper.DictMapper;
import cn.bolinjiaoyu.manage.pojo.base.Dict;
import cn.bolinjiaoyu.manage.pojo.base.DictExample;
import cn.bolinjiaoyu.manage.service.DictService;

public class DictServiceImpl implements DictService {
	
	@Autowired
	private DictMapper dictMapper;

	@Override
	public Dict queryById(Serializable id) {
		Dict dict = dictMapper.selectByPrimaryKey((Long) id);
		return dict;
	}

	@Override
	public List<Dict> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer queryCountByWhere(Dict t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dict> queryListByWhere(Dict t) {
		//根据关联的平台
		DictExample example = new DictExample();
		return null;
	}

	@Override
	public List<Dict> queryListByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSelective(Dict t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSelective(Dict t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Dict> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

}
