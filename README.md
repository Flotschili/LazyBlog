# LazyBlog
Welcome to LazyBlog, a simple blog generator based on Keywords. Under the hood, connects to openAI.

## Configuration
By setting spring profiles can choose a generation method, and a publish method.

| Task | Profiles                 |
| --- |--------------------------|
| Generation | `loremipsum`, `chatgpt`  |
| Publish | `console`, `file`, `git` |

This git publish method does not work in the current version of LazyBlog.