// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.fluent.models.SessionPoolInner;
import java.io.IOException;
import java.util.List;

/**
 * Session pool collection Azure resource.
 */
@Fluent
public final class SessionPoolCollection implements JsonSerializable<SessionPoolCollection> {
    /*
     * Collection of resources.
     */
    private List<SessionPoolInner> value;

    /*
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of SessionPoolCollection class.
     */
    public SessionPoolCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<SessionPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the SessionPoolCollection object itself.
     */
    public SessionPoolCollection withValue(List<SessionPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model SessionPoolCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SessionPoolCollection.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionPoolCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionPoolCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SessionPoolCollection.
     */
    public static SessionPoolCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionPoolCollection deserializedSessionPoolCollection = new SessionPoolCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SessionPoolInner> value = reader.readArray(reader1 -> SessionPoolInner.fromJson(reader1));
                    deserializedSessionPoolCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSessionPoolCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionPoolCollection;
        });
    }
}
