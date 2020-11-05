package printf;

public class Printf1 {
	public static void main(String[] args) {

        for(int i = 0; i <= 12; i++) {
            if(i == 0) {
                continue;
            }
            System.out.printf("%02d", i);
        }
    }
}
//02% 010203040506070809101112
//03% 001002003004005006007008009010011012
