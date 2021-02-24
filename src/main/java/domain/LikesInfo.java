package domain;

public class LikesInfo {
    private int count;
    private boolean likesUser;
    private boolean can_like;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isLikesUser() {
        return likesUser;
    }

    public void setLikesUser(boolean likesUser) {
        this.likesUser = likesUser;
    }

    public boolean isCan_like() {
        return can_like;
    }

    public void setCan_like(boolean can_like) {
        this.can_like = can_like;
    }

    public boolean isCan_publish() {
        return can_publish;
    }

    public void setCan_publish(boolean can_publish) {
        this.can_publish = can_publish;
    }

    private boolean can_publish;
}
