package com.company.testnestedlist.client;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.company.testnestedlist.project.Project;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|name")
@Table(name = "TESTNESTEDLIST_CLIENT")
@Entity(name = "testnestedlist$Client")
public class Client extends BaseLongIdEntity {
    private static final long serialVersionUID = -1161956300614348546L;

    @Column(name = "NAME", unique = true)
    protected String name;

    @OneToMany(mappedBy = "client")
    protected List<Project> projects;

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}