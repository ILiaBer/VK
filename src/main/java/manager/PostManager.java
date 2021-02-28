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

    public String search() {
        Post[] ownerId = postManager.ownerId();
        Post[] ownersOnly = postManager.ownersOnly();
        Post[] query = postManager.query();
        Post[] posts = postManager.offset();
        return null;

    }

    public String delete() {
        Post[] ownerId = postManager.ownerId();
        Post[] posts = postManager.postId();
        return null;
    }

}
