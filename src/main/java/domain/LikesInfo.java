package domain;

public class LikesInfo {
    private int count;
    private boolean likesUser;
    private boolean canLike;
    private boolean canPublish;

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }


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
        return canLike;
    }

    public void setCan_like(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCan_publish() {
        return can_publish;
    }

    public void setCan_publish(boolean can_publish) {
        this.can_publish = can_publish;
    }

    private boolean can_publish;
}
