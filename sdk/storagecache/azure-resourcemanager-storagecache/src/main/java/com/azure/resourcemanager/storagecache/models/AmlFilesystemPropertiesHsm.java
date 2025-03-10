// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Hydration and archive settings and status.
 */
@Fluent
public final class AmlFilesystemPropertiesHsm implements JsonSerializable<AmlFilesystemPropertiesHsm> {
    /*
     * Specifies HSM settings of the AML file system.
     */
    private AmlFilesystemHsmSettings settings;

    /*
     * Archive status
     */
    private List<AmlFilesystemArchive> archiveStatus;

    /**
     * Creates an instance of AmlFilesystemPropertiesHsm class.
     */
    public AmlFilesystemPropertiesHsm() {
    }

    /**
     * Get the settings property: Specifies HSM settings of the AML file system.
     * 
     * @return the settings value.
     */
    public AmlFilesystemHsmSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Specifies HSM settings of the AML file system.
     * 
     * @param settings the settings value to set.
     * @return the AmlFilesystemPropertiesHsm object itself.
     */
    public AmlFilesystemPropertiesHsm withSettings(AmlFilesystemHsmSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the archiveStatus property: Archive status.
     * 
     * @return the archiveStatus value.
     */
    public List<AmlFilesystemArchive> archiveStatus() {
        return this.archiveStatus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (settings() != null) {
            settings().validate();
        }
        if (archiveStatus() != null) {
            archiveStatus().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("settings", this.settings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmlFilesystemPropertiesHsm from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmlFilesystemPropertiesHsm if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AmlFilesystemPropertiesHsm.
     */
    public static AmlFilesystemPropertiesHsm fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmlFilesystemPropertiesHsm deserializedAmlFilesystemPropertiesHsm = new AmlFilesystemPropertiesHsm();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("settings".equals(fieldName)) {
                    deserializedAmlFilesystemPropertiesHsm.settings = AmlFilesystemHsmSettings.fromJson(reader);
                } else if ("archiveStatus".equals(fieldName)) {
                    List<AmlFilesystemArchive> archiveStatus
                        = reader.readArray(reader1 -> AmlFilesystemArchive.fromJson(reader1));
                    deserializedAmlFilesystemPropertiesHsm.archiveStatus = archiveStatus;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmlFilesystemPropertiesHsm;
        });
    }
}
