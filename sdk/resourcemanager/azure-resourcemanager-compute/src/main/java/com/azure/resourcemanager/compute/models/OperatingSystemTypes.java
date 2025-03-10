// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

/**
 * The Operating System type.
 */
public enum OperatingSystemTypes {
    /**
     * Enum value Windows.
     */
    WINDOWS("Windows"),

    /**
     * Enum value Linux.
     */
    LINUX("Linux");

    /**
     * The actual serialized value for a OperatingSystemTypes instance.
     */
    private final String value;

    OperatingSystemTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperatingSystemTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OperatingSystemTypes object, or null if unable to parse.
     */
    public static OperatingSystemTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        OperatingSystemTypes[] items = OperatingSystemTypes.values();
        for (OperatingSystemTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
