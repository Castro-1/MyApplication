package com.example.myapplication;

import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFicheros {

    Scanner file = new Scanner(new File("ArchivoLeer.txt"));

    public LeerFicheros() throws FileNotFoundException {
    }

}
