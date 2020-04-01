package blog;

import BlogPost.BlogPost;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        BlogPost blogpost1 = new BlogPost("John Doe", "Lorem Ipsum","Lorem ipsum dolor sit amet", "2000.05.04.");
        BlogPost blogpost2 = new BlogPost("Tim Urban", "Wait but why", "Everything.", "2010.10.10.");
        BlogPost blogpost3 = new BlogPost("William Turton","One With Trump","Daniel Hanile thing.", "2017.03.28.");
        blog.add(blogpost1);
        blog.add(blogpost2);
        System.out.println(blog.listOfBlogPosts.get(0).authorName +  " and "+blog.listOfBlogPosts.get(1).authorName );
        //blog.delete(0);
        blog.update(0,blogpost3);
        System.out.println(blog.listOfBlogPosts.get(0).authorName+  " and "+blog.listOfBlogPosts.get(1).authorName );
        System.out.println(blog.listOfBlogPosts.size());
    }
}
