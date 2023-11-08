package maratonajava.javacore.Minterfaces.Test;

import maratonajava.javacore.Minterfaces.dominio.DataLoader;
import maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataLoader = new DatabaseLoader();
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataLoader.load();
        fileLoader.load();

        databaseLoader.remover();
        fileLoader.remover();

        databaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
