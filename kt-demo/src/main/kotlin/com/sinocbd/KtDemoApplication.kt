package com.sinocbd

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KtDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KtDemoApplication::class.java, *args)
}
