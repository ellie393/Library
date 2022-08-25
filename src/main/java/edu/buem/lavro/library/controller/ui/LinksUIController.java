package edu.buem.lavro.library.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/links/")
@Controller
public class LinksUIController {

    @GetMapping("")
    public String startPage(){
        return "links";
    }
}
