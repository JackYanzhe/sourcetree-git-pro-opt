package com.nebula.springprotem.service;


public class SourceTreeService {

	/**
	 * 个人分支
	 * 
	 * 1
	 * 
	 * dev
	 * brach
	 * 通用分支上修改
	 * 回滚操作测试
	 */
	public static void main(String[] args) {
		//再次测试回滚操作
		for (int i = 0; i < 30; i++) {
			System.out.println("循环次数："+i);
		}
		System.out.println("master分支代码提交");
		System.out.println("yz分支代码修改");
		System.out.println("dev分支代码提交");
	}
	
	public void test1() throws Exception {
		//yz分支新加代码
	}
	
	public void test3() throws Exception {
		//dev分支处测试
	}
	
	
	public void test4() throws Exception {
		//yz新加
	}
}
