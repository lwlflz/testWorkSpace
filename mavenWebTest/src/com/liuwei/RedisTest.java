package com.liuwei;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	@Test
	public void tes() {
		Jedis jedis = new Jedis("192.168.16.91");
		System.out.println("连接成功");
		System.out.println("服务正在运行"+jedis.ping());
	}
}
