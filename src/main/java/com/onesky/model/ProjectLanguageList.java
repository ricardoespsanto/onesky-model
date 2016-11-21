package com.onesky.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class ProjectLanguageList {

    private Meta meta;

    @SerializedName("data")
    private List<ProjectLanguage> languages;
}
