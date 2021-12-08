package by.itacademy.javaenterprise.lepnikau.web;

import by.itacademy.javaenterprise.lepnikau.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("appName", "Spring");
        model.addObject("controllerVariable", "Index Controller Message");
        return model;
    }

    @GetMapping("/hello")
    public String hello() {
        return "spring-page";
    }

    @GetMapping("/student")
    public ModelAndView findStudent() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("controllerVariable", studentService.findStudent(1L).toString());
        return view;
    }
}
