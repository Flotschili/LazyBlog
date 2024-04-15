package sve2.lb.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sve2.lb.logic.generate.BlogGenerationService;
import sve2.lb.logic.publish.PublishService;
import sve2.lb.util.PromptUtil;

import static sve2.lb.util.PromptUtil.enrichPromptSveltekit;


@Service
public class LazyBlogService {
    Logger logger = LoggerFactory.getLogger(LazyBlogService.class);

    private final PublishService publishService;
    private final BlogGenerationService blogGenerationService;

    // TODO: ggf. Rest Client verwenden
    // TODO: ggf. octokit (so heists bei .NET) verwenden (für Git API abstraktion)

    @Autowired
    public LazyBlogService(PublishService publishService, BlogGenerationService blogGenerationService) {
        this.publishService = publishService;
        this.blogGenerationService = blogGenerationService;
    }

    /**
     * Generates a blog entry based on keywords.
     *
     * @param keywords String of Keywords which the blog entry is based on.
     * @return generatedBlogEntry
     */
    public String writeAndPostBlog(String keywords) {
        logger.info("Received blog request for keywords: " + keywords);

        String prompt = enrichPromptSveltekit(keywords);
        blogGenerationService.giveContext(PromptUtil.SystemPrompts.NEURTRAL);
        String blog = blogGenerationService.generateBlog(prompt);
        publishService.postBlog(blog);

        return prompt;
    }
}
