/**
 * 
 * @author karan
 *
 */

/*
 * Class WrittenItem inherits from Item and adds functionality specific to Written Items such as the name of the author, publication name
 * and No of Pages. The class also defines an abstract method called print for printing the output of the fields
 * 
 */
abstract class WrittenItem extends Item {
    protected String authorName;
    protected String publicationName;
    protected int noOfPages;

    public WrittenItem(int id, String title, int copies, String authorName, String publicationName, int noOfPages) {
        super(id,title,copies);
        this.authorName = authorName;
        this.publicationName = publicationName;
        this.noOfPages = noOfPages;
    }

    abstract String print();

    public String getAuthorName() {
        return this.authorName;

    }

    public WrittenItem() {
      this.noOfPages = 300;

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublicationName() {
        return this.publicationName;

    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;

    }

    public int getNoOfPages() {
        return this.noOfPages;

    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;

    }

}
