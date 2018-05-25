package com.i2.entity;

public class WorkFlow {
    private Integer workflow_id;
    private String workflow_name;
    private String workflow_desc;
    private String workflow_flowcontent;
    private String workflow_filecontent;
    private String workflow_filepath;
    private String app_id;
    private String lst_update_date;
    private String lst_update_user;

    public Integer getWorkflow_id() {
        return workflow_id;
    }

    public void setWorkflow_id(Integer workflow_id) {
        this.workflow_id = workflow_id;
    }

    public String getWorkflow_name() {
        return workflow_name;
    }

    public void setWorkflow_name(String workflow_name) {
        this.workflow_name = workflow_name;
    }

    public String getWorkflow_desc() {
        return workflow_desc;
    }

    public void setWorkflow_desc(String workflow_desc) {
        this.workflow_desc = workflow_desc;
    }

    public String getWorkflow_flowcontent() {
        return workflow_flowcontent;
    }

    public void setWorkflow_flowcontent(String workflow_flowcontent) {
        this.workflow_flowcontent = workflow_flowcontent;
    }

    public String getWorkflow_filecontent() {
        return workflow_filecontent;
    }

    public void setWorkflow_filecontent(String workflow_filecontent) {
        this.workflow_filecontent = workflow_filecontent;
    }

    public String getWorkflow_filepath() {
        return workflow_filepath;
    }

    public void setWorkflow_filepath(String workflow_filepath) {
        this.workflow_filepath = workflow_filepath;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
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
