import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void noMovies() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies1() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies4() {
        MovieManager manager = new MovieManager();
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
        MovieManager manager = new MovieManager();
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
    public void Movies6() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void MoviesReverse() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesReverse1() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesReverse2() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");

        String[] actual = manager.findLast();
        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesReverse3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] actual = manager.findLast();
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        Assertions.assertArrayEquals(expected, actual);
    }


}