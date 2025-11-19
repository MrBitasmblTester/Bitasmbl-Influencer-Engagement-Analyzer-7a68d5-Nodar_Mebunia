package com.example.influencer.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/influencer")
public class InfluencerController {
  @GetMapping("/{id}/metrics")
  public Map<String,Object> getMetrics(@PathVariable String id) {
    return Map.of("id", id, "engagementRate", 0.0, "notes","stub");
  }
}
