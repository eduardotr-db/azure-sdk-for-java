// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.options;

import com.azure.core.annotation.Fluent;
import com.azure.storage.blob.models.BlobLeaseRequestConditions;

/**
 * Extended options that may be passed when releasing a lease to a blob or container.
 */
@Fluent
public class BlobReleaseLeaseOptions {
    private BlobLeaseRequestConditions requestConditions;

    /**
     * Creates a new instance of {@link BlobReleaseLeaseOptions}.
     */
    public BlobReleaseLeaseOptions() {
    }

    /**
     * Gets the {@link BlobLeaseRequestConditions}.
     *
     * @return {@link BlobLeaseRequestConditions}
     */
    public BlobLeaseRequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the {@link BlobLeaseRequestConditions}.
     *
     * @param requestConditions {@link BlobLeaseRequestConditions}
     * @return The updated options.
     */
    public BlobReleaseLeaseOptions setRequestConditions(BlobLeaseRequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }
}
