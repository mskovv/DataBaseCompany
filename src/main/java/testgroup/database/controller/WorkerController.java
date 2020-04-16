package testgroup.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.database.model.Worker;
import testgroup.database.service.WorkerService;
import testgroup.database.service.WorkerServiceImpl;

import java.util.List;

@Controller
public class WorkerController {
    private WorkerService workerService = new WorkerServiceImpl();


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allworkers() {
        List<Worker> workers = workerService.allworkers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("workers");
        modelAndView.addObject("workersList", workers);
        return modelAndView;
    }


    @RequestMapping(value = "/editworkers", method = RequestMethod.GET)
    public ModelAndView editworkers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editworkers");
        return modelAndView;
    }
}

