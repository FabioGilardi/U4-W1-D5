package entities;

public abstract class MultimedialContent {
    //    ATTRIBUTES
    protected String title;

    //    CONSTRUCTORS
    public MultimedialContent(String title) {
        this.title = title;
    }

    //    METHODS
    @Override
    public String toString() {
        return "MultimedialContent{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
