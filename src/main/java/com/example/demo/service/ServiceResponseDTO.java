package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceResponseDTO<T> {

    public String code; // on met les attributs en public, normalement c'est private avec getters setters
    public String message;
    public T data;


    public static <T> ServiceResponseDTO<T> performResponse(ServiceResponseDTO<T> response){
        Logger logger = LoggerFactory.getLogger(ServiceResponseDTO.class); // on configure le Logger et on lui dit dans quelle classe on est

        logger.info("Code : {} - Message : {}", response.code, response.message);
        return response;
    }


    public static <T> ServiceResponseDTO<T> buildResponseWithData(String code, String message, T data){
        ServiceResponseDTO<T> response = new ServiceResponseDTO<T>();
        response.code = code;
        response.message = message;
        response.data = data;

        return performResponse(response);
    }


    public static <T> ServiceResponseDTO<T> buildResponse(String code, String message){
        return buildResponseWithData(code, message, null);
    }

}
