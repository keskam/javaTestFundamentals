package getFromDb;

import db.Person;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GetFromDbTest {

    @Test
    public void testIfUserExists() throws InterruptedException {
        GetFromDb getFromDb = new GetFromDb();
        boolean result = getFromDb.checkIfPersonExists("Kestutis");
        assert result == true;
    }

    @Test
    public void testIfUserExistsWithMockito() throws InterruptedException {
        GetFromDb getFromDb = Mockito.mock(GetFromDb.class);
        when(getFromDb.getFromDB()).thenReturn(new Person[] {new Person("Kestutis", "Kamantauskas")});
        when(getFromDb.checkIfPersonExists("Kestutis")).thenCallRealMethod();
        boolean result = getFromDb.checkIfPersonExists("Kestutis");
        assert result == true;
    }
}
