package com.zbogdan.app.shifttest.controllers

import com.zbogdan.app.shifttest.dao.UserDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserController {

    @Autowired
    private lateinit var dao: UserDAO

    @GetMapping("/")
    fun all(model: Model): String {
        model.addAttribute("users", dao.findAll())

        return "index"
    }

}