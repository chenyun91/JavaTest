package threadPac;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Copyright (C), 2011-2018 温州贷
 * FileName: PACKAGE_NAME.ClassA.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/8/22 15:56
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:56    1.0        Create
 */
class ClassA  implements InterfaceC{

	public static void funStatic(){

	}
	@Override
	public void run() {
		Thread thread=new Thread();
		thread.notify();
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		return false;
	}

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public boolean isDone() {
		return false;
	}

	@Override
	public Object get() throws InterruptedException, ExecutionException {
		return null;
	}

	@Override
	public Object get(long timeout, @NotNull TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		return null;
	}
}
