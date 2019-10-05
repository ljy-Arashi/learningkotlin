package com.ljy.kotlin.chapter4.dataclass

//加上data Country类直接自动生成toString getId，getName，copy，hashcode  eauals..等方法
data class Country(val id:Int,val name:String)

class ComponentX{

    operator fun component1():String {
        return "我是"
    }

    operator fun component2():Int {
        return 10086
    }
    operator fun component3():String {
        return "的客服"
    }
}

fun main(args: Array<String>) {
    val china=Country(0,"中国")
    println(china)
    println(china.component1())//component1就第一个属性
    println(china.component2())//component2就第2个属性

    //同上写法
    val (id,name)=china
    println(id)
    println(name)

    val componentX=ComponentX()
    val (a,b,c)=componentX
    println("$a$b$c")

}