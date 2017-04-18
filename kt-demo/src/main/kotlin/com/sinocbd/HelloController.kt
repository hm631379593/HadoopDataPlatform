package com.sinocbd

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by kuzoncby on 12/12/16.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    fun hello() = "Hello Kotlin"


}