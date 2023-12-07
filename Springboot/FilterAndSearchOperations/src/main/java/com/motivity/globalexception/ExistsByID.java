package com.motivity.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY,reason = "Id is not Available")
public class ExistsByID extends RuntimeException{

}
