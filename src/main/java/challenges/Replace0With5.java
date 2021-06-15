package challenges;

public class Replace0With5 {
    int convertfive(int num) {
        int mod = 10;
        int times = 1;
        int newNum = num;
        do{
            if(num % mod == 0) {
                newNum += times * 5;
            }
            times*=10;
            num = num / mod;
        }while(num % mod != num);
        // Your code here
        return newNum;
    }
}
