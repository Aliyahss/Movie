import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class M0vieManagerTest {

    @Test
    public void noMovies() {
        M0vieManager manager = new M0vieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies1() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies3() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies4() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies5() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void MoviesReverse() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesReverse1() {
        M0vieManager manager = new M0vieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

}