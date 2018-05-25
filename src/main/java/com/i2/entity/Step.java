package com.i2.entity;

public class Step {
    private   String step_id;
    private  String step_name;
    private  String step_desc;
    private  String step_type;
    private  String step_module;
    private  String step_ref;
    private  String step_matches;
    private  String step_args;
    private  String lst_update_date;
    private  String lst_update_user;

    public String getStep_id() {
        return step_id;
    }

    public void setStep_id(String step_id) {
        this.step_id = step_id;
    }

    public String getStep_name() {
        return step_name;
    }

    public void setStep_name(String step_name) {
        this.step_name = step_name;
    }

    public String getStep_desc() {
        return step_desc;
    }

    public void setStep_desc(String step_desc) {
        this.step_desc = step_desc;
    }

    public String getStep_type() {
        return step_type;
    }

    public void setStep_type(String step_type) {
        this.step_type = step_type;
    }

    public String getStep_module() {
        return step_module;
    }

    public void setStep_module(String step_module) {
        this.step_module = step_module;
    }

    public String getStep_ref() {
        return step_ref;
    }

    public void setStep_ref(String step_ref) {
        this.step_ref = step_ref;
    }

    public String getStep_matches() {
        return step_matches;
    }

    public void setStep_matches(String step_matches) {
        this.step_matches = step_matches;
    }

    public String getStep_args() {
        return step_args;
    }

    public void setStep_args(String step_args) {
        this.step_args = step_args;
    }

    public String getLst_update_date() {
        return lst_update_date;
    }

    public void setLst_update_date(String lst_update_date) {
        this.lst_update_date = lst_update_date;
    }

    public String getLst_update_user() {
        return lst_update_user;
    }

    public void setLst_update_user(String lst_update_user) {
        this.lst_update_user = lst_update_user;
    }
}
