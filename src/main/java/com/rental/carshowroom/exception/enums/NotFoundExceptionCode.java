package com.rental.carshowroom.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum NotFoundExceptionCode {
    USER_NOT_FOUND("msg.validation.user.notfound");

    private String descriptionProperty;
}
