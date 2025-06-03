package com.SpringMVC.DataRendering.controller;

import com.SpringMVC.DataRendering.entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping("/report")
    public String showReport(Map<String,Object> map)
    {
        map.put("name","Mahesh");
        map.put("age",46);
        map.put("Spouse","Namratha Shirodkar");
        map.put("tag","Super star");
        map.put("nickname","Chikas Husband");
        map.put("salary","1000cr");
        String[] aka = {"Bob","Prince","Babulake Babu Mahesh Babu","Poster Star","Heart surgeries"};

        map.put("Results", List.of("Only BlockBuster"));
        map.put("aka",aka);
        Map<String,Integer> books = new HashMap<>();
        books.put("The Song Of Ice And Fire",400);
        books.put("Wind Breaker",200);
        books.put("MahaBharatam",1000);
        books.put("Java For Impatient",500);
        map.put("books",books);
        Movie topMovie = new Movie("1 Nenokkadine","Sukumar","Kriti Sanon","Thriller");
        map.put("topMovie",topMovie);
        map.put("movies",
                List.of(
                        new Movie("Murari","Krihna Vamsi","Disha Patani","Family Drama"),
                        new Movie("Business Man","Puri Jagannath","Kajal","Gangster"),
                        new Movie("Pokiri","Puri Jagannath","Ileana","Police"),
                        new Movie("Guntur Karam","Thrivikram","Pooja hegde","Director ke theliyali")
                            ));
        return "report";
    }


}
