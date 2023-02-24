package org.example;

import java.util.LinkedList;
import java.util.List;

public class PersonOfInterest {
    private String ipAddress;
    private String name;    // name of person
    private String threatLevel;  // High or Average
    private List<String> comments;

    public PersonOfInterest(String ipAddress, String name, String threatLevel) {
        this.ipAddress = ipAddress;
        this.name = name;
        this.threatLevel = threatLevel;
        this.comments = new LinkedList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "PersonOfInterest{" +
                "ipAddress='" + ipAddress + '\'' +
                ", name='" + name + '\'' +
                ", threatLevel='" + threatLevel + '\'' +
                ", comments=" + comments +
                '}';
    }
}
