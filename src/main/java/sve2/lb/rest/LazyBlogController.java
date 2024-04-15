package sve2.lb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sve2.lb.dao.GenerateBlogDao;
import sve2.lb.logic.LazyBlogService;

@RestController
public class LazyBlogController {
    final LazyBlogService lazyBlogService;

    @Autowired
    public LazyBlogController(LazyBlogService lazyBlogService) {
        this.lazyBlogService = lazyBlogService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hallo I bin da Flo";
    }

    @PostMapping("/generate")
    public String generate(@RequestBody GenerateBlogDao params) {
        return lazyBlogService.writeAndPostBlog(params.keywords());
    }
}