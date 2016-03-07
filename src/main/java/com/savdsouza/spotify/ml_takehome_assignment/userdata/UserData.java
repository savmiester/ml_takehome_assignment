package com.savdsouza.spotify.ml_takehome_assignment.userdata;

/*
user_data_sample.csv
gender -- the gender of the user (male or female)
age_range -- a bucketed age of the user
country -- the country where the user registered
acct_age_weeks -- the age of the user's account in weeks as of Oct 14th, 2015
user_id -- the anonymous, random UUID of the user
 */
public class UserData {
    String gender;
    String ageRange;
    String country;
    String accountAgeInWeeks;
    String userID;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAgeRange() {
        return ageRange;
    }
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAccountAgeInWeeks() {
        return accountAgeInWeeks;
    }
    public void setAccountAgeInWeeks(String accountAgeInWeeks) {
        this.accountAgeInWeeks = accountAgeInWeeks;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
}

