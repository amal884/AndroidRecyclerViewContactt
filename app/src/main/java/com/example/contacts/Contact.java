package com.example.contacts;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Contact")
public class Contact {
    public static final String TYPEOFCONTACT_PERSONAL = "Personal";
    public static final String TYPEOFCONTACT_HOME = "Home";
    public static final String TYPEOFCONTACT_WORK = "Work";
    @PrimaryKey
    @NonNull

    private   String  name;
    private   String email;
    private   String picture;
    private   String number;
    private   String type;


//    private  final String TYPEOFCONTACT_WORK = "Work";
//    private  final String TYPEOFCONTACT_HOME = "Home";
//    private  static  final String TYPEOFCONTACT_PERSONAL = "Personal";

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTYPEOFCONTACT_WORK() {
        return TYPEOFCONTACT_WORK;
    }

    public String getTYPEOFCONTACT_HOME() {
        return TYPEOFCONTACT_HOME;
    }

    public String getTYPEOFCONTACT_PERSONAL() {
        return TYPEOFCONTACT_PERSONAL;
    }

    public Contact(@NonNull String name, String email, String picture, String number, String type) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.number = number;
        this.type = type;
    }
}
