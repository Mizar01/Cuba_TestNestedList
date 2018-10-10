package com.company.testnestedlist.project;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.company.testnestedlist.client.Client;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|code")
@Table(name = "TESTNESTEDLIST_PROJECT")
@Entity(name = "testnestedlist$Project")
public class Project extends BaseLongIdEntity {
    private static final long serialVersionUID = -5904071240624667242L;

    @Column(name = "CODE", unique = true)
    protected String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


}