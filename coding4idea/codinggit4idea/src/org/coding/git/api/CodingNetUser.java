/*
 * Copyright 2000-2013 JetBrains s.r.o.
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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * @author robin
 */
public class CodingNetUser {
    @NotNull
    private String myLogin;

    private String myHtmlUrl;

    private String myAvatarUrl;

    public CodingNetUser() {

    }


    public CodingNetUser(@NotNull String login, @NotNull String htmlUrl, @Nullable String avatarUrl) {
        myLogin = login;
        myHtmlUrl = htmlUrl;
        myAvatarUrl = avatarUrl;
    }

    @NotNull
    public String getLogin() {
        return myLogin;
    }

    @NotNull
    public String getHtmlUrl() {
        return myHtmlUrl;
    }

    @Nullable
    public String getAvatarUrl() {
        return myAvatarUrl;
    }
}
