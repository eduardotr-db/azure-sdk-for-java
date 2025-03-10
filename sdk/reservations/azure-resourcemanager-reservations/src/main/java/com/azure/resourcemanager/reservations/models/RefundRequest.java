// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request containing information needed for returning reservation.
 */
@Fluent
public final class RefundRequest implements JsonSerializable<RefundRequest> {
    /*
     * Properties needed for refund request including the session id from calculate refund, the scope, the reservation
     * to be returned and the return reason.
     */
    private RefundRequestProperties properties;

    /**
     * Creates an instance of RefundRequest class.
     */
    public RefundRequest() {
    }

    /**
     * Get the properties property: Properties needed for refund request including the session id from calculate refund,
     * the scope, the reservation to be returned and the return reason.
     * 
     * @return the properties value.
     */
    public RefundRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties needed for refund request including the session id from calculate refund,
     * the scope, the reservation to be returned and the return reason.
     * 
     * @param properties the properties value to set.
     * @return the RefundRequest object itself.
     */
    public RefundRequest withProperties(RefundRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RefundRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RefundRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RefundRequest.
     */
    public static RefundRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RefundRequest deserializedRefundRequest = new RefundRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedRefundRequest.properties = RefundRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRefundRequest;
        });
    }
}
