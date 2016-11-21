package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class ProjectDetailResponse {

    private Meta meta;

    @SerializedName("data")
    private ProjectDetail detail;

}
