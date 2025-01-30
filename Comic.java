public class Comic {
    // INSTANCE VARIABLES

    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;


    /*
     * CONSTRUCTORS
     */
    
    public Comic(String writer, String illustrator, String colorist, String title, int issueNum) {
        this.setWriter(writer);
        this.setIllustrator(illustrator);
        this.setColorist(colorist);
        this.setTitle(title);
        this.setIssueNum(issueNum);
    }

    public Comic() {
        this("Jane Doe", "John Doe", "Jorge Doe", "Comic", 0);
    }

    public Comic(Comic original) {
        if (original == null) {
            System.out.println("ERROR: trying to copy null object!");
            System.exit(0);
        } else {
            this.setWriter(original.writer);
            this.setIllustrator(original.illustrator);
            this.setColorist(original.colorist);
            this.setTitle(original.title);
            this.setIssueNum(original.issueNum);
        }
    }

    /*
     * MUTATORS and ACCESSORS
     */

    //Getter and Setter for Writer
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    //Getter and Setter for Illustrator
    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }
    
    //Getter and Setter for Colorist
    public void setColorist(String colorist) {
        this.colorist = colorist;
    }

    public String getColorist() {
        return colorist;
    }

    //Getter and Setter for Title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    //Getter and Setter for Issue Num
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return issueNum;
    }
    
    // Override toString method to provide a string representation of the Comic
    // object

    @Override
    public String toString() {
        return "Comic{" +
                "illustrator='" + illustrator + '\'' +
                ", writer='" + writer + '\'' +
                ", colorist='" + colorist + '\'' +
                ", title='" + title + '\'' +
                ", issueNumber=" + issueNum +
                '}';

    }

    public boolean equals(Comic otherComic) {

        if (otherComic == null) {
            return false;
        }
        return this.writer.equals(otherComic.writer) && this.illustrator.equals(otherComic.illustrator) && this.colorist.equals(otherComic.colorist) && this.title.equals(otherComic.title) && this.issueNum == otherComic.issueNum;
    }
    
}
