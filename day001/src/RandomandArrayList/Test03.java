  public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的QQ号码：");
            String qq = sc.next();
            boolean isOk = checkQQ(qq);
            System.out.println("这个QQ号是否正确：" + isOk);
        }
    }

    public static boolean checkQQ(String qq) {
        if (qq.length() >= 5 && qq.length() <= 12) {
            if (qq.charAt(0) == '0') {
                System.out.println("qq号码的第一位字符不得为0");
                return false;
            } else {
                for(int i = 0; i < qq.length(); ++i) {
                    char ch = qq.charAt(i);
                    if (ch < '0' || ch > '9') {
                        System.out.println("QQ号码中含有非数字字符");
                        return false;
                    }
                }

                return true;
            }
        } else {
            System.out.println("QQ号码长度有误");
            return false;
        }
    }