package com.example.influencer.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/compare")
public class CompareController {
  @PostMapping
  public Map<String,Object> compare(@RequestBody Map<String,Object> body){
    return Map.of("comparison","stub","request",body);
  }
}
