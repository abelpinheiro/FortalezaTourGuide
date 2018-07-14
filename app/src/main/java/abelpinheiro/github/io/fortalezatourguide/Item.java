package abelpinheiro.github.io.fortalezatourguide;

/**
 * Classe personalizada para popular duas TextView e uma ImageView em cada item de uma ListView
 */
public class Item {

    private String mTitle; // Titulo do item
    private int mImage; // Resource da ImageView do item
    private String mDescription; // Descrição do item

    // Construtor da classe
    public Item(String title, int image, String description){
        this.mTitle = title;
        this.mImage = image;
        this.mDescription = description;
    }

    // Getter do titulo
    public String getmTitle() {
        return mTitle;
    }

    // Getter da imagem
    public int getmImage() {
        return mImage;
    }

    // Getter da descrição
    public String getmDescription() {
        return mDescription;
    }
}