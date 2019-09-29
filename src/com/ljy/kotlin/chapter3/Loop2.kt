package com.ljy.kotlin.chapter3

class Student{
    fun isNotClothedProperly():Boolean{
        return false
    }
}

fun main(args: Array<String>) {
    val students=ArrayList<Student>()
    val you=Student()
    for (stu in students){
        //如果是你 跳过此次判断
        if (stu == you) continue
        if (stu.isNotClothedProperly()){
            break //跳出循环
        }
    }
}
/**
 * 多层循环嵌套的终止结合标签使用
 *
 * Outter@ for(..){
 *     Inner@while(i<0)
 *     {
 *       if(...)break@Outter     //如果没有@Outter就break while循环 ，有这里跳出for循环
 *     }
 * }
 * */