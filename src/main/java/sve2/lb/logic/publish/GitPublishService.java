package sve2.lb.logic.publish;

import org.eclipse.jgit.api.Git;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sve2.lb.configs.GitConfig;

@Service
@Profile("git")
public class GitPublishService implements PublishService {
    Logger logger = LoggerFactory.getLogger(GitPublishService.class);
    private final GitConfig gitConfig;
    private Git repo = null;

    @Autowired
    public GitPublishService(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
        initRepo();
    }

    @Override
    public void postBlog(String blogpost, String keywords) {
        // TODO
    }

    private void initRepo()  {
        logger.info("Initializing Git Repository");
//        try {
//            repo = Git.cloneRepository()
//                    .setURI(gitConfig.getUrl())
//                    .setDirectory(new File("repo"))
//                    .call();
//        } catch (GitAPIException e) {
//            logger.error("Failed to clone Git repository", e);
//        }
    }
}
