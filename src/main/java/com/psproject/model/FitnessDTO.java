package com.psproject.model;

import lombok.Data;

@Data
public class FitnessDTO {

    private int fitness_key;
    private int member_key;
    private String fitness_title;
    private int fitness_content;
    private int fitness_complete;
    private int fitness_check;
    private String create_at;
    private String updated_at;

}
