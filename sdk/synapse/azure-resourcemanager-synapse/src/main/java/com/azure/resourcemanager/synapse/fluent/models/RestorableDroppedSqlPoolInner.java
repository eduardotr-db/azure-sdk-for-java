// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A restorable dropped Sql pool.
 */
@Immutable
public final class RestorableDroppedSqlPoolInner extends ProxyResource {
    /*
     * The geo-location where the resource lives
     */
    private String location;

    /*
     * The properties of a restorable dropped Sql pool
     */
    private RestorableDroppedSqlPoolProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of RestorableDroppedSqlPoolInner class.
     */
    public RestorableDroppedSqlPoolInner() {
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: The properties of a restorable dropped Sql pool.
     * 
     * @return the innerProperties value.
     */
    private RestorableDroppedSqlPoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the databaseName property: The name of the database.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the edition property: The edition of the database.
     * 
     * @return the edition value.
     */
    public String edition() {
        return this.innerProperties() == null ? null : this.innerProperties().edition();
    }

    /**
     * Get the maxSizeBytes property: The max size in bytes of the database.
     * 
     * @return the maxSizeBytes value.
     */
    public String maxSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeBytes();
    }

    /**
     * Get the serviceLevelObjective property: The service level objective name of the database.
     * 
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelObjective();
    }

    /**
     * Get the elasticPoolName property: The elastic pool name of the database.
     * 
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.innerProperties() == null ? null : this.innerProperties().elasticPoolName();
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     * 
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().deletionDate();
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestoreDate();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableDroppedSqlPoolInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableDroppedSqlPoolInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestorableDroppedSqlPoolInner.
     */
    public static RestorableDroppedSqlPoolInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableDroppedSqlPoolInner deserializedRestorableDroppedSqlPoolInner
                = new RestorableDroppedSqlPoolInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRestorableDroppedSqlPoolInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRestorableDroppedSqlPoolInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRestorableDroppedSqlPoolInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRestorableDroppedSqlPoolInner.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRestorableDroppedSqlPoolInner.innerProperties
                        = RestorableDroppedSqlPoolProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableDroppedSqlPoolInner;
        });
    }
}
