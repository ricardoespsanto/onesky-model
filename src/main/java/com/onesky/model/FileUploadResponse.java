package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class FileUploadResponse {

    private Meta meta;

    @SerializedName("data")
    private FileUploadDetail detail;

}
