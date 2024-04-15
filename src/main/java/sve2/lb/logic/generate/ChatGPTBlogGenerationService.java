package sve2.lb.logic.generate;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("chatgpt")
public class ChatGPTBlogGenerationService implements BlogGenerationService {
    private ChatClient chatClient;

    @Autowired
    public ChatGPTBlogGenerationService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public void giveContext(String systemPrompt) {
        chatClient.call(systemPrompt);
        // TODO
    }

    @Override
    public String generateBlog(String prompt) {
        return chatClient.call(prompt);
    }
}
