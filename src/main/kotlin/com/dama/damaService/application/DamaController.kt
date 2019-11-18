package com.dama.damaService.application

import com.dama.damaService.domain.service.UserEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod



@Controller
@RequestMapping("test")
class DamaController {

    @Autowired
    lateinit var service: UserEntityService

    @GetMapping
    fun index(model: Model): String  {
        println("テスト")
        val modelList = service.find()
        model.addAttribute("modelList", modelList)
        return "index"
    }
}


@Controller
class HeloController {
    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun index(model: Model): String {
        model.addAttribute("message", "Hello Springboot")
        return "index"
    }
}