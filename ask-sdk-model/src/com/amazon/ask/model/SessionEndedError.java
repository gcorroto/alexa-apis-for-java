/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error object providing more information about the error that occurred.
 */

@JsonDeserialize(builder = SessionEndedError.Builder.class)
public final class SessionEndedError {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("message")
    private String message = null;

    public static Builder builder() {
        return new Builder();
    }

    private SessionEndedError(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
    }

    /**
     * A string indicating the type of error that occurred.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.model.SessionEndedErrorType getType() {
        return com.amazon.ask.model.SessionEndedErrorType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * A string providing more information about the error.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionEndedError sessionEndedError = (SessionEndedError) o;
        return Objects.equals(this.type, sessionEndedError.type) &&
            Objects.equals(this.message, sessionEndedError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionEndedError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private String type;
        private String message;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.model.SessionEndedErrorType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("message")

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }


        public SessionEndedError build() {
            return new SessionEndedError(this);
        }
    }
}

