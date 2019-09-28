package com.ljy.kotlin

import com.ljy.kotlin.pack01.Mayor
import com.ljy.kotlin.pack02.Mayor as Mayor2

fun main(args: Array<String>) {
    var mayor:Mayor= Mayor("张")
   // var mayor2:com.ljy.kotlin.pack02.Mayor=com.ljy.kotlin.pack02.Mayor("刘")
    //上面这个太长可以import as 另一个名字
    var mayor2:Mayor2=Mayor2("刘")
/**
 * 总结
 * 包（package）
 * 就是命名空间
 * 包的声明必须在非注释代码的第一行
 * 类的全名：com.ljy.kotlin.pack02.Mayor
 *
 * */
}