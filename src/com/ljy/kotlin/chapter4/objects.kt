package com.ljy.kotlin.chapter4
/**
 * objecy 只有一个实例的类
 * 不能自定义构造方法
 * 可以实现接口继承父类
 * 本质上就是单例模式最基本实现
 * */
class HardWare
abstract class Player
interface OnExternalDriverMountListener{
    fun onMount(hardWare: HardWare)
    fun onUnMount(hardWare: HardWare)
}
//类似java里面的单例模式 就用object
object MusicPlayer:Player(),OnExternalDriverMountListener{
    override fun onMount(hardWare: HardWare) {
    }

    override fun onUnMount(hardWare: HardWare) {
    }

    val state:Int=0
    fun play(url:String){

    }
    fun stop(){
    }
}