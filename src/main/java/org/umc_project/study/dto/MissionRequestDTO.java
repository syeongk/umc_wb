package org.umc_project.study.dto;

import lombok.Getter;

@Getter
public class MissionRequestDTO {

    @Getter
    public static class AddDTO {
        String content;
        Integer duration;
        Integer successCriteria;
        Integer point;
        Long shopId;
    }

}
