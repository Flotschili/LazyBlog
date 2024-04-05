package sve2.lb.logic;

import org.springframework.stereotype.Service;

import static sve2.lb.util.PromptUtil.enrichPrompt;


@Service
public class LazyBlogService {
    // TODO: Check If System Prompt makes sense

    /**
     * Generates a blog entry based on keywords.
     *
     * @param keywords String of Keywords which the blog entry is based on.
     * @return generatedBlogEntry
     */
    public String writeAndPostBlog(String keywords) {
        String prompt = enrichPrompt(keywords);
        return prompt;
    }
}
