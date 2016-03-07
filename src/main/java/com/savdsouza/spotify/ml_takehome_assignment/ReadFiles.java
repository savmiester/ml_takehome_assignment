package com.savdsouza.spotify.ml_takehome_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.savdsouza.spotify.ml_takehome_assignment.listeningdata.ListeningData;
import com.savdsouza.spotify.ml_takehome_assignment.userdata.UserData;

public class ReadFiles {
    // public static void main(String[] args) throws FileNotFoundException {
    // ReadFiles testObject = new ReadFiles();
    // testObject.readUserDataFiles("user_data_sample.csv");
    // }
    public ArrayList<UserData> readUserDataFiles(String FileName) throws FileNotFoundException {
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<UserData> userDataList = new ArrayList<UserData>();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(FileName).getFile());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] data = line.split(cvsSplitBy);
            UserData userdata = new UserData();
            userdata.setGender(data[0]);
            userdata.setAgeRange(data[1]);
            userdata.setCountry(data[2]);
            userdata.setAccountAgeInWeeks(data[3]);
            userdata.setUserID(data[4]);
            userDataList.add(userdata);
            System.out.println(line);
        }
        scanner.close();
        System.out.println("Done");
        return userDataList;
    }

    public ArrayList<ListeningData> readListeningDataFiles(String FileName) throws FileNotFoundException {
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<ListeningData> listeningDataList = new ArrayList<ListeningData>();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(FileName).getFile());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] data = line.split(cvsSplitBy);
            ListeningData listeningData = new ListeningData();
            listeningData.setMilliSecondsPlayed(data[0]);
            listeningData.setContext(data[1]);
            listeningData.setTrack_id(data[2]);
            listeningData.setProduct(data[3]);
            listeningData.setEndTimeStamp(data[4]);
            listeningData.setUserID(data[5]);
            listeningDataList.add(listeningData);
            System.out.println(line);
        }
        scanner.close();
        System.out.println("Done");
        return listeningDataList;
    }
}
