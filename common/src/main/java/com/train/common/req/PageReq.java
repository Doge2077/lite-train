package com.train.common.req;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageReq {

    @NotNull(message = "Page is null!")
    private Integer page;

    @NotNull(message = "Message is null!")
    @Max(value = 100, message = "Message is limited to 100!")
    private Integer size;

}
