package com.example.ted.object;

public class posters {
    private String Name,Day,Linkphoto;

    public posters (){
    }

    public posters (String name, String day, String linkphoto) {
        Name = name;
        Day = day;
        Linkphoto = linkphoto;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getLinkphoto() {
        return Linkphoto;
    }

    public void setLinkphoto(String linkphoto) {
        Linkphoto = linkphoto;
    }
}
