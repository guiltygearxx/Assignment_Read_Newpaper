package androidapp.focus.hoangnam.assignment_read_newpaper;

import java.io.Serializable;

/**
 * Created by huy.nquoc on 12/24/2017.
 */

public class News implements Serializable {

    private String title;
    private String author;
    private String url;

    public News(String title, String author, String url) {
        this.title = title;
        this.author = author;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
