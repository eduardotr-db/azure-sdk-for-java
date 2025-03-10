// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * API OAuth2 Authentication settings details.
 */
@Fluent
public final class OpenIdAuthenticationSettingsContract
    implements JsonSerializable<OpenIdAuthenticationSettingsContract> {
    /*
     * OAuth authorization server identifier.
     */
    private String openidProviderId;

    /*
     * How to send token to the server.
     */
    private List<BearerTokenSendingMethods> bearerTokenSendingMethods;

    /**
     * Creates an instance of OpenIdAuthenticationSettingsContract class.
     */
    public OpenIdAuthenticationSettingsContract() {
    }

    /**
     * Get the openidProviderId property: OAuth authorization server identifier.
     * 
     * @return the openidProviderId value.
     */
    public String openidProviderId() {
        return this.openidProviderId;
    }

    /**
     * Set the openidProviderId property: OAuth authorization server identifier.
     * 
     * @param openidProviderId the openidProviderId value to set.
     * @return the OpenIdAuthenticationSettingsContract object itself.
     */
    public OpenIdAuthenticationSettingsContract withOpenidProviderId(String openidProviderId) {
        this.openidProviderId = openidProviderId;
        return this;
    }

    /**
     * Get the bearerTokenSendingMethods property: How to send token to the server.
     * 
     * @return the bearerTokenSendingMethods value.
     */
    public List<BearerTokenSendingMethods> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods;
    }

    /**
     * Set the bearerTokenSendingMethods property: How to send token to the server.
     * 
     * @param bearerTokenSendingMethods the bearerTokenSendingMethods value to set.
     * @return the OpenIdAuthenticationSettingsContract object itself.
     */
    public OpenIdAuthenticationSettingsContract
        withBearerTokenSendingMethods(List<BearerTokenSendingMethods> bearerTokenSendingMethods) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("openidProviderId", this.openidProviderId);
        jsonWriter.writeArrayField("bearerTokenSendingMethods", this.bearerTokenSendingMethods,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenIdAuthenticationSettingsContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenIdAuthenticationSettingsContract if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenIdAuthenticationSettingsContract.
     */
    public static OpenIdAuthenticationSettingsContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenIdAuthenticationSettingsContract deserializedOpenIdAuthenticationSettingsContract
                = new OpenIdAuthenticationSettingsContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("openidProviderId".equals(fieldName)) {
                    deserializedOpenIdAuthenticationSettingsContract.openidProviderId = reader.getString();
                } else if ("bearerTokenSendingMethods".equals(fieldName)) {
                    List<BearerTokenSendingMethods> bearerTokenSendingMethods
                        = reader.readArray(reader1 -> BearerTokenSendingMethods.fromString(reader1.getString()));
                    deserializedOpenIdAuthenticationSettingsContract.bearerTokenSendingMethods
                        = bearerTokenSendingMethods;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenIdAuthenticationSettingsContract;
        });
    }
}
