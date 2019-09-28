package com.ljy.kotlin

fun main(args: Array<String>) {
    val parent:Parent=Child()
    if (parent is Child) {//判断后可以直接调用child的属性 不用强转
        println(parent.name)
        }

    val str:String?="Hello"
    if (str is String)//判断后下面就可以不用强制确定不为空了，智能转换
    {
        println(str.length)
    }

    val parent2:Parent= Parent()
    val child:Child?=parent2 as? Child//会转换失败。必须加?就不会报错，返回null
    println(child)

    /**
     * 总结
       智能类型转换
      类似java类型转换 as
      val sub:SubClass?= parent as? SubClass
     如果转换失败，返回null 不抛异常

    //通过判断 让编译器自动判断为子类
     if(parent is SubClass) parent.<子类的成员>

     * */
    }