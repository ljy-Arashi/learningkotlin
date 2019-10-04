package com.ljy.kotlin.chapter4
/**
 * 父类open才可以被继承
 * 父类方法，属性要open才可以被覆写
 * 接口，接口方法，抽象类默认为open
 * 覆写父类（接口）成员必须要override关键字
 *
 * 继承（实现）语法要点
 * class D:A(),B,C
 * 注意继承时实际上调用了父类构造方法
 * 类单继承，接口多实现
 * */
//抽象类默认是open  如果不是抽象类 必须加Open 才能被继承
//属性也可以被重写
abstract class Person(open val name: String ="aaa") {
    //想要被重写必须加open  或者abstract抽象方法 但是子类不能super.父类方法
    open fun work(){
        println("我是$name,我要工作")
    }
    abstract fun cloth()
}
class MaNong(name: String):Person(name){
    override fun cloth() {
        println("穿便装")
    }

    //重写父类
    override fun work() {
        super.work()//继承父类的
        println("我是码农，工作是写代码")
    }
}

class Doctor:Person(name = "张xx"){
    override fun work() {
       super.work()//继承父类的
        println("我是医生，工作是治病")
    }

    override fun cloth() {
        println("穿白大褂")
    }
}

fun main(args: Array<String>) {
    val per:Person=MaNong("刘xx")
    per.work()
    per.cloth()
    println(per.name)

    val per2:Person=Doctor()
    per2.work()
    per2.cloth()
}