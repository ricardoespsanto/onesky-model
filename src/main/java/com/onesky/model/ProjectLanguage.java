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

}
