package org.umc_project.study.dto;

import lombok.Getter;

import java.util.LinkedList;

@Getter
public class ReviewRequestDTO {

    Long shopId;
    Long userId;
    Float rating;
    String content;
    LinkedList<String> images;


}
