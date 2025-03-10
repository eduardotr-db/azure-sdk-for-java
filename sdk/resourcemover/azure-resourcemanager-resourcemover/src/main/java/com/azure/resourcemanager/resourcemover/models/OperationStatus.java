// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.resourcemanager.resourcemover.fluent.models.OperationStatusInner;

/**
 * An immutable client-side representation of OperationStatus.
 */
public interface OperationStatus {
    /**
     * Gets the id property: Resource Id.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Operation name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: Status of the operation. ARM expects the terminal status to be one of Succeeded/
     * Failed/ Canceled. All other values imply that the operation is still running.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the startTime property: Start time.
     * 
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the endTime property: End time.
     * 
     * @return the endTime value.
     */
    String endTime();

    /**
     * Gets the error property: Error stating all error details for the operation.
     * 
     * @return the error value.
     */
    OperationStatusError error();

    /**
     * Gets the properties property: Custom data.
     * 
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.resourcemover.fluent.models.OperationStatusInner object.
     * 
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
