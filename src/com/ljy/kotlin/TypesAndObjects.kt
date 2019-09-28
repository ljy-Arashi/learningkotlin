package com.ljy.kotlin

class Cats(var voice:String, var food:String, var furColor:String){
    init {
        println("有一只${furColor}的猫，叫声:$voice,喜欢吃$food")
    }
}

class Dogs(var voice:String, var food:String, var furColor:String){
    init {
        println("有一只${furColor}的狗，叫声:$voice,喜欢吃$food")
    }
}
//open后才可以被继承
open class Animals(var voice:String, var food:String, var furColor:String){
    init {
        println("有一只${furColor}的${this.javaClass.simpleName}，叫声:$voice,喜欢吃$food")
    }
}
//继承Animals用冒号:
class Mouse(voice: String, food: String, furColor: String) : Animals(voice, food, furColor)

fun main(args: Array<String>) {
    val pet:Cats= Cats("喵喵","鱼","灰色")
    val pet2:Dogs= Dogs("汪汪","骨头","黄色")
    val animalA:Mouse= Mouse("吱吱","垃圾","灰色")

    println(animalA is Animals)//true
}