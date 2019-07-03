package cn.bolinjiaoyu.service.impl.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;

import cn.bolinjiaoyu.service.base.BaseService;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private Mapper<T> mapper;

	private Class<T> clazz;

	public BaseServiceImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	@Override
	public T queryById(Serializable id) {

		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> queryAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public Integer queryCountByWhere(T t) {
		// TODO Auto-generated method stub
		return mapper.selectCount(t);
	}

	@Override
	public List<T> queryListByWhere(T t) {
		// TODO Auto-generated method stub
		return mapper.select(t);
	}

	@Override
	public List<T> queryListByPage(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		return mapper.selectAll();

	}

	@Override
	public void saveSelective(T t) {

		mapper.insertSelective(t);

	}

	@Override
	public void updateSelective(T t) {
		mapper.updateByPrimaryKeySelective(t);

	}

	@Override
	public void deleteById(Serializable id) {
		mapper.deleteByPrimaryKey(id);

	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		// 设置删除的条件
		Example example = new Example(this.clazz);
		Criteria criteria = example.createCriteria();
		criteria.andIn("id", Arrays.asList(ids));

		// 执行批量删除
		mapper.deleteByExample(example);

	}

	@Override
	public List<T> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

}
