package com.ljy.kotlin.chapter3

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {
    while (true) {
        println("请输入算式例如:3 + 4")
        try {
            val input = readLine() ?: break //如果读到null就结束
            if (input != null) {
                val splits = input.trim().split(" ")//空格区分 首尾空格trim掉
                if (splits.size<3){
                    throw IllegalArgumentException("参数个数不对")
                }
                val arg1 = splits[0].toDouble()
                val oper = splits[1]//运算符
                val arg2 = splits[2].toDouble()
                println("$arg1 $oper $arg2 = ${Operator(oper).opFun(arg1, arg2)}")
            }
        }catch (e:NumberFormatException){
            println("您确定输入的是数字吗?")
        }
        catch (e:IllegalArgumentException){
            println("您确定输入的三个参数是用空格分隔的吗?")
        }
        catch (e:Exception){
            println("程序异常+${e.message}")
        }
        println("继续计算吗?[y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
    println("感谢使用本计算器！")
}

class Operator(op:String){

    val opFun={left:Double,right:Double ->
        when(op){
            "+" -> left+right
            "-" -> left-right
            "*" -> left*right
            "/" -> left/right
            "%" -> left%right
            else ->{
                throw UnsupportedOperationException(op)
            }
        }
    }

    //包装一下 传参  可以不用这个直接用上面那个
//    fun apply(lef:Double,right:Double):Double{
//        return opFun(lef,right)
//    }

}