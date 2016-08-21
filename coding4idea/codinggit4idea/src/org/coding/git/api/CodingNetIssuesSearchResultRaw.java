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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"UnusedDeclaration", "ConstantConditions"})
class CodingNetIssuesSearchResultRaw implements ICodingNetDataConstructor {
  @Nullable public List<CodingNetIssueRaw> items;

  @NotNull
  CodingNetIssuesSearchResult createIssueSearchResult() {
    List<CodingNetIssue> issues = new ArrayList<CodingNetIssue>();
    for (CodingNetIssueRaw raw : items) {
      issues.add(raw.createIssue());
    }
    return new CodingNetIssuesSearchResult(issues);
  }


  @SuppressWarnings("unchecked")
  @NotNull
  @Override
  public <T> T create(@NotNull Class<T> resultClass) {
    if (resultClass == CodingNetIssuesSearchResult.class) {
      return (T)createIssueSearchResult();
    }

    throw new ClassCastException(this.getClass().getName() + ": bad class type: " + resultClass.getName());
  }
}
