package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class ImportDetail {

    private Long id;

    @SerializedName("created_at_timestamp")
    private Long createdAtTimestamp;

}
