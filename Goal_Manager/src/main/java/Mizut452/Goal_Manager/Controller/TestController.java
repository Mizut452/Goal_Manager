package Mizut452.Goal_Manager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/home")
    public String getPage() {
        return "templateLayout";
    }

    @GetMapping("/fragment")
    public String getFragment() {
        return "FragmentTest";
    }

    @GetMapping("/moto")
    public String g() {
        return "/fragment/frag";
    }

}
