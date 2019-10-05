package com.ljy.kotlin.chapter4.overload

class Overloads {
    //相当于下面的默认参数=0  返回默认参数
//    fun a():Int{
//        return 0
//    }

    //方法重载
    //方法名相同，参数不同
    //返回值不能当区分方法是否相同
    @JvmOverloads  //加了以后在java代码中调用kotlin时就可以不加参数，区别出默认参数=0了
    fun a(int: Int=0):Int{
        return int;
    }

}

fun main(args: Array<String>) {
 val overloads=Overloads()
    println(overloads.a())//不传就默认参数=0
}