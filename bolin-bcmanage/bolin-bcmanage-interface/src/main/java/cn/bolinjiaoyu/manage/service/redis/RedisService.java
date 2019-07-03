package cn.bolinjiaoyu.manage.service.redis;

public interface RedisService {
	// 设置
		public String set(String key, String value);
		
		//Pkey,keu,value2级形式
		public String hSet(String Pkey ,String key,String value) ;
		
				
		//将对象存储，需要转换成json后存储
		public String hSetDataByJson(String Pkey,String key,Object obj);
			
		
		// 设置并同时设置过期时间
		public String setex(String key, int seconds, String value);

		// 设置key过期
		public Long expire(String key, int seconds);

		// 获取key值
		public String get(String key);
		public String gey(String Pkey,String key);
		public <T> Object hGetDataByJson(String Pkey,String key,Class<T>clazz);
		public <T> Object hGetDataList(String Pkey,String key,Class<T>clazz);
		

		// 删除key
		public Long del(String key);
		public void hdel(String pKey,String key);

		// 自增
		public Long incr(String key);

}
