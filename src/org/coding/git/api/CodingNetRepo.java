/*
 * Copyright 2016 Coding
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coding.git.api;

import com.intellij.openapi.util.text.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class CodingNetRepo {
    @NotNull
    private  String myName;
    @NotNull
    private String myDescription;

    private boolean myIsPrivate;
    private boolean myIsFork;

    @NotNull
    private String myHtmlUrl;
    @NotNull
    private String myCloneUrl;

    @Nullable
    private String myDefaultBranch;

    @NotNull
    private CodingNetUser myOwner;

    private String myHttpsUrl;

    public CodingNetRepo(String httpsUrl) {
        myHttpsUrl = httpsUrl;
    }

    public String getHttpsUrl() {
        return myHttpsUrl;
    }

    public CodingNetRepo(@NotNull String name,
                         @Nullable String description,
                         boolean isPrivate,
                         boolean isFork,
                         @NotNull String htmlUrl,
                         @NotNull String cloneUrl,
                         @Nullable String defaultBranch,
                         @NotNull CodingNetUser owner) {
        myName = name;
        myDescription = StringUtil.notNullize(description);
        myIsPrivate = isPrivate;
        myIsFork = isFork;
        myHtmlUrl = htmlUrl;
        myCloneUrl = cloneUrl;
        myDefaultBranch = defaultBranch;
        myOwner = owner;
    }

    @NotNull
    public String getName() {
        return myName;
    }

    @NotNull
    public String getFullName() {
        return getUserName() + "/" + getName();
    }

    @NotNull
    public String getDescription() {
        return myDescription;
    }

    public boolean isPrivate() {
        return myIsPrivate;
    }

    public boolean isFork() {
        return myIsFork;
    }

    @NotNull
    public String getHtmlUrl() {
        return myHtmlUrl;
    }

    @NotNull
    public String getCloneUrl() {
        return myCloneUrl;
    }

    @Nullable
    public String getDefaultBranch() {
        return myDefaultBranch;
    }

    @NotNull
    public CodingNetUser getOwner() {
        return myOwner;
    }

    @NotNull
    public String getUserName() {
        return getOwner().getLogin();
    }

    @NotNull
    public CodingNetFullPath getFullPath() {
        return new CodingNetFullPath(getUserName(), getName());
    }
}

