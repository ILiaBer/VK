package domain;

import java.util.Date;

public class Post {
    private String imageUrl;
    private boolean friendsOnly;
    private String text;
    private int id;
    private CommentsInfo commentsInfo;
    private FromId fromId;
    private Date date;
    private LikesInfo likesInfo;
    private Repost repost;
    private Geo geo;
    private СopyRight сopyRight;

    public СopyRight getСopyRight() {
        return сopyRight;
    }

    public void setСopyRight(СopyRight сopyRight) {
        this.сopyRight = сopyRight;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public FromId getFromId() {
        return fromId;
    }

    public void setFromId(FromId fromId) {
        this.fromId = fromId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public ViewsUser getViewsUser() {
        return viewsUser;
    }

    public void setViewsUser(ViewsUser viewsUser) {
        this.viewsUser = viewsUser;
    }

    private ViewsUser viewsUser;


}
