package com.example.zookeeperdemo;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.junit.Before;

public class ZookeeperTest {
	private CuratorFramework client=null;

	//连接重试
	RetryPolicy retryPolicy=new ExponentialBackoffRetry(3000,3);
	@Before
	public  void before(){
		//创建客户端对象
		client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", 1000, 1000, retryPolicy);
	}


	public void createNode() throws Exception {
//		打开连接
		client.start();
		client.create().forPath("/ywl");
		client.close();

	}
}
