package com.onesky.model;

import com.google.gson.annotations.SerializedName;

import lombok.Value;

@Value
public class ProjectDetail {

    private long id;
    private String name;
    private String description;

    @SerializedName("project_type")
    private ProjectType type;

    @SerializedName("string_count")
    private Long stringCount;

    @SerializedName("word_count")
    private Long StringWordCount;
}
