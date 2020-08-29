package getFromDb;

import connectToDb.ConnectToDb;
import db.Person;
import db.PersonsDb;

public class GetFromDb {

    public Person[] getFromDB() throws InterruptedException {

        ConnectToDb connectToDb = new ConnectToDb();
        connectToDb.connectToDb();

        PersonsDb personsDb = new PersonsDb();
        return personsDb.getPersonsList();
    }

    public boolean checkIfPersonExists(String name) throws InterruptedException {
        Person[] persons = getFromDB();
        boolean contains = false;
        for(Person p: persons) {
            contains = p.toString().contains(name);
            if(contains) break;
        }

        System.out.println("\n\n found " + name + " " + contains);
        return contains;
    }

}
