import java.util.Scanner;
public class insinhvien {
    Scanner scanner = new Scanner(System.in);
    student arrstudent[] = new student[100];
    int n;
    int index = 0;

    public void input() {
        System.out.println("moi ban nhap so luong");
        n = scanner.nextInt();
        arrstudent = new student[n];
        for (int i = 0; i < n; i++) {
            arrstudent[index] = new student();
            arrstudent[index].input(scanner, arrstudent, index);
            index++;
        }
    }

    public void output() {
        for (int i = 0; i < index; i++) {
            arrstudent[i].display();
        }
    }

    public void update() {
        System.out.println("nhap id muon cap nhat");
        int id = scanner.nextInt();
        int updateid = find(id);
        if (updateid >= 0) {
            boolean exit = true;
            do {
                System.out.println("************************UPDATE**************************");
                System.out.println("1.cap nhat ten cua sinh vien");
                System.out.println("2.cap nhat gioi tinh sinh vien");
                System.out.println("3.cap nhat tuoi sinh vien");
                System.out.println("4.cap nhat diem toan cua sv");
                System.out.println("5.cap nhat diem ly cua sinh vien");
                System.out.println("6.cap nhat diem hoa cua sinh vien");
                System.out.println("7.thoát");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("moi ban cap nhat ten");
                        arrstudent[updateid].setName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("moi ban cap nhat gioi tinh");
                        arrstudent[updateid].setGender(Boolean.parseBoolean(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("moi ban cap nhat tuoi");
                        arrstudent[updateid].setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("moi ban cap nhat diem toan");
                        arrstudent[updateid].setMath(Float.parseFloat(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("moi ban cap nhat diem lý");
                        arrstudent[updateid].setLy(Float.parseFloat(scanner.nextLine()));
                        break;
                    case 6:
                        System.out.println("moi ban cap nhat diem hóa");
                        arrstudent[updateid].setHoa(Float.parseFloat(scanner.nextLine()));
                        break;
                    default:
                        double avg = (arrstudent[updateid].getMath() + arrstudent[updateid].getLy() + arrstudent[updateid].getHoa()) / 3;
                        arrstudent[updateid].setAvg(avg);
                        if (arrstudent[updateid].getAvg() >= 8) {
                            arrstudent[updateid].setCapacity("GIỎI");
                        } else if (arrstudent[updateid].getAvg() >= 6.5) {
                            arrstudent[updateid].setCapacity("Khá");
                        } else if (arrstudent[updateid].getAvg() >= 5) {
                            arrstudent[updateid].setCapacity("trung bình");
                        } else {
                            arrstudent[updateid].setCapacity("yếu");
                        }
                        exit = false;
                }

            } while (exit);
        } else {
            System.out.println("MA DANH MUC K TON TAI");
        }
    }

    public int find(int id) {
        for (int i = 0; i < index; i++) {
            if (arrstudent[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void delete() {
        System.out.println("nhap id muon xoa");
        int id = scanner.nextInt();
        int delete = find(id);
        if (delete >= 0) {
            for (int i = 0; i < index; i++) {
                if (i >= delete) {
                    arrstudent[i] = arrstudent[i + 1];
                    index--;
                }
            }
        } else {
            System.out.println("MA DANH MUC K TON TAI");
        }
    }

    public void sort() {
        student temp;
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (arrstudent[i].getAvg() < arrstudent[j].getAvg()) {
                    temp = arrstudent[i];
                    arrstudent[i] = arrstudent[j];
                    arrstudent[j] = temp;
                }
            }
        }
    }

    public void sort1() {
        student temp;
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (arrstudent[i].getId() > arrstudent[j].getId()) {
                    temp = arrstudent[i];
                    arrstudent[i] = arrstudent[j];
                    arrstudent[j] = temp;
                }
            }
        }
    }
    public void sort2(){
        student temp2;
        for(int i=0;i<index-1;i++){
            for(int j=i+1;j<index;j++){
                if(arrstudent[i].getName().compareTo(arrstudent[j].getName())<0){
                    temp2=arrstudent[i];
                    arrstudent[i]=arrstudent[j];
                    arrstudent[j]=temp2;
                }
            }
        }

    }
    public void findName(){
        System.out.println("nhap id muon tim");
        int id = scanner.nextInt();
        scanner.nextLine();
        int indexid=find(id);
        if(indexid>=0){
            do {
                boolean check=false;
                System.out.println("moi ban nhap ten muon tim:");
                String name=scanner.nextLine();
                for(int i=0;i<index;i++){
                    if(arrstudent[i].getName().equals(name)){
                        check=true;
                    }
                }
                if(check==true){
                    arrstudent[indexid].display();
                    return;
                }
                else{
                    System.out.println("ten khong ton tai");
                }
            }while (true);

        }
        else{
            System.out.println("id nay k ton tai");
        }
    }



}
