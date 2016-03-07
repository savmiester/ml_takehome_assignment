package com.savdsouza.spotify.ml_takehome_assignment.listeningdata;

/*
 end_song_sample.csv
ms_played -- the amount of time the user listened to this track, in milliseconds
context -- the UI context the track was played from (e.g. playlist or artist page)
track_id -- the random UUID for the track
product -- the product status (e.g. free or paid)
end_timestamp -- the Epoch timestamp that marks the end of the listen
user_id -- the anonymous, random UUID of the user

 */
public class ListeningData {
    String milliSecondsPlayed;
    String context;
    String track_id;
    String product;
    String endTimeStamp;
    String userID;

    public String getMilliSecondsPlayed() {
        return milliSecondsPlayed;
    }

    public void setMilliSecondsPlayed(String milliSecondsPlayed) {
        this.milliSecondsPlayed = milliSecondsPlayed;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTrack_id() {
        return track_id;
    }

    public void setTrack_id(String track_id) {
        this.track_id = track_id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
