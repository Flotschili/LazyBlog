package sve2.lb.logic.generate;

/**
 * Usage: Initialize the context with a system prompt and generate a blog based on keywords.
 */
public interface BlogGenerationService {
    void giveContext(String systemPrompt);

    String generateBlog(String prompt);
}
