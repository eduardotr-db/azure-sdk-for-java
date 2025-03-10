// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceUpdateClient;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;

public class DeviceUpdateGetUpdate {
    public static void main(String[] args) {
        DeviceUpdateClient deviceUpdateClient
            = new DeviceUpdateClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("contoso.api.adu.microsoft.com")
                .instanceId("blue")
                .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.generated.deviceupdategetupdate.deviceupdategetupdate
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response
            = deviceUpdateClient.getUpdateWithResponse("microsoft", "adu", "1.0.0.0", requestOptions);
        // END:com.azure.iot.deviceupdate.generated.deviceupdategetupdate.deviceupdategetupdate
    }
}
