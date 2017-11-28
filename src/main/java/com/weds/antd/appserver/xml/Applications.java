package com.weds.antd.appserver.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "applications")
public class Applications {

    private int versionsDelta;

    private String appsHashcode;

    private List<Application> applications;

    public Applications() {
    }

    @XmlElement(name = "versions__delta")
    public int getVersionsDelta() {
        return versionsDelta;
    }

    public void setVersionsDelta(int versionsDelta) {
        this.versionsDelta = versionsDelta;
    }

    @XmlElement(name = "apps__hashcode")
    public String getAppsHashcode() {
        return appsHashcode;
    }

    public void setAppsHashcode(String appsHashcode) {
        this.appsHashcode = appsHashcode;
    }

    @XmlElement(name = "application")
    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
