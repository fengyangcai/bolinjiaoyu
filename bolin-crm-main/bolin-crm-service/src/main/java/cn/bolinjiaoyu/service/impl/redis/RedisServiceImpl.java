package cn.bolinjiaoyu.service.impl.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.bolinjiaoyu.service.redis.RedisService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Service
public class RedisServiceImpl implements RedisService {
	
	@Autowired(required = false)
	private JedisPool jedisPool;

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.set(key, value);
		//将连接返回连接池
		jedis.close();
		return result;
	}

	@Override
	public String setex(String key, int seconds, String value) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.setex(key, seconds, value);
		//jedis.setex(key, seconds, value);
		jedis.close();
		return result;
	}
	

	@Override
	public Long expire(String key, int seconds) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, seconds);
		jedis.close();
		return result;
	}

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.get(key);
		jedis.close();
		return result;
	}

	@Override
	public Long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.del(key);
		jedis.close();
		return result;
	}

	@Override
	public Long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	@Override
	public String hSet(String Pkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.set(Pkey, key, value);
		return string;
	}

	@Override
	public String hSetDataByJson(String Pkey, String key, Object obj) {
	final	String value = JSON.toJSONString(obj);
	Jedis jedis = jedisPool.getResource();
	String string = jedis.set(Pkey, key, value);	
	return string;
	}

	@Override
	public String gey(String Pkey, String key) {
		Jedis jedis = jedisPool.getResource();
		jedis.hget(Pkey, key);
		return null;
	}

	@Override
	public <T> Object hGetDataByJson(String Pkey, String key, Class<T> clazz) {
		Jedis jedis = jedisPool.getResource();
		String jsonObjet = jedis.hget(Pkey, key);
		T t = JSON.parseObject(jsonObjet, clazz);
		
		return t;
	}

	@Override
	public <T> Object hGetDataList(String Pkey, String key, Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hdel(String pKey, String key) {
		Jedis jedis = jedisPool.getResource();
		jedis.hdel(pKey, key);
		
	}

	

}
