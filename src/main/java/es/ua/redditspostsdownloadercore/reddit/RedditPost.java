/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ua.redditspostsdownloadercore.reddit;

/**
 *
 * @author balmarcha
 */
public class RedditPost {
    
    private String id;
    private String title;
    private String text;
    private String subreddit;
    private String author;
    
    private int numRespuestas;

    public RedditPost(String id, String title, String text, String subreddit, String author) {
        
        this.id = id;
        this.title = title;
        this.text = text;
        this.subreddit = subreddit;
        this.author = author;
        this.numRespuestas = 0;
    }
    
    public String getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getAuthor() {
        return author;
    }
    
    public void setNumRespuestas() {
        numRespuestas++;
    }
    
    public int getNumRespuestas()
    {
        return numRespuestas;
    }
}
