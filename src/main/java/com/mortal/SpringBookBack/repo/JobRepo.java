package com.mortal.SpringBookBack.repo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mortal.SpringBookBack.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  JobRepo  extends JpaRepository<JobPost,Integer> {

     List<JobPost>  findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);

}

//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//		new JobPost(1, "Network Engineer",
//				"Design and implement computer networks for efficient data communication", 5,
//				List.of("Networking", "Cisco", "Routing", "Switching")),
//		new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//				3, List.of("HTML", "CSS", "JavaScript", "React")),
//		new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//				List.of("Python", "Machine Learning", "Data Analysis")),
//		new JobPost(4, "Back End Developer ", "Strong background in Java , SQL , Spring Boot", 0,
//				List.of("Java", "SQL", "SpringBoot"))
//));


//public List<JobPost> getAllJobs() {
//	return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJobPost(JobPost job) {
//	jobs.add(job);
//
//}
//
//public JobPost getJob(int postid) {
//	for(JobPost post: jobs){
//		if(post.getPostId() == postid ){
//			return post;
//		}
//	}
//	return null;
//}
//
//public void updateJob(JobPost jobPost) {
//
//	for(JobPost post: jobs){
//		if(post.getPostId() == jobPost.getPostId()){
//
//			post.setPostId(jobPost.getPostId());
//			post.setPostProfile(jobPost.getPostProfile());
//			post.setPostDesc(jobPost.getPostDesc());
//			post.setReqExperience(jobPost.getReqExperience());
//			post.setPostTechStack(jobPost.getPostTechStack());
//		}
//	}
//
//}
//
//public void deleteJob(int postid) {
//	for(JobPost post : jobs){
//		if(post.getPostId() ==  postid){
//			jobs.remove(post);
//		}
//	}
//}