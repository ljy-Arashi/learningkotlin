package com.ljy.kotlin.chapter3

class Animals(var food:String,var name:String ){
    fun breed(breed:String){
        println("品种是$breed")
    }

    fun furColor(color:String){
        println("毛色是$color")
    }

}

fun main(args: Array<String>) {
    val cat=Animals("鱼","猫")
    cat.breed("布偶")
    cat.furColor("白色")
}