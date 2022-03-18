package MyLibrary.Library;

public class NameBook extends Books{
    private String namebook;

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public NameBook(String namebook) {
        this.namebook = namebook;
    }
}
