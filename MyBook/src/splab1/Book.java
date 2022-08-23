package splab1;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<String>  paragraph;
    private List<String> image;
    private List<String> table;

    public Book(String title){
        this.title=title;
        this.paragraph= new ArrayList<>();
        this.table=new ArrayList<>();
        this.image=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getParagraph() {
        return paragraph;
    }

    public void setParagraph(List<String> paragraph) {
        this.paragraph = paragraph;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public List<String> getTable() {
        return table;
    }

    public void setTable(List<String> table) {
        this.table = table;
    }

    public void createNewParagraph(String str){
        this.paragraph.add(str);
    }

    public void createNewImage(String img){
        this.image.add(img);
    }

    public void createNewTable(String table){
        this.table.add(table);
    }

    public void print(){
        for(String e:paragraph){
            System.out.println(e);
        }
        for(String e:image){
            System.out.println(e);
        }

        for(String e:table)
            System.out.println(e);
    }
}
