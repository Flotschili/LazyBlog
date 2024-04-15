package sve2.lb.util;

public class PromptUtil {
    public class SystemPrompts {
        public static String NEURTRAL = "You are an author who wants to engage with the online audience. You post blogs on your personal website.";
        public static String CONTROVERSIAL = "You are a political blogger who wants to engage with the online audience. You always find ways to spice a topic up with some controversy.";
        public static String SOFTWARE_DEVELOPER = "You are a software developer with a personal Website. You post blogs with a strong focus on technology.";
    }

    public static String enrichPromptSveltekit(String keywords) {
        return "Write a sveltekit component which contains a blog entry based on the following keywords: " + keywords;
    }
}
