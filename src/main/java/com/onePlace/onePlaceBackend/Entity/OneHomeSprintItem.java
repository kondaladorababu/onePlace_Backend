package com.onePlace.onePlaceBackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="onehomesprintitems")
public class OneHomeSprintItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="releaseversion")
    private String releaseVersion;

    @Column(name="startdate")
    private String startDate;

    @Column(name="enddate")
    private String endDate;

    @Column(name="teamname")
    private String teamName;

    @Column(name="status")
    private String status;

    public OneHomeSprintItem(){

    }

    public OneHomeSprintItem(String releaseVersion, String startDate, String endDate, String teamName, String status) {
        this.releaseVersion = releaseVersion;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamName = teamName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OneHomeSprintItem{" +
                "id=" + id +
                ", releaseVersion='" + releaseVersion + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", teamName='" + teamName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
