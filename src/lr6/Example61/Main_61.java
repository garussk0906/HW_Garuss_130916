package lr6.Example61;

public class Main_61 {
    public static void main(String[] args) {
        Test test = new Test();

        test.setCh1orStr1('l');
        test.setCh1orStr1("Привет");

        System.out.println(test.ch1);
        System.out.println(test.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';
        test.setCh1orStr1(chars1);
        System.out.println(test.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'Ц';

        test.setCh1orStr1(chars2);

        System.out.println(test.ch1);
    }
}
