package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class FileUploadDetail {

    private String name;

    private String format;

    @SerializedName("language")
    private LanguageDetail languageDetail;

    @SerializedName("import")
    private ImportDetail importDetail;

}
