package testgroup.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkersController {
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

