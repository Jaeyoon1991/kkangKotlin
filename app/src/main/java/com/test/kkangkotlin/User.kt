package com.test.kkangkotlin


fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)){
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}

fun main() {
    val result = hofFun ({ no -> no > 12 })
    println(result())


}
