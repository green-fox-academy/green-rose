package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> posts = new ArrayList<BlogPost>();

    public void addBlockPost(BlogPost post){
        this.posts.add(post);
    }

    public void delete(int postNo){
        this.posts.remove(postNo);
    }

    public void update(int postNo, BlogPost post){
        this.posts.add(postNo,post);
    }
}
