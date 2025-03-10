// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotoperations.fluent.BrokerAuthenticationsClient;
import com.azure.resourcemanager.iotoperations.fluent.models.BrokerAuthenticationResourceInner;
import com.azure.resourcemanager.iotoperations.models.BrokerAuthenticationResource;
import com.azure.resourcemanager.iotoperations.models.BrokerAuthentications;

public final class BrokerAuthenticationsImpl implements BrokerAuthentications {
    private static final ClientLogger LOGGER = new ClientLogger(BrokerAuthenticationsImpl.class);

    private final BrokerAuthenticationsClient innerClient;

    private final com.azure.resourcemanager.iotoperations.IoTOperationsManager serviceManager;

    public BrokerAuthenticationsImpl(BrokerAuthenticationsClient innerClient,
        com.azure.resourcemanager.iotoperations.IoTOperationsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BrokerAuthenticationResource> getWithResponse(String resourceGroupName, String instanceName,
        String brokerName, String authenticationName, Context context) {
        Response<BrokerAuthenticationResourceInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, instanceName, brokerName, authenticationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BrokerAuthenticationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BrokerAuthenticationResource get(String resourceGroupName, String instanceName, String brokerName,
        String authenticationName) {
        BrokerAuthenticationResourceInner inner
            = this.serviceClient().get(resourceGroupName, instanceName, brokerName, authenticationName);
        if (inner != null) {
            return new BrokerAuthenticationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String instanceName, String brokerName, String authenticationName) {
        this.serviceClient().delete(resourceGroupName, instanceName, brokerName, authenticationName);
    }

    public void delete(String resourceGroupName, String instanceName, String brokerName, String authenticationName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, instanceName, brokerName, authenticationName, context);
    }

    public PagedIterable<BrokerAuthenticationResource> listByResourceGroup(String resourceGroupName,
        String instanceName, String brokerName) {
        PagedIterable<BrokerAuthenticationResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, instanceName, brokerName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new BrokerAuthenticationResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BrokerAuthenticationResource> listByResourceGroup(String resourceGroupName,
        String instanceName, String brokerName, Context context) {
        PagedIterable<BrokerAuthenticationResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, instanceName, brokerName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new BrokerAuthenticationResourceImpl(inner1, this.manager()));
    }

    public BrokerAuthenticationResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instanceName = ResourceManagerUtils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        String brokerName = ResourceManagerUtils.getValueFromIdByName(id, "brokers");
        if (brokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'brokers'.", id)));
        }
        String authenticationName = ResourceManagerUtils.getValueFromIdByName(id, "authentications");
        if (authenticationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authentications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, instanceName, brokerName, authenticationName, Context.NONE)
            .getValue();
    }

    public Response<BrokerAuthenticationResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instanceName = ResourceManagerUtils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        String brokerName = ResourceManagerUtils.getValueFromIdByName(id, "brokers");
        if (brokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'brokers'.", id)));
        }
        String authenticationName = ResourceManagerUtils.getValueFromIdByName(id, "authentications");
        if (authenticationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authentications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, instanceName, brokerName, authenticationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instanceName = ResourceManagerUtils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        String brokerName = ResourceManagerUtils.getValueFromIdByName(id, "brokers");
        if (brokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'brokers'.", id)));
        }
        String authenticationName = ResourceManagerUtils.getValueFromIdByName(id, "authentications");
        if (authenticationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authentications'.", id)));
        }
        this.delete(resourceGroupName, instanceName, brokerName, authenticationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instanceName = ResourceManagerUtils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        String brokerName = ResourceManagerUtils.getValueFromIdByName(id, "brokers");
        if (brokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'brokers'.", id)));
        }
        String authenticationName = ResourceManagerUtils.getValueFromIdByName(id, "authentications");
        if (authenticationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authentications'.", id)));
        }
        this.delete(resourceGroupName, instanceName, brokerName, authenticationName, context);
    }

    private BrokerAuthenticationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iotoperations.IoTOperationsManager manager() {
        return this.serviceManager;
    }

    public BrokerAuthenticationResourceImpl define(String name) {
        return new BrokerAuthenticationResourceImpl(name, this.manager());
    }
}
