package com.epam.model;

import java.util.Objects;

public class DataForFillingOutTheForm {
    private String numberOfInstance;
    private String operationSystem;
    private String machineClass;
    private String machineType;
    private String localSSD;
    private String GRUsType;
    private String numberOfGRUsType;
    private String datacenterLocation;
    private String committedUsage;
    private String numberOfNodes;


    public DataForFillingOutTheForm(String numberOfInstance, String operationSystem, String machineClass,
                                    String machineType, String localSSD, String GRUsType, String numberOfGRUsType,
                                    String datacenterLocation, String committedUsage, String numberOfNodes) {
        this.numberOfInstance = numberOfInstance;
        this.operationSystem = operationSystem;
        this.machineClass = machineClass;
        this.machineType = machineType;
        this.localSSD = localSSD;
        this.GRUsType = GRUsType;
        this.numberOfGRUsType = numberOfGRUsType;
        this.datacenterLocation = datacenterLocation;
        this.committedUsage = committedUsage;
        this.numberOfNodes = numberOfNodes;
    }

    public String getNumberOfNodes() {
        return numberOfNodes;
    }

    public String getNumberOfInstance() {
        return numberOfInstance;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getMachineClass() {
        return machineClass;
    }

    public void setMachineClass(String machineClass) {
        this.machineClass = machineClass;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getGRUsType() {
        return GRUsType;
    }

    public void setGRUsType(String GRUsType) {
        this.GRUsType = GRUsType;
    }

    public String getNumberOfGRUsType() {
        return numberOfGRUsType;
    }

    public void setNumberOfGRUsType(String numberOfGRUsType) {
        this.numberOfGRUsType = numberOfGRUsType;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataForFillingOutTheForm that = (DataForFillingOutTheForm) o;
        return Objects.equals(operationSystem, that.operationSystem) && Objects.equals(machineClass, that.machineClass)
                && Objects.equals(machineType, that.machineType) && Objects.equals(localSSD, that.localSSD)
                && Objects.equals(GRUsType, that.GRUsType) && Objects.equals(numberOfGRUsType, that.numberOfGRUsType)
                && Objects.equals(datacenterLocation, that.datacenterLocation) && Objects.equals(committedUsage, that.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationSystem, machineClass, machineType, localSSD, GRUsType, numberOfGRUsType, datacenterLocation, committedUsage);
    }
}
