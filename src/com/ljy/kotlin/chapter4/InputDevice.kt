package com.ljy.kotlin.chapter4

import java.lang.IllegalArgumentException

//接口输入设备
interface InputDevice {
    fun input(event:Any)
}

interface USBInputDevice:InputDevice

interface BlueInputDevice:InputDevice

//光电鼠标
interface OpticalMouse{
    fun light()
}
//抽象类
abstract class USBMouse(val name:String):USBInputDevice,OpticalMouse{
    override fun light() {
        println("光电鼠标功能")
    }

    override fun input(event: Any) {
        println("输入设备---鼠标")
    }

    override fun toString(): String {
        return name
    }
}
class MiMouse:USBMouse("小米鼠标"){
 //拥有抽象父类的所以功能
    //还可以添加其他子类的专有功能
}
class Computer{
    fun addUSBInputDevice(inputDevice: USBInputDevice){
        println("插入USB输入设备$inputDevice")
    }
    fun addBlueInputDevice(inputDevice: BlueInputDevice){
        println("插入蓝牙输入设备$inputDevice")
    }
    fun addInputDevice(inputDevice: InputDevice) {
        when(inputDevice){
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            is BlueInputDevice -> addBlueInputDevice(inputDevice)
            else ->{
                throw IllegalArgumentException("设备类型不支持")
            }
    }
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    val mouse=MiMouse()
    computer.addInputDevice(mouse)
}
/**
 * 一个子类只能继承一个父类（抽象类），一个类可以实现多个接口
 *
 * 抽象类反映本质，接口体现功能
 *
 * 例如：联想笔记本电脑    电脑是抽象类（本质）   联想，笔记本是接口（功能）
 * */