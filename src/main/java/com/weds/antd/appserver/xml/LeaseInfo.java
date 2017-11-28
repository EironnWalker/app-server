package com.weds.antd.appserver.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "leaseInfo")
public class LeaseInfo {

    private int renewalIntervalInSecs;

    private int durationInSecs;

    private String registrationTimestamp;

    private String lastRenewalTimestamp;

    private String evictionTimestamp;

    private String serviceUpTimestamp;

    public LeaseInfo() {
    }

    @XmlElement(name = "renewalIntervalInSecs")
    public int getRenewalIntervalInSecs() {
        return renewalIntervalInSecs;
    }

    public void setRenewalIntervalInSecs(int renewalIntervalInSecs) {
        this.renewalIntervalInSecs = renewalIntervalInSecs;
    }

    @XmlElement(name = "durationInSecs")
    public int getDurationInSecs() {
        return durationInSecs;
    }

    public void setDurationInSecs(int durationInSecs) {
        this.durationInSecs = durationInSecs;
    }

    @XmlElement(name = "registrationTimestamp")
    public String getRegistrationTimestamp() {
        return registrationTimestamp;
    }

    public void setRegistrationTimestamp(String registrationTimestamp) {
        this.registrationTimestamp = registrationTimestamp;
    }

    @XmlElement(name = "lastRenewalTimestamp")
    public String getLastRenewalTimestamp() {
        return lastRenewalTimestamp;
    }

    public void setLastRenewalTimestamp(String lastRenewalTimestamp) {
        this.lastRenewalTimestamp = lastRenewalTimestamp;
    }

    @XmlElement(name = "evictionTimestamp")
    public String getEvictionTimestamp() {
        return evictionTimestamp;
    }

    public void setEvictionTimestamp(String evictionTimestamp) {
        this.evictionTimestamp = evictionTimestamp;
    }

    @XmlElement(name = "serviceUpTimestamp")
    public String getServiceUpTimestamp() {
        return serviceUpTimestamp;
    }

    public void setServiceUpTimestamp(String serviceUpTimestamp) {
        this.serviceUpTimestamp = serviceUpTimestamp;
    }
}
