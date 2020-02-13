package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello(){
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }
    @PostMapping("skills")
    @ResponseBody
    public String skills(@RequestParam String name, @RequestParam String first,@RequestParam String second,@RequestParam String third){
        String report =
                "<h1>" +
                name+"</h1>" +
                "<ol>" +
                "<li>"+ first+"</li>" +
                "<li>" + second +"</li>" +
                "<li>"+third+"</li>" +
                "</ol>";
        return report;
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        String html ="<html>" +
                "<body>" +
                "<form action = 'skills' method = 'post'>" +
                "Name:<br>"+
                "<input type='text' name='name'><br>" +
                "My favorite language:<br>"+
                "<select name = 'first'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option><br>" +
                "</select><br>" +
                "My second favorite language:<br>"+
                "<select name = 'second'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option><br>" +
                "</select><br>"+
                "My third favorite language:<br>"+
                "<select name = 'third'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit'>"+
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }
}
