package com.ljy.kotlin.chapter4

fun main(args: Array<String>) {
    //minof 返回两个数里面较小的
    val a= minOf(args[0].toInt(),args[1].toInt())//包级函数
    val latitude=Latitude.ofDouble(3.0)
    val latitude2=Latitude.ofLatitude(latitude)
    println(Latitude.TAG)
}

/**companion object 修饰为伴生对象,伴生对象在类中只能存在一个，
 * 类似于java中的静态方法 Java 中使用类访问静态成员，静态方法。
 * 静态成员尽量用包级函数，变量替代
 * 当companion object 是静态方法，调用非静态的成员变量也是调用不到的
 */
class Latitude private constructor(val value: Double){

    companion object{
        @JvmStatic//定义以后在java代码里面调用方便了和kotlin一样调用
        fun ofDouble(double: Double):Latitude{
            return Latitude(double)
        }

        //拷贝
        fun ofLatitude(latitude: Latitude):Latitude{
            return Latitude(latitude.value)
        }
        @JvmField//定义后在java代码里方便使用
        val TAG:String="Latitude"
    }
}
