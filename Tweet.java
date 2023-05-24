/**
 * The Tweet class represents a tweet. Includes user information, caption, likes, image ID, and creation date.
 */
public class Tweet {
    /**
     * The userHandle of the tweet's author.
     */
    private String userHandle;

    /**
     * The caption associated with the tweet.
     */
    private String caption;

    /**
     * The number of likes the tweet has received.
     */
    private int likes;
    
    /**
     * The ID of the image associated with the tweet.
     */
    private int imageId;

    /**
     * The year the tweet was created.
     */
    private int createdAtYear;
    
    /**
     * The month the tweet was created.
     */
    private int createdAtMonth;
    
    /**
     * The day the tweet was created.
     */
    private int createdAtDay;

    /**
     * Constructs a new Tweet object with the following attributes:
     * 
     * @param userHandle        The userHandle of the tweet's author
     * @param caption           The caption associated with the tweet
     * @param likes             The number of likes the tweet has received
     * @param imageId           The ID of the image associated with the tweet
     * @param createdAtYear     The year the tweet was created
     * @param createdAtMonth    The month the tweet was created
     * @param createdAtDay      The day the tweet was created
     */
    public Tweet(String userHandle, String caption, int likes, int imageId, int createdAtYear, int createdAtMonth, int createdAtDay) {
        this.userHandle = userHandle;
        this.caption = caption;
        this.likes = likes;
        this.imageId = imageId;
        this.createdAtYear = createdAtYear;
        this.createdAtMonth = createdAtMonth;
        this.createdAtDay = createdAtDay;
    }

    /**
     * Returns the user handle of the tweet's author.
     * 
     * @return the user handle
     */
    public String getUserHandle() {
        return userHandle;
    }

    /**
     * Returns the caption of the tweet.
     * 
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Returns the number of likes a tweet has received.
     * 
     * @return the number of likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * returns the ID of the image/s associated with the tweet.
     * 
     * @return the image ID
     */
    public int getImageId() {
        return imageId;
    }

    /**
     * Return the date the tweet was created at in the format (dd/mm/yyyy)
     * 
     * @returns the creation date
     */
    public String getCreatedAt() {
        return createdAtDay + "/" + createdAtMonth + "/" + createdAtYear;
    }

    public void setLikes(int newLikes) {
    	this.likes = newLikes;
    }
}
