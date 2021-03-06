package org.joinfaces.richfaces.example.beans;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

public class CDXmlDescriptor implements Serializable {
    private String artist;
    private String title;
    private String country;
    private String company;
    private float price;
    private int year;

    public CDXmlDescriptor()
    {
    }

    public CDXmlDescriptor(String artist, String title, String country, String company, float price, int year)
    {
        this.artist = artist;
        this.title = title;
        this.country = country;
        this.company = company;
        this.price = price;
        this.year = year;
    }

    @XmlElement(name = "ARTIST")
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @XmlElement(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "COMPANY")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @XmlElement(name = "PRICE")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "YEAR")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
