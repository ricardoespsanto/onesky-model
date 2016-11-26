/*
 * Copyright 2016 Dustriel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class ProjectLanguage {

    private String code;

    @SerializedName("english_name")
    private String englishName;

    @SerializedName("local_name")
    private String localName;

    private String locale;

    private String region;

    @SerializedName("is_base_language")
    private boolean isBaseLanguage;

    @SerializedName("is_ready_to_publish")
    private boolean isReadyToPublish;

    @SerializedName("translation_progress")
    private String translationProgress;

    @SerializedName("uploaded_at")
    private String uploadedAt;

    @SerializedName("uploaded_at_timestamp")
    private long uploadedAtTimestamp;
}
