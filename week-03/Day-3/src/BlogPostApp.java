
class BlogPost {
        String authorName;
        String title;
        String text;
        String publicationDate;
    }

    public class BlogPostApp {
        public static void main(String[] args) {

            BlogPost bLogPost1 =  new BlogPost();
            bLogPost1.authorName="John Doe";
            bLogPost1.title="Lorem Ipsum";
            bLogPost1.text="Lorem ipsum dolor sit amet.";
            bLogPost1.publicationDate="2000.05.04.";
            BlogPost bLogPost2 =  new BlogPost();
            bLogPost2.authorName="Tim Urban";
            bLogPost2.title="Wait but why";
            bLogPost2.text= "A popular long-form, stick-figure-illustrated blog about almost everything.";
            bLogPost2.publicationDate="2010.10.10.";
            BlogPost bLogPost3 =  new BlogPost();
            bLogPost3.authorName="William Turton";
            bLogPost3.title="One Engineer Is Trying to Get IBM to Reckon With Trump";
            bLogPost3.text="Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                    "When I asked to take his picture outside one of IBM’s New York City offices, " +
                    "he told me that he wasn’t really into the whole organizer profile thing.";
            bLogPost3.publicationDate="2017.03.28.";


        }

    }
