package com.pln21.commonsUtility.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "pln21okreg")
public class Pln21okreg {

    private List<Okreg> okreg;
    private String nazwa;
    private List<String> specjlizacja;

    Pln21okreg(){

        createFolder();
        createListaKandydatow();
        createAnkieta();
        createRekruter();
    }

    private void createFolder(){}
    private void createListaKandydatow(){}
    private void createAnkieta(){}
    private void createRekruter(){}

}
