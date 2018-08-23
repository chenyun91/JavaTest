package threadPac;

/**
 * Copyright (C), 2011-2018 温州贷
 * FileName: PACKAGE_NAME.ThreadTest.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/8/22 17:17
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      17:17    1.0        Create
 */
class ThreadTest {
	public static void main(String[] args){
		ClassA classA=new ClassA();
		try {
			classA.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		classA.notify();
		classA.notifyAll();
		ClassA.funStatic();
		classA.funStatic();
		Thread thread=new Thread();
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
