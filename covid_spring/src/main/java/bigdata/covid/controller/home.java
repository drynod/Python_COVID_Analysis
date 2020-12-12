package bigdata.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Controller
public class home {

    @GetMapping("/")
    public String Home(){
        return "home";
    }

    @GetMapping("/seoul")
    public String Seoul(Model model) {
        LocalDate localDate = LocalDate.now();
        model.addAttribute("days", localDate);
        return "seoul";
    }

    @GetMapping("/where")
    public String where(Model model) {
        LocalDate localDate = LocalDate.now();
        model.addAttribute("days", localDate);
        return "where";
    }
}
