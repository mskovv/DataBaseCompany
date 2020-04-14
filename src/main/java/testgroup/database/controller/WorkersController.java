package testgroup.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.database.model.Worker;

@Controller
public class WorkersController {


    private static Worker worker ;
    

    static {
        worker = new Worker();
        worker.setId(1);
        worker.setAge(20);
        worker.setName("Dima");
        worker.setSurname("Ivanov");
        worker.setDept("Backend");
        worker.setGender("Male");
        worker.setWorks(true);
        worker.getAge();
        worker.getName();

    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("worker");
        modelAndView.addObject("worker", worker);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView workers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("workers");
        return modelAndView;
    }

    @RequestMapping(value = "/editworkers", method = RequestMethod.GET)
    public ModelAndView editworkers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editworkers");
        return modelAndView;
    }
}

