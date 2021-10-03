package com.supermarket.bestchoice.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class StandartError {

    private Integer status;

    private String message;

    private Long timeStamp;

    
}