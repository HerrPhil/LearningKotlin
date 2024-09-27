package com.professional.development.learningkotlin

import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")


fun main() = runBlocking(CoroutineName("main")) {
    println("hello phillip...")
    log("Started main coroutine")
    // run two background value computations
    val v1 = async(CoroutineName("v1coroutine")) {
        delay(500)
        log("Computing v1")
        6
    }
    val v2 = async(CoroutineName("v2coroutine")) {
        delay(1000)
        log("Computing v2")
        7
    }
    log("The answer for v1 * v2  = ${v1.await() * v2.await()}")
}


/*
@OptIn(DelicateCoroutinesApi::class)
fun main() {
    newSingleThreadContext("Ctx1").use {ctx1 ->
        newSingleThreadContext("Ctx2").use {ctx2 ->
            runBlocking(ctx1) {
                log("Started in ctx1")
                withContext(ctx2) {
                    log("Working in ctx2")
                }
                log("back to ctx1")
            }
        }
    }
}
*/

/*
fun main() = runBlocking<Unit> {
    println("My job is ${coroutineContext[Job]}")
}
*/

/*
fun main() = runBlocking<Unit> {
    // launch a coroutine to process some kind of incoming request
    val request = launch {
        repeat(3) { i -> // launch 3 children jobs
            launch {
                delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
                println("Coroutine $i is done")
            }
        }
        println("request: I'm done and I don't explicitly join my children that are still active")
    }
    request.join() // wait for the completion of the request, including all its children
    print("Now processing of the request is complete")
}
*/
