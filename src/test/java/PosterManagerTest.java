import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterItem item1 = new PosterItem("Бладшот");
    PosterItem item2 = new PosterItem("Вперед");
    PosterItem item3 = new PosterItem("Отель Белград");
    PosterItem item4 = new PosterItem("Джентльмены");
    PosterItem item5 = new PosterItem("Человек-невидимка");
    PosterItem item6 = new PosterItem("Тролли. Мировой тур");
    PosterItem item7 = new PosterItem("Номер один");


    @Test
    public void shouldFindAll() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);

        PosterItem[] expected = {item1, item2, item3, item4, item5};
        PosterItem[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLastByDefault() {
        PosterManager poster = new PosterManager(6);
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);
        poster.add(item6);

        PosterItem[] expected = {item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessMaxLength() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);


        PosterItem[] expected = {item3, item2, item1};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreMaxLength() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);
        poster.add(item6);

        PosterItem[] expected = {item5, item4, item3, item2, item1};
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

