package sve2.lb.logic.generate;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("chatgpt")
public class ChatGPTBlogGenerationService implements BlogGenerationService {
    @Override
    public void giveContext(String systemPrompt) {
        // TODO
    }

    @Override
    public String generateBlog(String prompt) {
        // TODO
        return null;
    }
}
