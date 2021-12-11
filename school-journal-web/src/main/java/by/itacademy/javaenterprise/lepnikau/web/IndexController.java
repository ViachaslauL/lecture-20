package by.itacademy.javaenterprise.lepnikau.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("appName", "Spring");
        return model;
    }
}
