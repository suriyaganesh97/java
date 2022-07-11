package com.test.first;



public class Individual {
    private int dataid;
    private int versionNum;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String comments1;

    public int getdataid() {
        return dataid;
    }

    public void setdataid(int i) {
        this.dataid = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(int versionNum) {
        this.versionNum = versionNum;
    }

    public String getComments1() {
        return comments1;
    }

    public void setComments1(String comments1) {
        this.comments1 = comments1;
    }

    @Override
    public String toString() {
        return "User [dataid=" + dataid + ", firstName=" + firstName + ", secondName=" + secondName + 
        		 ", thirdName=" + thirdName + "commenst1 "+ comments1+"version num "+versionNum;
    }
}