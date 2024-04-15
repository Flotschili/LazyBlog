package sve2.lb.logic.generate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("loremipsum")
public class LoremIpsumBlogGenerationService implements BlogGenerationService {
    Logger logger = LoggerFactory.getLogger(LoremIpsumBlogGenerationService.class);

    @Override
    public void giveContext(String systemPrompt) {
        logger.info("Lorem Ipsum Blog Generation Service initialized with system prompt: " + systemPrompt);
    }

    @Override
    public String generateBlog(String prompt) {
        logger.info("Generating blog based on keywords: " + prompt);
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }
}
