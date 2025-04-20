package simplex.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello world, Hello innovation!");
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("message", String.format("Hello innovation, Hello %s.", name));
        return "hello";
    }

    @GetMapping("/hello/param")
    public String callNameByQueryParam(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("message", String.format("Hello innovation, Hello %s.", name));
        return "hello";
    }
}
