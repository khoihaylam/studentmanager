import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    insinhvien cout=new insinhvien();
    do {
        System.out.println();
        System.out.println("***********************studentmanager*******************");
        System.out.println("1.nhap so luong sinh vien");
        System.out.println("2.In sinh viẻn");
        System.out.println("3.cap nhat thong tin sinh vien");
        System.out.println("4.xoa thong tin sinh vien");
        System.out.println("5.sap xep sinh vien tang dan");
        System.out.println("6.sap xep sinh vien theo id");
        System.out.println("7.tim kiem sinh vien theo ten");
        System.out.println("8.sap xep sinh vien theo ten");
        System.out.println("9.thoat");
        System.out.println("************************************************************");
        System.out.println("moi ban nhap duc nang menu:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                cout.input();
                break;
            case 2:
                cout.output();
                break;
            case 3:
                cout.update();
                break;
            case 4:
                cout.delete();
                break;
            case 5:
                cout.sort();
               break;
            case 6:
                cout.sort1();
                break;
            case 7:
                cout.findName();
                break;
            case 8:
                cout.sort2();
                break;
            case 9:
                System.exit(0);
        }
    }while (true);

    }
}