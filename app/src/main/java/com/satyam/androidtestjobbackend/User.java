package com.satyam.androidtestjobbackend;

public class User {

    String n_product_uniq_id;
    String n_state_uniq_id;
    String c_state_name;
    String effective_from;
    String c_added_by_admin_user_id;
    String product_rate;
    String added_time;

    public User(String n_product_uniq_id, String n_state_uniq_id, String c_state_name, String effective_from, String c_added_by_admin_user_id, String product_rate, String added_time) {
        this.n_product_uniq_id = n_product_uniq_id;
        this.n_state_uniq_id = n_state_uniq_id;
        this.c_state_name = c_state_name;
        this.effective_from = effective_from;
        this.c_added_by_admin_user_id = c_added_by_admin_user_id;
        this.product_rate = product_rate;
        this.added_time = added_time;
    }

    public User() {
    }

    public String getN_product_uniq_id() {
        return n_product_uniq_id;
    }

    public void setN_product_uniq_id(String n_product_uniq_id) {
        this.n_product_uniq_id = n_product_uniq_id;
    }

    public String getN_state_uniq_id() {
        return n_state_uniq_id;
    }

    public void setN_state_uniq_id(String n_state_uniq_id) {
        this.n_state_uniq_id = n_state_uniq_id;
    }

    public String getC_state_name() {
        return c_state_name;
    }

    public void setC_state_name(String c_state_name) {
        this.c_state_name = c_state_name;
    }

    public String getEffective_from() {
        return effective_from;
    }

    public void setEffective_from(String effective_from) {
        this.effective_from = effective_from;
    }

    public String getC_added_by_admin_user_id() {
        return c_added_by_admin_user_id;
    }

    public void setC_added_by_admin_user_id(String c_added_by_admin_user_id) {
        this.c_added_by_admin_user_id = c_added_by_admin_user_id;
    }

    public String getProduct_rate() {
        return product_rate;
    }

    public void setProduct_rate(String product_rate) {
        this.product_rate = product_rate;
    }

    public String getAdded_time() {
        return added_time;
    }

    public void setAdded_time(String added_time) {
        this.added_time = added_time;
    }
}
