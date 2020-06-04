package hds.practice.day001;

public class Test2 {public static void main(String[] args) {
    //花色组
    String[] hs = {"黑桃","红桃","梅花","方块"};
    //点数
    String[] ds = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};

    printCard(hs,ds);
}
    public static void printCard( String[] hs, String[] ds){

        for (int hs_index = 0; hs_index <hs.length ; hs_index++) {
            for (int ds_index = 0;ds_index < ds.length ;ds_index++){
                //拼接字符串
                System.out.print(hs[hs_index] + ds[ds_index] + "  ");
            }
            System.out.println();
        }
    }
}
