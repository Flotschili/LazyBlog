package sve2.lb.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyBlogController {

    @GetMapping("/")
    public String hello() {
        return "Hallo I bin da Flo";
    }
}