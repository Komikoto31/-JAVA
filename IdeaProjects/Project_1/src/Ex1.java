public class Ex1 {
    public static void main(String[] args) {
        String s = "abbbhhhfgueufodf";
        char[] a = new char[] {'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] priob = s.toCharArray();
        int u = priob.length;
        int j = 0;
        for(int i = 0;i<=priob.length;i++){
            j = 0;
            while(priob[i] != a[0]){
                    j++;
                    a[0] = a[0+j];
            }
        }
    }
}
