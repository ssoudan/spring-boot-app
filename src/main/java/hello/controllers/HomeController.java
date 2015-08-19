/*******************************************************************************
 * Copyright (c) 2011-2015 Sebastien Soudan
 *
 * All rights reserved.
 *******************************************************************************/
package hello.controllers;

import hello.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ssoudan
 * Date: 8/13/15
 * Time: 6:45 PM
 */
@RestController
public class HomeController {

    @Autowired
    public HomeService homeService;

    @RequestMapping("/do")
    public String home() {
        return "Hello Docker World: " + homeService.doSomething();
    }


}
