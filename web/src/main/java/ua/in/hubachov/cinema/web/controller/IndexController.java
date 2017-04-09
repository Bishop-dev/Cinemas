package ua.in.hubachov.cinema.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sashko on 4/9/17.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Object index() {
        return "{'message': 'Hello!'}";
    }

}
