package threadPac
import java.util.concurrent.Callable
import java.util.concurrent.FutureTask

/**
 * Copyright (C), 2011-2018 温州贷
 * FileName: .threadPac.ThreadClass.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/8/22 11:22
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      11:22    1.0        Create
 */
object ThreadClass {
    @JvmStatic
    fun main(args: Array<String>) {
//        print1()
        print2()
//        print3()
//        callBack()
    }

    //测试输出 继承自Runnable接口的线程
    //线程并发执行，输出结果100次,线程不安全
    private fun print3() {
        val runnable = MyRunnableClass3()
        val thread1 = Thread(runnable)
        val thread2 = Thread(runnable)
        val thread3 = Thread(runnable)
        val thread4 = Thread(runnable)
        thread1.start()
        thread2.start()
        thread3.start()
        thread4.start()
    }

    //测试输出 继承自Runnable接口的线程
    //线程并发执行，输出结果200次
    private fun print2() {
        val runnable = MyRunnableClass()
        val thread1 = Thread(runnable)
        val thread2 = Thread(runnable)
        val thread3 = Thread(runnable)
        val thread4 = Thread(runnable)
        thread1.start()
        thread1.join()
        thread2.start()
        thread2.join()
        thread3.start()
        thread4.start()

    }

    ////输出继承自Thread类的结果，并行输出
    private fun print1() {
        val a = MyThreadClass()
        a.start()
        for (j in 0..99) {
            println(Thread.currentThread().name + "----" + j)
        }
    }

    /**继承自Thread类*/
    class MyThreadClass : Thread() {
        var i = 0
        override fun run() {
            while (i < 100) {
                i++
                println(Thread.currentThread().name + "---" + i)
            }
        }
    }

    /**实现Runnable接口*/
    class MyRunnableClass : Runnable {
        override fun run() {
            for (i in 0..49) {
                println(Thread.currentThread().name + "---" + i)
            }
        }
    }

    /**实现Runnable接口*/
    class MyRunnableClass3 : Runnable {
        var i = 0
        override fun run() {
            while (i < 100) {
                i++
                println(Thread.currentThread().name + "---" + i)
            }
        }
    }

    fun callBack() {
        val callable = object : Callable<String> {
            override fun call(): String {
                return "callable----call"
            }
        }
        val task = FutureTask<String>(callable)
//        Future
        val thread = Thread(task)
        thread.start()
        task.cancel(true)
//        RunnableFuture
//        FutureTask
//        Executor
//        ExecutorService
//        Executors
    }

}