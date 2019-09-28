package com.ljy.kotlin.chapter3

//fun sum(arg1:Int,arg2:Int):Int{
//    return arg1+arg2
//}
//上面的可以写成这样
fun sum(arg1: Int, arg2: Int) = arg1 + arg2

//如果有变量接收函数 就可以不写名字
//(Int) -> Long
val intToLong = fun(x: Int): Long {
    return x.toLong()
}
//用Lambda表达式定义sum函数 最后一行是返回值 所以返回值是int型
//（Int,Int） -> Int  参数  -> 返回类型
val sum1 = { arg1: Int, arg2: Int ->
    println("$arg1+$arg2=${arg1+arg2}")
    arg1 + arg2 }

//() -> Unit  参数  -> 返回类型
val printHello={
    println("Hello") //（Any?）->Unit
}

//(Array<String>) -> Unit 参数  -> 返回类型
fun main(args: Array<String>) {
    val arg1 = 1
    val arg2 = 2
    println(sum(arg1, arg2))
    println(intToLong(4))
    println(sum1(1,8))
    println(sum1.invoke(1,8))//同上的写法
    //args.forEach(::println)
    args.forEach ForEach@ {
        if (it == "a") {
            return@ForEach//这里终止的是main方法必须加@ForEach才能执行到下面的方法
        }
        println(it)
    }
    println("End")
}
/**
 * 函数就是代码块
 * fun[函数名]([参数列表]):[返回值类型]{函数体}
 * fun[函数名]([参数列表])=[表达式]
 * 返回值是 Unit可以不写
 *例
 * fun sayHi(name:String){println("Hi,$name")}
 * fun sayHi(name:String)=println("Hi,$name")
 *
 * 匿名函数
 * fun([参数列表])...
 * 必须赋值给一个变量
 * val sayHi=fun(name:String)=println("Hi,$name")
 *
 * 编写函数注意事项
 * 功能要单一
 * 参数不要太多
 * 函数名要顾名思义
 * Lambda表达式
 * 就是匿名函数
 * 写法
 * {[参数列表] ->[函数体,最后一行是返回值]]}
 * 举例
 * val sum={a:Int,b:Int -> a+b}
 *
 * Lambda的类型举例
 * () -> Unit  无参 返回值为Unit
 * (Int) -> Int 传入整型，返回值整型
 * (String,(String)-> String) ->Boolean
 * 传入字符串，Lambda表达式，返回Booolean
 *
 * Lambda的调用
 * 用()进行调用
 * 等价于invoke()
 * 举例
 * val sum={a:Int,b:Int -> a+b}
 * sum(2,3)
 * sum.invoke(2,3)
 *
 * Lambda表达式简化
 * 函数参数调用时最后一个Lambda可以移出去
 * 函数参数只有一个Lambda 调用时小括号可以省略
 * Lambda只有一给参数可默认为it
 * 入参，返回值与形参一致的函数可以用函数引用的方式作为实参传入
 * */