package sve2.lb.util;

public class PromptUtil {
    public static String enrichPrompt(String keywords) {
        return "Write a sveltekit component which contains a blog entry based on the following keywords: " + keywords;
    }
}
