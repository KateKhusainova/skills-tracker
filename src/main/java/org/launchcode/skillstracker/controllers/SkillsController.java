package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
   @GetMapping
    public String textAboutLanguages() {
       return "<html>" +
               "<body>" +
               "<h1>Skills Tracker</h1>" +
               "<h2>We have a few skills we would like to learn.Here is the list!</h2>" +
               "<ol>" +
               "<li>Java</li>" +
               "<li>JavaScript</li>" +
               "<li>Python</li>" +
               "</ol>" +
               "</body>" +
               "</html>";
   }

   @GetMapping("form")
   public String formToChoose() {
       return "<html>" +
               "<body>" +
               "<form method='post'>" +
               //"<form action='table' method='post'>" +
               "<label for='name'>Name:</label><br>" +
               "<input type ='text' name='name'><br>" +
               "<label>My favorite language:</label><br>" +
               "<select name='firstChoice' id='firstChoice'>" +
               "<option value='Java'>Java</option>" +
               "<option value='JavaScript'>JavaScript</option>" +
               "<option value='Python'>Python</option>" +
               "</select><br>" +
               "<label>My second favorite language:</label><br>" +
               "<select name='secondChoice' id='secondChoice'>" +
               "<option value='Java'>Java</option>" +
               "<option value='JavaScript'>JavaScript</option>" +
               "<option value='Python'>Python</option>" +
               "</select><br>" +
               "<label>My third favorite language:</label><br>" +
               "<select name='thirdChoice' id='thirdChoice'>" +
               "<option value='Java'>Java</option>" +
               "<option value='JavaScript'>JavaScript</option>" +
               "<option value='Python'>Python</option>" +
               "</select><br>" +
               "<input type='submit' value='Submit'>" +
               "</form>" +
               "</body>" +
               "</html>";

   }
   @PostMapping("form")
   public String myChoice(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice,@RequestParam String thirdChoice){
       return  "<html>" +
               "<body>" +
               "<h1>" + name +"</h1>" +
               "<ol>" +
               "<li>" + firstChoice + "</li>" +
               "<li>" + secondChoice + "</li>" +
               "<li>" + thirdChoice + "</li>" +
               "</ol>" +
               "</body>" +
               "</html>";
   }

   //Bonus mission with table instead of ol:
   @PostMapping("table")
   public String myChoiceWithTable(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice,@RequestParam String thirdChoice){
       return  "<html>" +
               "<body>" +
               "<h1>" + name +"</h1>" +
               "<table>" +
               "<tr><th>My favorite language:</th>" +
               "<td>" + firstChoice + "</td></tr>" +
               "<tr><th>My second favorite language:</th>" +
               "<td>" + secondChoice + "</td></tr>" +
               "<tr><th>My third favorite language:</th>" +
               "<td>" + thirdChoice + "</td></tr>" +
               "</table>" +
               "</body>" +
               "</html>";
   }

}
