package db;

public class PersonsDb {

    public Person[] listOfPersons = {new Person("Kestutis", "Kamantauskas"),
                                    new Person("Vardenis" , "Pavardenis")};

    public Person[] getPersonsList() {
        return this.listOfPersons;
    }
}
