package com.ljy.kotlin

//空指针安全
//函数 返回值类型String
//fun getName():String{
//    return null 不成立 要加?才可以返回null  下面getName2
//}

fun getName2():String?{
    return null
}

fun getName3():String{
    return "Alin"
}

fun main(args: Array<String>) {
   // if (getName3()==null) 不成立 永远为false
    if (getName2()==null){
        println("name 是空值")
    }else{
        println(getName2()?.length)
    }

    //上面if判断的简易写法  如果为空则return 否则输出字符串长度
    //val name:String= getName2()?:return
   // println(name.length)
    //value可能为空
    val value:String?="Hello"
    println(value!!.length)//肯定不为空才输出

    /**
     * 总结
     * 任意类型都有可空和不可空两种
     * val notNull:String =null //错误 不可空值不能为空
     * val nullable:String?=null //正确 可能为空值 为空
     * notNull.length //正确，不为空的值可以直接获取长度
     * nullable.length//错误 可能为空的值不能直接获取长度
     * nullable!!.length//正确 强制认定!!不为空
     * nullable?.length// 正确 若为空?就会返回null值
     *
     * //通过判断 让编译器自动判断不为空
     * if(nullable!=null) nullable.length
     * */
}