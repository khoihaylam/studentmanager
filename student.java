import java.util.Scanner;
public class student {
    private int Id;
    private String Name;
    private boolean gender;
    private int age;
    private double Math;
    private double Ly;
    private double Hoa;
    private double avg;
    private String capacity;

    public student() {
    }

    public student(int Id, String Name, boolean gender, int age, double Math, double Ly, double Hoa, double avg, String capacity) {
        this.Id = Id;
        this.Name = Name;
        this.gender = gender;
        this.age = age;
        this.Math= Math;
        this.Ly=Ly;
        this.Hoa=Hoa;
        this.avg=avg;
        this.capacity=capacity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double ly) {
        Ly = ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void input(Scanner scanner, student arrstudent[], int index){
        this.Id=inputId(arrstudent,index);
        scanner.nextLine();
        this.Name=inputName(scanner);
        this.gender=inputgender(scanner);
        this.age=inputage(scanner);
        this.Math=inputMath(scanner);
        this.Ly=inputLy(scanner);
        this.Hoa=inputHoa(scanner);
        this.avg=inputavg();
        this.capacity=inputHocluc();
//        this.capacity=inputhocluc(arrstudent,index);
    }
    public int inputId(student arrstudent[],int index){
        int max;
        if(index==0){
            max=0;
        }
        else{
            max=arrstudent[0].getId();
            for(int i=0;i<index;i++){
                if(arrstudent[i].getId()>max){
                    max=arrstudent[i].getId();
                }
            }
        }
        return max+1;
    }
    public String inputName(Scanner scanner){
        System.out.println("moi ban nhap ten:");
        return scanner.nextLine();
    }
    public boolean inputgender(Scanner scanner){
        System.out.println("moi ban nhap gioi tinh");
        do {
            String gender=scanner.nextLine();
            if(gender.equals("true")||gender.equals("false")){
                return Boolean.parseBoolean(gender);
            }
            else{
                System.out.println("chi nhap true hoac false");
            }
        }while (true);
    }
    public int inputage(Scanner scanner){
        System.out.println("moi ban nhap tuoi");
        do {
            int age=Integer.parseInt(scanner.nextLine());
            if(age>0){
                return age;
            }
            else{
                System.out.println("tuoi phai lon hon 0");
            }
        }while (true);
    }
    public double inputMath(Scanner scanner){
        System.out.println("moi ban nhap diem toan:");
        return Double.parseDouble(scanner.nextLine());
    }
    public double inputLy(Scanner scanner){
        System.out.println("moi ban nhap diem ly:");
        return Double.parseDouble(scanner.nextLine());
    }
    public double inputHoa(Scanner scanner){
        System.out.println("moi ban nhap diem Hoa:");
        return Double.parseDouble(scanner.nextLine());
    }
    public double inputavg(){
        return (Math+Ly+Hoa)/3;
    }
    public String inputHocluc(){
        if(avg>=8){
            this.capacity="gioi";
        }
        else if(avg>=6.5){
            this.capacity="Kha";
        }
        else if(avg>=5){
            this.capacity="trung binh";
        }
        else{
            this.capacity="yeu";
        }
        return this.capacity;
    }
    public void display(){
        System.out.printf("%5d  %6s  %5s  %5d  %.1f  %.1f  %.1f  %.1f  %5s\n ",this.Id,this.Name,(this.gender)?"Nam":"NU",this.age,this.Math,this.Ly,this.Hoa,this.avg,this.capacity);
    }

}
