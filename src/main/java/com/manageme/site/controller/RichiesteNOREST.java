package com.manageme.site.controller;

import org.springframework.boot.http.client.HttpRedirects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URL;

@Controller
public class RichiesteNOREST {

//    @GetMapping(path="test")
//    public static String gettest(){
//        return "test";
//    }


        @GetMapping("/oauth")
        public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
//            attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
//            attributes.addAttribute("attribute", "redirectWithRedirectView");

            String URL = "https://accounts.google.com/o/oauth2/v2/auth?" +
                    " scope=https://www.googleapis.com/auth/calendar+https://www.googleapis.com/auth/calendar.events" +
                    " access_type=online&\n" +
                    " include_granted_scopes=true&\n" +
                    " response_type=code&\n" +
                    " state=state_parameter_passthrough_value&\n" +
                    " redirect_uri=https%3A//oauth2.example.com/code&\n" +
                    " client_id=client_id";


            return new RedirectView(URL);
        }

}
