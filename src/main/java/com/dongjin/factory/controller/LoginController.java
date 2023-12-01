package com.dongjin.factory.controller;

import com.dongjin.factory.model.dto.ApiResult;
import com.dongjin.factory.model.dto.ApiResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public ResponseEntity<ApiResult<Map<String, Object>>> post(
            @RequestParam(required = false) Map<String, String> requestParams,
            @RequestBody(required = false) Map<String, Object> requestBody) {

        log.info("AUTH, LOGIN, POST");

        Map<String, Object> response = new HashMap<>(requestParams);
        ApiResult<Map<String, Object>> apiResult = ApiResult.<Map<String, Object>>builder()
                .code(ApiResultCode.succeed)
                .payload(response).build();

        return new ResponseEntity<>(apiResult, HttpStatus.CREATED);
    }
}
