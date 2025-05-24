package InterFace;

interface test1{
int mathMarks=10;
int sciencemarks=20;
public void display();
}
interface test2{
    int  englishMarks=40;
    int  hindiMarks=50;
    
   public  void show();

}

public class PractiseInterface implements test1,test2{
    
    
   
    
    public void display(){
        System.out.println(test1.mathMarks+" "+test1.sciencemarks);
    }
    public void show(){
        System.out.println(test2.englishMarks+" "+test2.hindiMarks);
    }
    public static void main(String[] args) {
        PractiseInterface aa=new PractiseInterface();

    aa.display();
    aa.show();
    }
    
}
