// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Imaging procedures.
 */
@Immutable
public final class ImagingProcedureRecommendation extends ProcedureRecommendation {

    /*
     * Discriminator property for ProcedureRecommendation.
     */
    @Generated
    private String kind = "imagingProcedureRecommendation";

    /*
     * LOINC codes for the procedure.
     */
    @Generated
    private List<FhirR4CodeableConcept> procedureCodes;

    /*
     * Imaging procedures.
     */
    @Generated
    private final List<ImagingProcedure> imagingProcedures;

    /**
     * Creates an instance of ImagingProcedureRecommendation class.
     *
     * @param imagingProcedures the imagingProcedures value to set.
     */
    @Generated
    private ImagingProcedureRecommendation(List<ImagingProcedure> imagingProcedures) {
        this.imagingProcedures = imagingProcedures;
    }

    /**
     * Get the kind property: Discriminator property for ProcedureRecommendation.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the procedureCodes property: LOINC codes for the procedure.
     *
     * @return the procedureCodes value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getProcedureCodes() {
        return this.procedureCodes;
    }

    /**
     * Get the imagingProcedures property: Imaging procedures.
     *
     * @return the imagingProcedures value.
     */
    @Generated
    public List<ImagingProcedure> getImagingProcedures() {
        return this.imagingProcedures;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("extension", getExtension(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("imagingProcedures", this.imagingProcedures,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeArrayField("procedureCodes", this.procedureCodes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImagingProcedureRecommendation from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImagingProcedureRecommendation if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImagingProcedureRecommendation.
     */
    @Generated
    public static ImagingProcedureRecommendation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<FhirR4Extension> extension = null;
            List<ImagingProcedure> imagingProcedures = null;
            String kind = "imagingProcedureRecommendation";
            List<FhirR4CodeableConcept> procedureCodes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("extension".equals(fieldName)) {
                    extension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                } else if ("imagingProcedures".equals(fieldName)) {
                    imagingProcedures = reader.readArray(reader1 -> ImagingProcedure.fromJson(reader1));
                } else if ("kind".equals(fieldName)) {
                    kind = reader.getString();
                } else if ("procedureCodes".equals(fieldName)) {
                    procedureCodes = reader.readArray(reader1 -> FhirR4CodeableConcept.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            ImagingProcedureRecommendation deserializedImagingProcedureRecommendation
                = new ImagingProcedureRecommendation(imagingProcedures);
            deserializedImagingProcedureRecommendation.setExtension(extension);
            deserializedImagingProcedureRecommendation.kind = kind;
            deserializedImagingProcedureRecommendation.procedureCodes = procedureCodes;
            return deserializedImagingProcedureRecommendation;
        });
    }
}
