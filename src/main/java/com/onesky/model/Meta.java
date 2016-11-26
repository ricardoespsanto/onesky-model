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

/**
 * Generic meta data about a given object
 */
@Value
public class Meta {

    private String status;

    @SerializedName("record_count")
    private int recordCount;

    @SerializedName("page_count")
    private int pageCount;

    @SerializedName("next_page")
    private int nextPage;

    @SerializedName("prev_page")
    private int previousPage;

    @SerializedName("first_page")
    private int firstPage;

    @SerializedName("last_page")
    private int lastPage;

    private String message;

}
