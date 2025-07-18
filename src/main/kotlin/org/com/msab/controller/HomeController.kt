package org.com.msab.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/b")
class HomeController (

) {

  @GetMapping("")
  fun homeHandler(): String {
    return "Hello World From Msa B"
  }
}