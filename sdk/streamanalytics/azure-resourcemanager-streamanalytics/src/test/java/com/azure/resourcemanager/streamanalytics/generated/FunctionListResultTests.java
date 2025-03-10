// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.FunctionListResult;

public final class FunctionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FunctionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"hcffcyddglmjthjq\",\"properties\":{\"inputs\":[{},{},{},{}],\"output\":{\"dataType\":\"cxmqciwqvhkhix\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"dtopbob\",\"type\":\"ghmewuam\",\"id\":\"hrzayvvtpgvdf\"},{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"tkftutqxlngx\",\"properties\":{\"inputs\":[{}],\"output\":{\"dataType\":\"nxkrx\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"i\",\"type\":\"thz\",\"id\":\"qdrabhjybigehoqf\"},{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"skanyk\",\"properties\":{\"inputs\":[{},{},{}],\"output\":{\"dataType\":\"y\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"ywgndrv\",\"type\":\"hzgpphrcgyncocpe\",\"id\":\"vmmcoofs\"},{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"evgbmqjq\",\"properties\":{\"inputs\":[{}],\"output\":{\"dataType\":\"ivkwlzuvccfwnfnb\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"ionle\",\"type\":\"etqgtzxdpnq\",\"id\":\"qwxrjfeallnw\"}],\"nextLink\":\"bisnja\"}")
            .toObject(FunctionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FunctionListResult model = new FunctionListResult();
        model = BinaryData.fromObject(model).toObject(FunctionListResult.class);
    }
}
