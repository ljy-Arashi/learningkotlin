package com.ljy.kotlin.chapter4
/**接口方法冲突
 * 接口方法可以有默认实现 fun x():Int=0
 * 签名（方法名）一致并且返回值相同的冲突，如果不一样就没法解决冲突
 * super<父类（或接口）名>.[方法名]（[参数列表]）
 * */
abstract class A{
    open fun x():Int=5
}
interface B{
    fun x():Int=1
}
interface C{
    fun x():Int=0
}
class D(var y:Int=10):A(),B,C {
    override fun x(): Int {
        if (y>0){
            return y
        }else if (y>-200&&y<-100) {
            return super<C>.x()
        }else if(y<-200){
            return super<B>.x()
        }else{
            return super<A>.x()
        }
    }
}


fun main(args: Array<String>) {
    println(D(3).x())
    println(D(-10).x())
    println(D(-110).x())
    println(D(-1000).x())
}

