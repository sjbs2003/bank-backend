package com.example.bank

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController // this will tell springboot to initialize this class and make this responsible to handle rest request
@RequestMapping("api/hello") // define the path for the REST endpoint
class HelloWorldController {

    @GetMapping
    fun hello(): String = "this is a rest endpoint"
}