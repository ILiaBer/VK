package manager;

import domain.Post;

public class PostManager {
    private Post[] posts;
    private PostManager postManager;

    public Post[] ownerId() {
        return null;
    }
    public Post[] query() {
        return null;
    }

    public Post[] ownersOnly() {
        return null;
    }

    public Post[] offset() {
        return null;
    }

    public Post[] postId() {
        return null;
    }

    public String searchForId() {
        Post[] posts = postManager.ownerId();
        return null;

    }

    public String searchForOwnersOnly() {
        Post[] posts = postManager.ownersOnly();
        return null;
    }

    public String searchForQuery() {
        Post[] posts = postManager.query();
        return null;
    }

    public String searchForOffset() {
        Post[] posts = postManager.offset();
        return null;
    }

    public String deleteOwnerId() {
        Post[] posts = postManager.ownerId();
        return null;
    }


    public String deleteForId() {
        Post[] posts = postManager.postId();
        return null;
    }
}
