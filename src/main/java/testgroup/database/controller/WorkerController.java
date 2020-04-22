package testgroup.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping(value = "/editPage/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id")int id) {
        Worker worker = workerService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("worker", workerService.getById(id));
        modelAndView.setViewName("editPage");
        modelAndView.addObject("worker", worker);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editWorker(@ModelAttribute("Worker") Worker worker) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        workerService.edit(worker);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addWorker(@ModelAttribute("Worker") Worker worker) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        workerService.add(worker);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView delete(@ModelAttribute("Worker") Worker worker) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        workerService.delete(worker);
        return modelAndView;
    }
}

