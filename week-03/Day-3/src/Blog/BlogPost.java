package Blog;

class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate=publicationDate;
    }
    public BlogPost(){
    }
}

class BlogPostApp {
    public static void main(String[] args) {

        Blog blog = new Blog();


        BlogPost bLogPost1 =  new BlogPost();
        bLogPost1.authorName="John Doe";
        bLogPost1.title="Lorem Ipsum";
        bLogPost1.text="Lorem ipsum dolor sit amet.";
        bLogPost1.publicationDate="2000.05.04.";
        blog.addBlockPost(bLogPost1);

        BlogPost bLogPost2 =  new BlogPost();
        bLogPost2.authorName="Tim Urban";
        bLogPost2.title="Wait but why";
        bLogPost2.text= "A popular long-form, stick-figure-illustrated blog about almost everything.";
        bLogPost2.publicationDate="2010.10.10.";
        blog.addBlockPost(bLogPost2);
        BlogPost bLogPost3 =  new BlogPost();
        bLogPost3.authorName="William Turton";
        bLogPost3.title="One Engineer Is Trying to Get IBM to Reckon With Trump";
        bLogPost3.text="Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, " +
                "he told me that he wasn’t really into the whole organizer profile thing.";
        bLogPost3.publicationDate="2017.03.28.";
        blog.addBlockPost(bLogPost3);

        for (BlogPost post: blog.posts) {
            System.out.println(post.title);
        }
        blog.addBlockPost(new BlogPost("William Turton",
        "One Asshole Is Trying to Get IBM to Reckon With Trump",
        "Do not know","2017.03.28."));
        blog.delete(0);
        blog.update(1,new BlogPost("William ",
                "Asshole Is Trump",
                "Do not know",""));
        for (BlogPost post: blog.posts) {
            System.out.println(post.title);
        }

    }

}
