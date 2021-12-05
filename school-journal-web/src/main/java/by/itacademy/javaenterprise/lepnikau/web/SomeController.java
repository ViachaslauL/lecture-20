package by.itacademy.javaenterprise.lepnikau.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SomeController {

    @GetMapping("/message")
    public ModelAndView message() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("controllerVariable", "Some Controller Message");
        return model;
    }

}
