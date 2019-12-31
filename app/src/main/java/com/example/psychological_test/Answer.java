package com.example.psychological_test;

import java.util.ArrayList;

public class Answer {
    private String name; private String[] description;

    public static ArrayList<Answer> answers;

    static {
        ArrayList<Answer> tmp = new ArrayList<>();

        String[] des = {"一個常常把自己藏起來的人。很有神秘感。不容易接近。",
                        "一個很會關心別人的人。很容易發現身邊有人不開心。不會很容易講錯東西或話題。",
                        "一個傻傻的人。怪怪的。想做什麼就做什麼。不過很可愛。",
                        "一個不會想﹐老是要人擔心的人。(特別是長輩)",
                        "一個很聰明﹐很負責任的領導人。對你很尊敬。"};
        tmp.add(new Answer("感動", des));

        String[] des1 = {"對很多事都要求很高的人。不過有很多時候都太固執",
                        "可以跟你講道理。黑白之間分辨得很清楚。",
                        "心思很細膩的人。很多時候傷心不會表現出來，不過其實大家都看得出來。",
                        "會先想很多才會做選擇。不想自己給人看扁, 自尊可以算是很強的人。",
                        "外剛內柔的人。但其實知道你的內心不是那麼堅強。"};
        tmp.add(new Answer("傷心", des1));

        answers = tmp;
    }

    private Answer(String name, String[] des){
        this.name = name;
        this.description = des;
    }

    public String getDes(int i){

        return description[i];
    }

    public String toString(){

        return this.name;
    }

}
