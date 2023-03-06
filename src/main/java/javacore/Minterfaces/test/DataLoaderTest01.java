package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DataBaseLoader;
import javacore.Minterfaces.dominio.DataLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieverMaxDataSize();
        DataBaseLoader.retrieverMaxDataSize();
    }
}
