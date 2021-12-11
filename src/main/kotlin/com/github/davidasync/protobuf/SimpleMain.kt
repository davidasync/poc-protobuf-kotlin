package com.github.davidasync.protobuf

import example.simple.Simple

fun main () {
    val builder = Simple.SimpleMessage.newBuilder()
        .setId(1)
        .setIsSimple(true)
        .setName("foo")
        .addAllSampleList(arrayListOf(0,1,2,3))
        .build()

    println(builder)
}