package RandomandArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> scoreList = getScoreList();
        ArrayList<Integer> countlist = countScore(scoreList);
        printCount(countlist);
    }
//定义printCount方法，打印各个阶段的统计结果
    public static void printCount(ArrayList<Integer> countList){
        int start = 100;
        int end = 80;
        for (int i = 0; i <countList.size() ; i++) {
            Integer integer = countList.get(i);
            System.out.println(start +"\t分 --"  + end + "\t分：" + integer + "人");
            if (i == 0) {
                start-= 21; //79
                end-= 20;   //60
            }else if (i == countList.size()-2) {
                start-= 20; //39
                end-=40;   //0
            }else{
                start-=20; //59
                end-=20;  //40
            }
        }
    }
   //定义countScore方法，统计各个阶段的分数个数。
    public static ArrayList<Integer> countScore(ArrayList<Integer> scoreList){
        ArrayList<Integer> countList = new ArrayList<>();
        int count100 = 0;
        int count79 = 0;
        int count59 = 0;
        int count39 = 0;

        for (int i = 0; i <scoreList.size() ; i++) {
            Integer score = scoreList.get(i);
            if (score <= 100 && score >= 80) {
                count100 ++;
            }else if (score <= 79 && score >= 60) {
                count79++;
            }else if (score <= 59 && score >= 40) {
                count59++;
            }else {
                count39++;
            }
        }
        countList.add(count100);
        countList.add(count79);
        countList.add(count59);
        countList.add(count39);

        return countList;
    }

    //定义getScoreList方法，随机生成50个数字，数字范围从0到100。
    public static ArrayList<Integer> getScoreList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <50 ; i++) {
            int x = r.nextInt(100);
            list.add(x);
        }
        return list;
    }
}
