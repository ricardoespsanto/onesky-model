package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class UploadedFile {

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("string_count")
    private int stringCount;

    private LastImport lastImport;

    @SerializedName("uploaded_at")
    private String uploadedAt;

    @SerializedName("uploaded_at_timestamp")
    private long uploadedAtTimestamp;

}
