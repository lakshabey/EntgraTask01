package com.example.EntgraTask01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "DEVICE_TABLE")
public class Device {

    @Id
    @GeneratedValue
    private int id;
    @Column(name="DeviceName")
    private String deviceName;;
    private String deviceModel;
    private String deviceStatus;
    private String enrolledTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getEnrolledTime() {
        return enrolledTime;
    }

    public void setEnrolledTime(String enrolledTime) {
        this.enrolledTime = enrolledTime;
    }
}
