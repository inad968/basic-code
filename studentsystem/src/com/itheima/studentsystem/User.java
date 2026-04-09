package com.itheima.studentsystem;

public class User {
    private String userName;
    private String passWord;
    private String personID;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String passWord, String personID, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.personID = personID;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return personID
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * 设置
     * @param personID
     */
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
