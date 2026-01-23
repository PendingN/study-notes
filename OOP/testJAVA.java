import java.util.Scanner;
public class OOP_Lab1_1_52400066_HaTuanAnh{
    public static void main(String[] args){
        System.out.println("______MENU______");
        System.out.println("1. Student info");
        System.out.println("2. Area of triangle");
        System.out.println("3. Remainder of Division");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.println("5. Leap year");
        System.out.println("6. Min number");
        System.out.println("7. Check alphanumeric"); 
        System.out.println("10. Sum first and last digital"); 
        System.out.println("11. Counting number digital"); 
        System.out.println("12. Reverse"); 
        System.out.println("13. Palindrome");    
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Chon bai");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    sc.nextLine();
                    StudentInfo(sc);
                    break;
                }
                case 2:{
                    System.out.println("Nhap height:");
                    float h=sc.nextFloat();
                    System.out.println("Nhap base:");
                    float b=sc.nextFloat(); 
                    System.out.printf("Dien tich cua tam giac la %.2f\n",AreaofTriangle(h,b));
                    break;
                }
                case 3:{
                    System.out.println("Nhap a:");
                    int a=sc.nextInt();
                    System.out.println("Nhap b:");
                    int b=sc.nextInt(); 
                    System.out.printf("%d %% %d = %d\n",a,b,RemainderofDivision(a,b));
                    break;
                }
                case 4:{
                    System.out.println("Nhap fahrenheit:");
                    float f=sc.nextFloat(); 
                    System.out.println("Nhap C:");
                    float c=sc.nextFloat(); 
                    System.out.printf("Celsius la %.2f\n",FtoC(f));   
                    System.out.printf("Fahrenheit la %.2f\n",CtoF(c));  
                    break;
                }
                case 5:{
                    System.out.println("Nhap nam:");
                    int y=sc.nextInt(); 
                    if(leapYear(y)){
                        System.out.println("Day la nam nhuan (leap year)\n");
                    }
                    else{
                        System.out.println("Day khong phai la nam nhuan (leap year)\n");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Nhap a:");
                    int a=sc.nextInt();
                    System.out.println("Nhap b:");
                    int b=sc.nextInt();
                    System.out.println("Nhap c:");
                    int c=sc.nextInt();
                    System.out.printf("Min la %d\n",minNum(a,b,c));
                    break;
                }
                case 7:{
                    System.out.println("Nhap 1 ki tu:");
                    char c = sc.next().charAt(0);
                    if(alphanumeric(c)){
                        System.out.println("Day la alphanumeric\n");
                    }
                    else{
                        System.out.println("Day khong phai la alphanumeric\n");
                    }
                    break;
                }
                case 8:{
                    }
                    break;
                case 9:{
                    break;
                }
                case 10:{
                    System.out.println("Nhap 1 so:");
                    int n=sc.nextInt();      
                    System.out.printf("Sum first and last digital : %d\n",SumFandLDigital(n));               
                    break;
                }         
                case 11:{
                    System.out.println("Nhap 1 so:");
                    int n=sc.nextInt();      
                    System.out.printf("Count digital : %d\n",CountingDigital(n));               
                    break;
                }   
                case 12:{
                    System.out.println("Nhap 1 so:");
                    int n=sc.nextInt();      
                    System.out.printf("Reverse : %d\n",revNum(n));               
                    break;
                }   
                case 13:{
                    System.out.println("Nhap 1 so:");
                    int n=sc.nextInt();    
                    if(checkPalindrome(n)){
                        System.out.println("Day la Palindrome\n");
                    }
                    else{
                        System.out.println("Day khong phai la Palindrome\n");
                    }           
                    break;
                }                
                default:{}
            }
        }while(choice !=0);
    }
    public static void StudentInfo(Scanner sc){
        System.out.println("Nhap ten:");
        String ten=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        String birth=sc.nextLine();    
        System.out.println("Nhap MSSV:");
        String ID=sc.nextLine();    

        System.out.println(ten);
        System.out.println(birth);
        System.out.println(ID);
    }
    public static float AreaofTriangle(float h,float b){
        float a=(float)0.5*h*b;
        return a;
    }
    public static int RemainderofDivision(int a, int b){
        return a%b;
    }
    public static float FtoC(float f){
        return (f-32)/(float)1.8;
    }
    public static float CtoF(float c){
        return c*(float)1.8-32;
    }
    public static boolean leapYear(int y){
        if((y%4==0 && y%100!=0)||y%400==0){
            return true;
        }
        return false;
    }
    public static int minNum(int a, int b, int c){
        return (a<b?a:b)<c?(a<b?a:b):c;
    }
    public static boolean alphanumeric(char c){
        return (c>'a'&& c<'z')||(c>'A'&&c<'Z')||(c>'0'&&c<'9');
    }
    public static int Bai8a(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int Bai8b(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static int Bai8c(int n){
        int res=1;
        for(int i=0;i<=n;i++){
            int first=2;
            for(int j=1;j<i;j++){
                first*=2;
            }
            res+=first;
        }
        return res;
    }
    public static int SumFandLDigital(int num){
        int l=num%10;
        while(num>10){
            num=num/10;        
        }
            int f=num;
        return f+l;
    }
    public static int CountingDigital(int num){
        int cnt=1;
        while (num >10){
            num=num/10;
            cnt++;
        }
        return cnt;
    }
    public static int revNum(int num){
        int n;
        if(num<0){
            n=num*-1;
        }
        else{
            n= num;
        }
        int res=0;
        while(n >1){
            res=res*10+(n%10);
            n=n/10;
        }
        if(num<0){
            return -res;
        }
        else{
            return res;
        }
    }
    public static boolean checkPalindrome(int num){
        if(num == revNum(num)){
            return true;
        }
        else{
            return false;
        }
    }
}