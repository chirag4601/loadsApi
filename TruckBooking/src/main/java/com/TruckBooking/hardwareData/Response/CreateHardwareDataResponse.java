package com.TruckBooking.hardwareData.Response;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CreateHardwareDataResponse {
    private String hardwareDataId;
    private String imei;
    private String simNumber;
    private String phoneNo;
}
