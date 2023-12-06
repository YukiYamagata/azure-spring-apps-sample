package com.example.spiringapps.controller.model;

import lombok.Builder;
import lombok.Data;

/**
 * バリデーションサンプル用のPathVariable
 */
@Data
@Builder
public class GreetingResponse {
    private String word;
}
