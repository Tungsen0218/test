  public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("����������QQ���룺");
            String qq = sc.next();
            boolean isOk = checkQQ(qq);
            System.out.println("���QQ���Ƿ���ȷ��" + isOk);
        }
    }

    public static boolean checkQQ(String qq) {
        if (qq.length() >= 5 && qq.length() <= 12) {
            if (qq.charAt(0) == '0') {
                System.out.println("qq����ĵ�һλ�ַ�����Ϊ0");
                return false;
            } else {
                for(int i = 0; i < qq.length(); ++i) {
                    char ch = qq.charAt(i);
                    if (ch < '0' || ch > '9') {
                        System.out.println("QQ�����к��з������ַ�");
                        return false;
                    }
                }

                return true;
            }
        } else {
            System.out.println("QQ���볤������");
            return false;
        }
    }