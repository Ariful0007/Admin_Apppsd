package com.example.admin_apppsd;

public class data_insert {
    String name, age, job, village, post, game, email, pass, pass_1;

    public data_insert() {
    }

    public data_insert(String name, String age, String job,
                       String village, String post, String game, String email, String pass, String pass_1) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.village = village;
        this.post = post;
        this.game = game;
        this.email = email;
        this.pass = pass;
        this.pass_1 = pass_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass_1() {
        return pass_1;
    }

    public void setPass_1(String pass_1) {
        this.pass_1 = pass_1;
    }
}
