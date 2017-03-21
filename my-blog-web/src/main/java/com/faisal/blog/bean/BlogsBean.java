package com.faisal.blog.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.faisal.blog.pojo.Blog;

@Named
@RequestScoped
public class BlogsBean implements Serializable {

	private static final long serialVersionUID = -8560266701320560515L;

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private List<Blog> blogs = new ArrayList<Blog>();

	public List<Blog> getBlogs() {
		if (blogs.isEmpty()) {
			Blog blog = new Blog();
			blog.setTitle("Blog Title");
			blog.setCreatedBy("mofaisal");
			blog.setContent("Sample content for testing");
			blog.setCreated(Calendar.getInstance().getTime());
			blogs.add(blog);
		}
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public String submit() {
		return "next";
	}
}
