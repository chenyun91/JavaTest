package threadPac;

import java.util.concurrent.Future;

/**
 * Copyright (C), 2011-2018 温州贷
 * FileName: PACKAGE_NAME.InterfaceC.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/8/22 15:53
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:53    1.0        Create
 */
interface InterfaceC extends Runnable,Future{
	void run();
}
