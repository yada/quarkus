/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.quarkus.creator;

import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author Alexey Loubyansky
 */
public class NoOpArtifactResolver extends AppArtifactResolverBase {

    @Override
    public void relink(AppArtifact appArtifact, Path localPath) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AppDependency> collectDependencies(AppArtifact artifact) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AppDependency> collectDependencies(AppArtifact root, List<AppDependency> deps) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> listLaterVersions(AppArtifact artifact, String upToVersion, boolean inclusive)
            throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getNextVersion(AppArtifact artifact, String upToVersion, boolean inclusive) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getLatestVersion(AppArtifact artifact, String upToVersion, boolean inclusive) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void doResolve(AppArtifact artifact) throws AppCreatorException {
        throw new UnsupportedOperationException();
    }
}
