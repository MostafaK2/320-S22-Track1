package org.clogq.demo.model;
import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "BUSINESS_PROCESS_LOG_T")
public class BusinessProcessLog {
    @Column(name = "eai_transaction_id")
    private String eai_transaction_id;
    @Column(name = "eai_domain")
    private String eai_domain;
    @Column(name = "publishing_business_domain")
    private String publishing_business_domain;
    @Column(name = "business_process")
    private String business_process;
    @Column(name = "eai_transaction_create_time")
    private Timestamp eai_transaction_create_time;
    @Column(name = "key1_app_context_name")
    private String key1_app_context_name;
    @Column(name = "key1_app_context_value")
    private String key1_app_context_value;
    @Column(name = "key2_app_context_name")
    private String key2_app_context_name;
    @Column(name = "key2_app_context_value")
    private String key2_app_context_value;
    @Column(name = "global_instance_id")
    private String global_instance_id;
    @Column(name = "business_domain")
    private String business_domain;
    @Column(name = "application")
    private String application;
    @Column(name = "activity")
    private String activity;

    public BusinessProcessLog(){
    }

    public BusinessProcessLog(String eai_transaction_id, String eai_domain, String publishing_business_domain, String business_process, Timestamp eai_transaction_create_time, String key1_app_context_name, String key1_app_context_value, String key2_app_context_name, String key2_app_context_value, String global_instance_id, String business_domain, String application, String activity){
        this.eai_transaction_id = eai_transaction_id;
        this.eai_domain = eai_domain;
        this.publishing_business_domain = publishing_business_domain;
        this.business_process = business_process;
        this.eai_transaction_create_time = eai_transaction_create_time;
        this.key1_app_context_name = key1_app_context_name;
        this.key1_app_context_value = key1_app_context_value;
        this.key2_app_context_name = key2_app_context_name;
        this.key2_app_context_value = key2_app_context_value;
        this.global_instance_id = global_instance_id;
        this.business_domain = business_domain;
        this.application = application;
        this.activity = activity;   
    }

    public String get_eai_transaction_id(){
        return eai_transaction_id;
    }

    public String get_eai_domain(){
        return eai_domain;
    }

    public String get_publishing_business_domain(){
        return publishing_business_domain;
    }

    public String get_business_process(){
        return business_process;
    }

    public Timestamp get_eai_transaction_create_time(){
        return eai_transaction_create_time;
    }

    public String get_key1_app_context_name(){
        return key1_app_context_name;
    }

    public String get_key1_app_context_value(){
        return key1_app_context_value;
    }

    public String get_key2_app_context_name(){
        return key2_app_context_name;
    }

    public String get_key2_app_context_value(){
        return key2_app_context_value;
    }

    public String get_global_instance_id(){
        return global_instance_id;
    }

    public String get_business_domain(){
        return business_domain;
    }

    public String get_application(){
        return application;
    }
    
    public String get_activity(){
        return activity;
    }

}

