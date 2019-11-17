package com.dama.damaService.application

import com.dama.damaService.domain.service.UserEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DamaController {

    @Autowired
    lateinit var service: UserEntityService

    @GetMapping("/")
    fun index(model: Model): String  {
        val modelList = service.find()
        model.addAttribute("modelList", modelList)
        return "index"
    }
}