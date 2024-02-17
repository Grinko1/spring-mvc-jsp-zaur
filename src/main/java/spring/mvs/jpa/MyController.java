package spring.mvs.jpa;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MyController {
    @GetMapping
    public String first() {
        return "index";
    }

    @GetMapping("form")
    public String aksPage(Model model) {
        model.addAttribute("employee", new Employee("name", "surname", 400, "Hr", "BMW"));
        return "form";
    }

    @GetMapping("show")
    public String showInfo(@Valid @ModelAttribute("employee") Employee employee,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        } else {
            return "show";
        }


    }
//    @GetMapping("show")
//    public String showInfo(@RequestParam("name") String name, Model model) {
//
//        model.addAttribute("name", "Mr. " + name);
//        model.addAttribute("desc", "- this is description");
//        return "show";
//    }

//    @GetMapping("show")
//    public String showInfo(HttpServletRequest request, Model model) {
//        String name = request.getParameter("name");
//        name = "Mr. " + name;
//        model.addAttribute("name", name);
//        model.addAttribute("desc", "- this is description");
//        return "show";
//    }
}
