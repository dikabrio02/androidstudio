package com.example.student;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String getNumber() {
        return number;
    }

    public String getFacultyName() {
        return facultyName;
    }

    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilageExistsFlg;

    public StudentsGroup(String number, String facultyName, int educationLevel, boolean contractExistsFlg, boolean privilageExistsFlg) {
        this.number = number;
        this.facultyName = facultyName;
        this.educationLevel = educationLevel;
        this.contractExistsFlg = contractExistsFlg;
        this.privilageExistsFlg = privilageExistsFlg;
    }

    public int getEducationLevel() {
        return educationLevel;
    }
    public boolean isContractExistsFlg() {
        return contractExistsFlg;
    }
    public boolean isPrivilageExistsFlg() {
        return privilageExistsFlg;
    }

    private static ArrayList<StudentsGroup> groups = new ArrayList<StudentsGroup>(
            Arrays.asList(
                    new StudentsGroup("301","Комп. Науки", 0 ,true , false)




//                    new StudentsGroup("302","Комп. Науки" ,0 , true , false),
//                    new StudentsGroup("303","Комп. Науки" ,1 , false , true),
//                    new StudentsGroup("304","Комп. Науки", 0 , true , false)

            )
    );
    public static void addGroup(StudentsGroup group) {
        groups.add(group);
    }

    public static StudentsGroup getGroup(String groupNumber) {
        for(StudentsGroup g : groups) {
            if (g.getNumber().equals(groupNumber)) {
                return g;
            }
        }
        return null;
    }

    public static ArrayList<StudentsGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return number;
    }




}


