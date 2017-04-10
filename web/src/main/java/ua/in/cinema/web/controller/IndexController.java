package ua.in.cinema.web.controller;

import ua.in.cinema.bot.launcher.BotStarter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by Sashko on 4/9/17.
 */
@Controller
public class IndexController {

    @Autowired
    private BotStarter botStarter;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Object index() {
        return "{'message': 'Hello!'}";
    }

    @PostConstruct
    private void startBot() {
        botStarter.startBot();
    }

}
