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
package org.coding.git.exceptions;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;


/**
 * @author robin
 */
public class CodingNetConfusingException extends IOException {
  private String myDetails;

  public CodingNetConfusingException() {
  }

  public CodingNetConfusingException(String message) {
    super(message);
  }

  public CodingNetConfusingException(String message, Throwable cause) {
    super(message, cause);
  }

  public CodingNetConfusingException(Throwable cause) {
    super(cause);
  }

  public void setDetails(@Nullable String details) {
    myDetails = details;
  }

  @Override
  public String getMessage() {
    if (myDetails == null) {
      return super.getMessage();
    }
    else {
      return myDetails + "\n\n" + super.getMessage();
    }
  }
}
