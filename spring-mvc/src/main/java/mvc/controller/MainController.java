package mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anton on 19.07.16.
 */
@Controller
public class MainController {

    @RequestMapping(value = {"/"})
    public String print(Model model){
        model.addAttribute("Title","Server page");
        model.addAttribute("END","Hello from mvc module");
        return "index";
    }
}
