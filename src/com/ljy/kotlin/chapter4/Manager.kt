package com.ljy.kotlin.chapter4
/**
 * 接口代理
 * */
interface Driver{
    fun drive()
}
interface Writter{
    fun write()
}
class Manager:Driver,Writter {
    override fun write() {
    }

    override fun drive() {

    }
}

/**高级经理
 * Driver by driver,Writter by writter 这样写以后就不用像Manager类里 实现那两个方法了
 * by 代表了代理，接口代理
 *
 * */
class SeniorManager(val driver: Driver,val writter: Writter):Driver by driver,Writter by writter

class CarDriver:Driver{
    override fun drive() {
        println("开车")
    }
}
class PPTWritter:Writter{
    override fun write() {
        println("写PPT")
    }
}

fun main(args: Array<String>) {
    val driver=CarDriver()//找个司机
    val writter=PPTWritter()//找个写手
    //接口代理
    val seniorManager=SeniorManager(driver,writter)//高级经理找个司机 写手干活
    seniorManager.drive() //开车
    seniorManager.write()//写ppt
}