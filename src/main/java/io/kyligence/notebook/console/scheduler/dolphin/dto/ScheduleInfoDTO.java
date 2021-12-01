package io.kyligence.notebook.console.scheduler.dolphin.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ScheduleInfoDTO {
    private String msg;

    private Integer code;

    private Body data;

    @Data
    @NoArgsConstructor
    public static class Body {

        private List<ScheduleInfo> totalList;
        private int total;
        private int currentPage;
        private int totalPage;
    }
}
