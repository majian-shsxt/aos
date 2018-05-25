package com.i2.entity;

public class Template {
    private Integer template_id;
    private String template_name;
    private String template_desc;
    private String template_flowcontent;
    private String lst_update_date;
    private String lst_update_user;

    public Integer getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(Integer template_id) {
        this.template_id = template_id;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public String getTemplate_desc() {
        return template_desc;
    }

    public void setTemplate_desc(String template_desc) {
        this.template_desc = template_desc;
    }

    public String getTemplate_flowcontent() {
        return template_flowcontent;
    }

    public void setTemplate_flowcontent(String template_flowcontent) {
        this.template_flowcontent = template_flowcontent;
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
