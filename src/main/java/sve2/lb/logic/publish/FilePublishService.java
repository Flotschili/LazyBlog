package sve2.lb.logic.publish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Service
@Profile("file")
public class FilePublishService implements PublishService {
    Logger logger = LoggerFactory.getLogger(FilePublishService.class);

    @Override
    public void postBlog(String blogpost, String keywords) {
        String blogDir = System.getProperty("user.dir") + "\\blogs";
        String filename = keywords.replace(" ", "_").toLowerCase() + ".md";
        File blogFileWriter = new File(blogDir, filename);

        try (FileWriter writer = new FileWriter(blogFileWriter)) {
            writer.write(blogpost);
        } catch (IOException e) {
            logger.error("Error writing blogpost to file", e);
            throw new RuntimeException(e);
        }
    }
}
