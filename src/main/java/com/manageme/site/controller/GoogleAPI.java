package com.manageme.site.controller;

import org.springframework.expression.ExpressionException;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClient;

import java.io.StringReader;

public class GoogleAPI {

    public static void Callback(String code,String error) throws ExpressionException{

        if(code.isBlank()){
            throw new ExpressionException("CODE non valido");
        }
        else GetToken(code);

    }

    private static void GetToken(String code) {
        String token = "";
        String credentialsFile = "";
        String credentials = "";
//        RestClient restClient = new RestClient();

//        ??? implementare interfaccia? passare json?

    }






}
