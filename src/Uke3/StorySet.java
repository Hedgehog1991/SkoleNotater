package Uke3;
import java.util.ArrayList;
import java.util.Scanner;

public class StorySet {
    public int storyNumber;
    public String storyName;
    public String storyContent;
    public  ArrayList<String> storyList = new ArrayList<>(); //HER ER DET NOE RART
    public StorySet(int storyNumber, String storyName){
        this.storyNumber=storyNumber;
        this.storyName = storyName;

        this.storyList = new ArrayList<>();
    }
    public String getStoryNumTitle(){return this.storyNumber + this.storyName;}
    public ArrayList<String> getStoryList(){return this.storyList;} // HER ER DET NOE RART
    public void addStory(String storyContent){ // HER ER DET NOE RART

    this.storyList.add(storyContent);
    }


    public static void main(String[] args) {
        System.out.println("---STORY MENU---\n Type 0 for Aladdin \n Type 1 for Beauty and the Beast \n Type 2 for Pinocchio");
        test1();
    }
        public static void test1(){
        Scanner input = new Scanner(System.in);
       StorySet storyOne = new StorySet(0, " Aladdin\n");
       StorySet storyTwo = new StorySet(1," Beauty And the Beast\n");
       StorySet storyThree = new StorySet(2, " Pinocchio\n");

       int inputNum;
       inputNum= Integer.parseInt(input.nextLine());

       ArrayList<StorySet> allStories = new ArrayList<>();

        switch (inputNum) {
            case 0 -> {
                storyOne.addStory("A poor thief obtains a magical lamp after meeting the princess of the land\n" +
                        "The genie of the lamp will grant him three wishes\n");
                allStories.add(storyOne);
            }
            case 1 -> {
                storyTwo.addStory("story about the birth of love and the capability of \n " +
                        "love to transform the way you look at people you love. \n");
                allStories.add(storyTwo);
            }
            case 2 -> {
                storyThree.addStory(" A poor man named Geppetto wants to carve himself\n" +
                        " a marionette in order to make a living as a puppeteer");
                allStories.add(storyThree);
            }

        }

        for (StorySet s : allStories){
                System.out.println(s.getStoryNumTitle() + s.getStoryList());
                for(String storyArray : s.getStoryList()){  //HER ER DET NOE RART
                   System.out.println("Character length of " + storyArray.length() + "\narray length of " + allStories.size());
                    //System.out.println();
                    test1();

                }
             }
        }
    }










