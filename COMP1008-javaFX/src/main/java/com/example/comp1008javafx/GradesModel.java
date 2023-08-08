package com.example.comp1008javafx;

public class GradesModel {
    // get and send information
    private String grade, letter;
    private int gradeNum;

    public GradesModel() {}

    public void process(String grade) {
        setGrade(grade);
        setLetter();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        setGradeNum();
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter() {
        if(gradeNum == -1) {
            letter = "N/A";
        } else if(gradeNum >=  90) {
            letter = "A+";
        } else if(gradeNum >=  80) {
            letter = "A";
        } else if(gradeNum >= 70) {
            letter = "B";
        } else if(gradeNum >= 60) {
            letter = "C";
        } else if(gradeNum >= 50) {
            letter = "D";
        } else if(gradeNum < 50) {
            letter = "F";
        }
    }

    public int getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum() {
        try {
            gradeNum = Integer.parseInt(grade);
            if(gradeNum < 0 || gradeNum > 100) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            gradeNum = -1;
            throw new IllegalArgumentException("Invalid Grade Value");
        }
    }
}
