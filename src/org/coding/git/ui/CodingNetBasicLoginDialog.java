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
package org.coding.git.ui;

import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.coding.git.util.CodingNetAuthData;


/**
 * @author robin
 */
public class CodingNetBasicLoginDialog extends CodingNetLoginDialog {

  public CodingNetBasicLoginDialog(@NotNull Project project, @NotNull CodingNetAuthData oldAuthData, @NotNull String host) {
    super(project, oldAuthData);
    myCodingNetLoginPanel.lockAuthType(CodingNetAuthData.AuthType.BASIC);
    myCodingNetLoginPanel.lockHost(host);
  }
}
