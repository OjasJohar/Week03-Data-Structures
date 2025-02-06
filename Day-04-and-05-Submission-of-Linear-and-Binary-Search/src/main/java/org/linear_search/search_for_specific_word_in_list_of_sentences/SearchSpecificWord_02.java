package org.linear_search.search_for_specific_word_in_list_of_sentences;

public class SearchSpecificWord_02 {

    public static String linearSearch(String[] sentences, String word){
        for(String sentence : sentences){
            if(sentence.contains(word)){
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences=new String[5];
        sentences[0]="Hello world";
        sentences[1]="Good morning, Sir";
        sentences[2]="How are you";
        sentences[3]="Hope you are doing great!!";
        sentences[4]="you are welcome";

        String word="Sir";
        String found=linearSearch(sentences,word);

        if(found.equals("Not Found")){
            System.out.println("Given word not found.");
        }else{
            System.out.println("Found in sentence : " + found);
        }
    }
}
