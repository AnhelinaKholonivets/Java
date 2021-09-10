package model;

import java.util.Date;

public class Note {
    private String firstName;
    private String surname;
    private String lastName;
    private String nickname;
    private String comment;
    private Group group;
    private Integer phoneHome;
    private Integer phoneMobile;
    private Integer phoneMobile2;
    private String email;
    private String skype;
    private Address address;
    private Date dateCreate;
    private Date dateEdit;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Integer getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(Integer phoneHome) {
        this.phoneHome = phoneHome;
    }

    public Integer getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(Integer phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public Integer getPhoneMobile2() {
        return phoneMobile2;
    }

    public void setPhoneMobile2(Integer phoneMobile2) {
        this.phoneMobile2 = phoneMobile2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    public String getLastNameAndInitialFirstName() {
        return lastName + " " + firstName.charAt(0) + ".";
    }

}
