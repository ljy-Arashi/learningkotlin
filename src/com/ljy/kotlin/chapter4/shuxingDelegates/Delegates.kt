package com.ljy.kotlin.chapter4.shuxingDelegates

import kotlin.reflect.KProperty

/***
 * 属性代理
 * 定义方法
 * val/var <property name>:<Type> by  type可以推导出来就可以省略
 * 代理者需要实现相应的setValue/getValue 方法
 * <expression>
 * lazy的原理
 */
class Delegates{
    //by lazy 是调用lazy类里一个getValue方法
    val hello by lazy {
        "hello World"
    }

    //getValue方法
    val hello2 by X()

    //可变参数里还要有setValue方法
    var hello3 by X()
}

//自己定义一个类 也去实现getValue方法 就可以用来by了
class X{
    private var value:String?=null
     operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
         println("getValue:$thisRef -> property:${property.name}")
        return value?:"value为空"
    }

     operator fun setValue(thisRef: Any?, property: KProperty<*>,value:String) {
         println("setValue:$thisRef -> property:${property.name}，value:$value")
          this.value=value
    }
}

fun main(args: Array<String>) {
    val delegates=Delegates()
    delegates.hello2
    println(delegates.hello2)
    delegates.hello3//这时候没初始化 就是""
    delegates.hello3="hhhhhh"

}