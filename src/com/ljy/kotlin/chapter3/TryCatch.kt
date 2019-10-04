package com.ljy.kotlin.chapter3

import java.lang.NumberFormatException
import java.sql.SQLOutput

fun sum2(arg1:Int,arg2:Int):Int{
    return arg1+arg2
}

fun main(args: Array<String>) {
    try {
        val arg1=args[0].toInt()
        val arg2=args[1].toInt()
        println("$arg1+$arg2=${sum2(arg1,arg2)}")
    }catch (e:NumberFormatException){
        println("你输入的是整数吗")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("你输入了两个整数参数吗")
    }catch (e:Exception){
        println("程序出现未知异常")
    }finally {
        println("感谢使用加法计算器")
    }
    //具名参数
    sum2(arg1 = 2,arg2 = 3)
    println(sum2(arg1 = 2,arg2 = 3)) //5
    //try catch 也是一个表达式
    val result=try {
        args[0].toInt() / args[1].toInt()
    }catch (e:Exception){
        e.printStackTrace()
        0
    }
    print(result)
}

/**
 * catch分支匹配异常类型
 * 表达式，可以用来赋值
 * finally 无论是否抛出异常都会执行
 *
 * 注意以下写法
 *先执行finally 再return
 * return try{ x/y} catch(e:Exception){0} finally{...}
 * */