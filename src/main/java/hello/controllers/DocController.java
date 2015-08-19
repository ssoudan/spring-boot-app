/*******************************************************************************
 * Copyright (c) 2011-2015 Sebastien Soudan
 *
 * All rights reserved.
 *******************************************************************************/
package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: ssoudan
 * Date: 8/13/15
 * Time: 5:03 PM
 */
@Controller
public class DocController {
    @RequestMapping("/")
    public String doc() {
        return "redirect:swagger-ui.html";
    }


}
