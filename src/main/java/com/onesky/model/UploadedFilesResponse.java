package com.onesky.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class UploadedFilesResponse {

    private Meta meta;

    @SerializedName("data")
    private List<UploadedFile> uploadedFiles;
}
