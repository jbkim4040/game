package com.web.game.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestDTO {
    private String name;
    private String phone;
    private String gender;

}
