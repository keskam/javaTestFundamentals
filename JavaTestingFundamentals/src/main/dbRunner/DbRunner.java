package dbRunner;

import connectToDb.ConnectToDb;
import getFromDb.GetFromDb;

public class DbRunner {

    public static void main(String[] args) throws InterruptedException {
        GetFromDb getFromDb = new GetFromDb();
        getFromDb.checkIfPersonExists("Kestutis");
    }
}
