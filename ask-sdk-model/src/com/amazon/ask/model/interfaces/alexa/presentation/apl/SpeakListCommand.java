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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read the contents of a range of items inside a common container. Each item will scroll into view before speech. Each item should have a speech property, but it is not required.
 */

@JsonDeserialize(builder = SpeakListCommand.Builder.class)
public final class SpeakListCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("align")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align = null;

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("count")
    private String count = null;

    @JsonProperty("minimumDwellTime")
    private String minimumDwellTime = null;

    @JsonProperty("start")
    private String start = null;

    private SpeakListCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SpeakListCommand(Builder builder) {
        String discriminatorValue = "SpeakList";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.screenLock != null) {
            this.screenLock = builder.screenLock;
        }
        if (builder.sequencer != null) {
            this.sequencer = builder.sequencer;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.align != null) {
            this.align = builder.align;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.count != null) {
            this.count = builder.count;
        }
        if (builder.minimumDwellTime != null) {
            this.minimumDwellTime = builder.minimumDwellTime;
        }
        if (builder.start != null) {
            this.start = builder.start;
        }
    }

    /**
     * Get align
     * @return align
    **/
    @JsonProperty("align")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.Align getAlign() {
        return align;
    }


    /**
     * The id of the component to read.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }


    /**
     * The number of items to speak
     * @return count
    **/
    @JsonProperty("count")
    public String getCount() {
        return count;
    }


    /**
     * The minimum number of milliseconds that an item will be highlighted for. Defaults to 0.
     * @return minimumDwellTime
    **/
    @JsonProperty("minimumDwellTime")
    public String getMinimumDwellTime() {
        return minimumDwellTime;
    }


    /**
     * The 0-based index of the first item to speak
     * @return start
    **/
    @JsonProperty("start")
    public String getStart() {
        return start;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpeakListCommand interfacesAlexaPresentationAplSpeakListCommand = (SpeakListCommand) o;
        return Objects.equals(this.align, interfacesAlexaPresentationAplSpeakListCommand.align) &&
            Objects.equals(this.componentId, interfacesAlexaPresentationAplSpeakListCommand.componentId) &&
            Objects.equals(this.count, interfacesAlexaPresentationAplSpeakListCommand.count) &&
            Objects.equals(this.minimumDwellTime, interfacesAlexaPresentationAplSpeakListCommand.minimumDwellTime) &&
            Objects.equals(this.start, interfacesAlexaPresentationAplSpeakListCommand.start) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(align, componentId, count, minimumDwellTime, start, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpeakListCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    align: ").append(toIndentedString(align)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    minimumDwellTime: ").append(toIndentedString(minimumDwellTime)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
        private String delay;
        private String description;
        private Boolean screenLock;
        private String sequencer;
        private Boolean when;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align;
        private String componentId;
        private String count;
        private String minimumDwellTime;
        private String start;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        @JsonProperty("delay")

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
            return this;
        }

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("screenLock")

        public Builder withScreenLock(Boolean screenLock) {
            this.screenLock = screenLock;
            return this;
        }


        @JsonProperty("sequencer")

        public Builder withSequencer(String sequencer) {
            this.sequencer = sequencer;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("align")

        public Builder withAlign(com.amazon.ask.model.interfaces.alexa.presentation.apl.Align align) {
            this.align = align;
            return this;
        }


        @JsonProperty("componentId")

        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        @JsonProperty("count")

        public Builder withCount(Integer count) {
            this.count = String.valueOf(count);
            return this;
        }

        @JsonProperty("count")

        public Builder withCount(String countExpression) {
            this.count = countExpression;
            return this;
        }

        @JsonProperty("minimumDwellTime")

        public Builder withMinimumDwellTime(Integer minimumDwellTime) {
            this.minimumDwellTime = String.valueOf(minimumDwellTime);
            return this;
        }

        @JsonProperty("minimumDwellTime")

        public Builder withMinimumDwellTime(String minimumDwellTimeExpression) {
            this.minimumDwellTime = minimumDwellTimeExpression;
            return this;
        }

        @JsonProperty("start")

        public Builder withStart(Integer start) {
            this.start = String.valueOf(start);
            return this;
        }

        @JsonProperty("start")

        public Builder withStart(String startExpression) {
            this.start = startExpression;
            return this;
        }

        public SpeakListCommand build() {
            return new SpeakListCommand(this);
        }
    }
}

