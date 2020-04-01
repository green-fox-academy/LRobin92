package blog;

import BlogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    //store a list of BlogPosts
    //add BlogPosts to the list
    //delete(int) one item at given index
    //update(int, BlogPost) one item at the given index and update it with another BlogPost
    List<BlogPost> listOfBlogPosts = new ArrayList<>();

    public void add(BlogPost blogPost){
        listOfBlogPosts.add(blogPost);
    }
    public void delete(int index){
        listOfBlogPosts.remove(index);
    }
    public void update(int index, BlogPost blogPost){
        delete(index); //if we want to change it with another
        listOfBlogPosts.add(index, blogPost);
    }
}
