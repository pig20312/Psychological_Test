package com.example.psychological_test;

import java.util.ArrayList;

public class Answer {
    private String name; private String[] description;

    public static ArrayList<Answer> answers;



    static {
        ArrayList<Answer> tmp = new ArrayList<>();

        String q1 = "不是跟你很熟的人覺得你是...\n";
        String q2 = "跟你很熟的人覺得你是...\n";
        String q3 = "你想要別人覺得你是...\n";
        String q4 = "你最希望你的情人是...\n";
        String q5 = "其實真實的你是...\n";

        String[] des = {q1+"一個常常把自己藏起來的人,很有神秘感,不容易接近",
                        q1+"覺得你是一個很會關心別人的人,很容易發現身邊有人不開心,不會很容易講錯東西或話題",
                        q1+"覺得你是一個傻傻的人,怪怪的,想做什麼就做什麼,不過很可愛",
                        q1+"覺得你是一個不會想﹐老是要人擔心的人,例如:長輩",
                        q1+"覺得你是一個很聰明﹐很負責任的領導人,對你很尊敬"};
        tmp.add(new Answer("感動", des));

        String[] des1 = {q2+"對很多事都要求很高的人,不過有很多時候都太固執",
                         q2+"可以跟你講道理,黑白之間分辨得很清楚",
                         q2+"心思很細膩的人,很多時候傷心不會表現出來，不過其實大家都看得出來",
                         q2+"會先想很多才會做選擇,不想自己給人看扁, 自尊可以算是很強的人",
                         q2+"外剛內柔的人,但其實知道你的內心不是那麼堅強"};
        tmp.add(new Answer("傷心", des1));

        String[] des2 = {q3+"很需要別人保護的人",
                         q3+"不是那麼容易接近的人",
                         q3+"好人一個,很關心身邊的人,不怕做犧牲的人",
                         q3+"很聰明，不過又不會驕傲的人",
                         q3+"很清楚自己想什麼要什麼的人"};
        tmp.add(new Answer("痛", des2));

        String[] des3 = {q4+"跟你很合拍,你跟他想的東西是一樣 , 不用問便知道對方要什麼",
                         q4+"不會很客易發脾氣,要懂得容忍你,外剛內柔,有自己的性格",
                         q4+"內心是很可愛的一個人,你猜不到下一步他會做什麼",
                         q4+"很細心,你需要什麼他都有準備,不會因為很少的東西便找你",
                         q4+"智慧很重要,可以管得到你的人,而且要講道理"};
        tmp.add(new Answer("生氣", des3));

        String[] des4 = {q5+"一個很怕給別人看到自己是什麼樣的人,不喜歡自己性格的人",
                         q5+"孤獨的人,很希望可以跟一大堆人在一起,不過很多時候都不知道怎樣跟別人溝通",
                         q5+"覺得朋友比天還重要的人,很珍惜身邊很多朋友,敢愛敢恨,不過不喜歡的人你就不會去管",
                         q5+"直接的人,很多時候因為這樣的性格跟別人不合,希望有多一點人可以瞭解你，特別是你喜歡的人",
                         q5+"不是很清楚自己將來要什麼,不過就很幸運的走過半生,不會對很多東西有要求,最重要是可以開心過每一天!"};
        tmp.add(new Answer("擔心", des4));

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
