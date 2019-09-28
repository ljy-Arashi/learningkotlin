package com.ljy.kotlin
//var 关键字是 variable 的简称，表示该变量可以被修改
//val 关键字是 value 的简称，表示该变量一旦赋值后不能被修改，但不是编译期常量
//const val x=2  这个才是编译期常量
//
//aBoolean 名称 ： Boolean类型 = 值
val aBoolean:Boolean=true
var bBoolean:Boolean=false
val Final_Name="Hello"//可以不用写:String 编译器自动识别是String
/**
 * 编译器可以推导的类型
 * val string="hello"//string类
 * val int=5 //int类
 * var x= getString()+5 //string类
 * */
val aInt:Int =8
val maxInt:Int= Int.MAX_VALUE
val mFloat:Float=2.1f
val mDouble:Double=3.1415
val maxDouble:Double= Double.MAX_VALUE
val senteceStr:String="HelloWorld"
val fromChar:String= String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))

//函数没有返回值的时候 返回的是:Unit 可以不写
fun main(args: Array<String>) :Unit{
    //2的31次方减一 即为整型最大值
    println(Math.pow(2.0,31.0)-1)
    println(maxInt)
    println(senteceStr== fromChar)//结果是true 就是equals
    println(senteceStr=== fromChar)//比较对象是否是同一个，对象引用值 结果是false
    println(fromChar)
    //bBoolean=true可以修改  但是aBoolean不可以 val
    val arg1:Int=1
    val arg2:Int=2
    println(""+arg1+"+"+arg2+"="+(arg1+arg2))//java写法 等价于下面kotlin写法
    println("$arg1+$arg2=${arg1+arg2}")
    val sayHello:String="Hello \"Arashi\""//转义字符
    println(sayHello)
    val salary:Int=10000
    println("$salary")//这直接打出10000
    println("$$salary")//这直接打出$10000
    println("\$salary")//这直接打出$salary
    val rawString:String="""
        a
        b
        \n
        \$salary//无法转义
    """
    println(rawString)
    println(rawString.length)

}