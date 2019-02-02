package com.pln21.commonsUtility.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
@XmlRootElement(name = "okreg")
public class Okreg {
    @XmlAttribute(name = "id")
    private int id;
    @XmlAttribute(name = "nazwa")
    private String nazwa;
    @XmlAttribute(name = "iloscMandatow")
    private int iloscMandatow;


}
