package com.example.influencer.service;

import com.example.influencer.client.SocialApiClient;
import com.example.influencer.model.InfluencerMetrics;
import java.util.*;

public class InfluencerService {
  SocialApiClient client = new SocialApiClient();
  public InfluencerMetrics computeMetrics(String id){
    var posts = client.fetchPosts(id);
    // minimal aggregation stub
    return new InfluencerMetrics(id, posts.size(), 0.0);
  }
}
