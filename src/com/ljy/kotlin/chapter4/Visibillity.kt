package com.ljy.kotlin.chapter4

import com.ljy.kotlin.arrayOfChar

class House
class Flower
class Yard{
    private val flower:Flower = Flower() //定义了private的mian里就访问不到
    val house:House= House()
}
class ForbiddenCity{
     val flowers= arrayOf(Flower(), Flower()) //默认public
     internal val houses= arrayOf(House(), House())//internal 模块(module)可见,不建议频繁使用
}
fun main(args: Array<String>) {
    val yard=Yard()
    val fc=ForbiddenCity()
    println(fc.flowers[0])
}
/**
 * protected 子类可见
 * */