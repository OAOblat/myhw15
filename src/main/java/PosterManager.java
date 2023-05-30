
public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int maxLength;


    public PosterManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public PosterManager() {
        this.maxLength = 5;
    }

    public void add(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
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
