package com.mortal.SpringBookBack;

import com.mortal.SpringBookBack.model.JobPost;
import com.mortal.SpringBookBack.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    public JobService service;


    @GetMapping("load")
    public String load(){
         service.load();
         return "Success";
    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
           return service.getAllJobs();
    }
    @GetMapping("jobPost/{postid}")
    public JobPost getPost( @PathVariable("postid") int postid){
        return service.getPost(postid);
    }
    @PostMapping("jobPost")
    public JobPost  addJobPost(@RequestBody  JobPost jobPost){
        service.addJobPost(jobPost);
        return  service.getPost(jobPost.getPostId());
    }
    @PutMapping("jobPost")
    public  JobPost updateJob(@RequestBody  JobPost jobPost){
             service.updateJob(jobPost);
             return  service.getPost(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{postid}")
    public String deleteJob( @PathVariable int postid){
        service.deleteJob(postid);
        return "Job No Longer Exists..";
    }


    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchKeyword(@PathVariable("keyword")  String keyword){
        return service.search(keyword);

    }
}
