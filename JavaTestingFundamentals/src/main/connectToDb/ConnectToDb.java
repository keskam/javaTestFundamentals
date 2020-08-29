package connectToDb;

import db.Person;
import db.PersonsDb;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConnectToDb {

    public void connectToDb() throws InterruptedException {
        System.out.println("Connecting....");
        Thread.sleep(5000);
        connected();
    }

    public void connected() throws InterruptedException {
        System.out.println("Connected, retrieving list of persons....");
        Thread.sleep(5000);
        retrieveList();
    }

    public void retrieveList() {
        PersonsDb personsDb = new PersonsDb();
        for (Person p: personsDb.getPersonsList()) {
            System.out.println(p.toString());
        }
    }
}
