package com.epam.service;

import com.epam.model.DataForFillingOutTheForm;

public class DataCreator {
    private static final String NUMBER_OF_INSTANCE = "testdata.dataForFillingOutTheForm.NUMBER_OF_INSTANCE";
    private static final String OPERATION_SYSTEM = "testdata.dataForFillingOutTheForm.OPERATION_SYSTEM";
    private static final String MACHINE_CLASS = "testdata.dataForFillingOutTheForm.MACHINE_CLASS";
    private static final String MACHINE_TYPE = "testdata.dataForFillingOutTheForm.MACHINE_TYPE";
    private static final String LOCAL_SSD = "testdata.dataForFillingOutTheForm.LOCAL_SSD";
    private static final String GRUs_TYPE = "testdata.dataForFillingOutTheForm.GRUs_TYPE";
    private static final String NUMBER_OF_GRUs_TYPE = "testdata.dataForFillingOutTheForm.NUMBER_OF_GRUs_TYPE";
    private static final String DATACENTER_LOCATION = "testdata.dataForFillingOutTheForm.DATACENTER_LOCATION";
    private static final String COMMITTED_USAGE = "testdata.dataForFillingOutTheForm.COMMITTED_USAGE";
    private static final String NUMBER_OF_NODES = "testdata.dataForFillingOutTheForm.NUMBER_OF_NODES";


    public static DataForFillingOutTheForm dataWithProperty() {
        return new DataForFillingOutTheForm(TestDataReader.getTestData(NUMBER_OF_INSTANCE), TestDataReader.getTestData(OPERATION_SYSTEM),
                TestDataReader.getTestData(MACHINE_CLASS), TestDataReader.getTestData(MACHINE_TYPE), TestDataReader.getTestData(LOCAL_SSD), TestDataReader.getTestData(GRUs_TYPE),
                TestDataReader.getTestData(NUMBER_OF_GRUs_TYPE), TestDataReader.getTestData(DATACENTER_LOCATION), TestDataReader.getTestData(COMMITTED_USAGE),
                TestDataReader.getTestData(NUMBER_OF_NODES));
    }
}
