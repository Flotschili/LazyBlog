package sve2.lb.logic.publish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("console")
public class ConsolePublishService implements PublishService {
    Logger logger = LoggerFactory.getLogger(ConsolePublishService.class);

    @Override
    public void postBlog(String blogpost, String keywords) {
        logger.info("Posting blog to console");
        System.out.println(blogpost);
    }
}
