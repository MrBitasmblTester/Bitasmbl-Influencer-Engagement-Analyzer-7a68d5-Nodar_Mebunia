package com.example.influencer.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/search")
public class SearchController {
  @GetMapping
  public List<Map<String,String>> search(@RequestParam String q){
    return List.of(Map.of("id","test","name","Test Influencer"));
  }
}
