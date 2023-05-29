
public class ProductManager {

    private PosterItem[] items = new PosterItem[0];
    private int maxLength = 5;


    public ProductManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public ProductManager() {
        this.maxLength = maxLength;
    }

    public void add(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }

    public PosterItem[] findLast() {
        PosterItem[] all = items;
        int resultLength;
        if (all.length <= maxLength) {
            resultLength = all.length;
        } else {
            resultLength = maxLength;
        }

        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[result.length - 1 - i];
        }
        return result;
    }

}
