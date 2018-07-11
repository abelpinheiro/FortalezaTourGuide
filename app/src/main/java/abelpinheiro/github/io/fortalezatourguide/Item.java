package abelpinheiro.github.io.fortalezatourguide;

public class Item {

    private String mTitle;
    private int mImage;
    private String mDescription;

    public Item(String title, int image, String description){
        this.mTitle = title;
        this.mImage = image;
        this.mDescription = description;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmDescription() {
        return mDescription;
    }
}
