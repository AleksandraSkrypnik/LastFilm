import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMoviePosterTest {

    @Test
    public void testAddNullMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddOneMovie() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addNewMovie("Блатшот");

        String[] expected = {"Блатшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddTwoMovies() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addNewMovie("Блатшот");
        manager.addNewMovie("Вперед");

        String[] expected = {"Блатшот", "Вперед"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindLastIfAddFourFilm() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addNewMovie("Блатшот");
        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед","Блатшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindLastIfAddFifeFilm() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addNewMovie("Блатшот");
        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");

        String[] expected = {"Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперед","Блатшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindLastIfAddSixFilm() {
        ManagerMoviePoster manager = new ManagerMoviePoster();

        manager.addNewMovie("Блатшот");
        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }


}
