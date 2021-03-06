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
        if (!(o instanceof DataForFillingOutTheForm)) return false;
        DataForFillingOutTheForm that = (DataForFillingOutTheForm) o;
        return Objects.equals(getOperationSystem(), that.getOperationSystem()) && Objects.equals(getMachineClass(), that.getMachineClass())
                && Objects.equals(getMachineType(), that.getMachineType()) && Objects.equals(getLocalSSD(), that.getLocalSSD())
                && Objects.equals(getGRUsType(), that.getGRUsType()) && Objects.equals(getNumberOfGRUsType(), that.getNumberOfGRUsType())
                && Objects.equals(getDatacenterLocation(), that.getDatacenterLocation()) && Objects.equals(getCommittedUsage(), that.getCommittedUsage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperationSystem(), getMachineClass(), getMachineType(), getLocalSSD(), getGRUsType(), getNumberOfGRUsType(), getDatacenterLocation(), getCommittedUsage());
    }
}
