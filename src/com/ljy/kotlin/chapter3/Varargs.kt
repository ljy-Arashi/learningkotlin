package com.ljy.kotlin.chapter3

//可变参数
fun main(vararg args:String) {

//for (arg in args){
//    println(arg)
//}
    //Int可以变长，str是不可变长的参数 就用具名参数
    hello(1, ints = *intArrayOf(5),str = "Hello")//这里没传，在第一个的int是默认参数，后面的参数要用具名参数，最后的double可以默认不写double=3.0

    val array= intArrayOf(1,3,4,5)
    //这里没传，在第一个的int是默认参数，后面的参数要用具名参数
   // hello(ints = *array,str = "Hello2",double = 4.0) //结果同上 *代表把array展开 只支持变长参数 用于展开数组
}

//double int可以设置一默认参数，如果不传就默认这个值
fun hello(int: Int=2,vararg ints:Int,str:String,double:Double=3.0){
    ints.forEach (::print)
    print(str)
    println(double)
}
/**
 *变长参数
 * 某个参数可以接收多个值
 * 可以不为最后一个参数
 * 如果传参有歧义，需要用具名参数指定
 *
 *Spread Operator *
 * 只支持展开Array
 * 只用于变长参数列表实参
 * 不能重载
 *
 *默认参数
 *为函数参数指定默认值
 * 可以为任意位置的参数指定默认值
 * 传参时，如果有歧义，需要使用具名参数
 * */