package com.ljy.kotlin.chapter3

//分支表达式
//在 Kotlin 的控制流中除了 循环(for/while/do..while) ，其他的都是表达式
private const val USERNAME = "Kotlin"
private const val PASSWORD = "ljy"
private const val ADMIN_USER = "admin"
private const val ADMIN_PSW = "admin"
private const val DEBUG = 1//debug模式
private const val USER = 0//用户模式

fun main(args: Array<String>) {
//    var mode= USER//默认模式
//    if (args.isNotEmpty() && args[0]=="1"){
//        mode= DEBUG
//    }

    //上面那个 定义成val不可以修改变量 但是 if就是一个表达式，返回的值是分支里面的最后一句代码
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    } else {
        USER
    }

    println("请输入用户名：")
    val userName = readLine()
    println("请输入密码：")
    val passWord = readLine()

    if (mode == DEBUG && userName == ADMIN_USER && passWord == ADMIN_PSW) {
        println("管理员登录成功")
    } else if (userName == USERNAME && passWord == PASSWORD) {
        println("登录成功")
    } else {
        println("登录失败")
    }

    val x = 5
    //如果第一表达式满足就执行第一个 不用break 也不执行下面的
    when (x) {
        is Int -> println("Hello $x")
        in 1..6 -> println("$x is in 1~100")
        !in 1..4 -> println("$x is not in 1~4")
        args[0].toInt() -> println("$x == args[0]")
    }

    //同上面if语句的写法   when也是表达式 返回值是每个分支的最后一个表达式的值
    val mode2 = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }
    println(mode2)
}
/**
 * 分支表达式
 * if表达式
 * if..else 和java一样 if(a==b)...else if(a==c)...else
 * 表达式与完备性
 * val x= if(b<0)0 else b
 * val x= if(b<0)0  //错误，赋值时，分支必须完备
 *
 * when表达式
 * 加强版switch 支持任意类型
 * 支持纯表达式条件分支（类似if）
 * 表达式完备性 和if一样   给变量赋值  各种情况都要列出来
 * */