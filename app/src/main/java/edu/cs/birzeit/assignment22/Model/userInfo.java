package edu.cs.birzeit.assignment22.Model;

import android.app.AppComponentFactory;

import androidx.appcompat.app.AppCompatActivity;

public class userInfo extends AppCompatActivity {
    private String name;
    private String email;
    private String address;
    private String gender;
    private String phone;
    private String age;
    private String languages;
    private String hobbies;
    private String education;
    private String work;


    public userInfo(String name1, String s, String address, String gender, String phone, String age, String name, String email){
    }

    public userInfo(String name,String email,String address, String gender, String phone,String age, String languages, String hobbies,String education,String work){
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.age = age;
        this.languages = languages;
        this.hobbies = hobbies;
        this.education = education;
        this.work = work;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getLanguages() {
        return languages;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public String getHobbies() {
        return hobbies;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
}
