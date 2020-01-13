package beratbadanideal;
import java.util.Scanner;
/**
 *
 * @author Zakaria
 */
public class BeratBadanIdeal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("####################################");
        System.out.println("\"MENGHITUNG BERAT BADAN IDEAL ANDA\"");
        System.out.println("####################################");
        System.out.println("SILAHKAN MASUKAN :");
        System.out.println("Nama Lengkap =");
        String nama = sc.next();
        System.out.println("Usia =");
        String Usia = sc.next();
        System.out.println("Jenis Kelamin (L/P) + ");
        String jk = sc.next();
        System.out.println("Berat Badan (kg) =");
        double bb =  sc.nextDouble();
        System.out.println("Tinggi Badan (cm) =");
        double tb =  sc.nextDouble();
        
        tb /= 100;
        double bmi = bb/(tb*tb);
       
        double ob = 27;
        double gem = 23;
        double norm = 17;
        if(jk.equals("p")){
            gem = 25;
            norm = 18;
        }
        System.out.println("####################################");
        System.out.println("Nama  = " +nama);
        System.out.println("Usia  = " +Usia);
        System.out.println("Jenis Kelamin  = " +jk);
        System.out.println("BMI = " +bmi);
      
       
        if(bmi>ob){
            System.out.println("OBESITAS  \n \"Note : Warning!, Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan.\" ") ;
        } else if(bmi>gem){
            System.out.println("KEGEMUKAN  \n \"Note : Harus waspada! anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali.\" ") ;
        } else if(bmi>norm){
            System.out.println("NORMAL  \n \"Note : Selamat berat badan anda termasuk ideal.\" ") ;
        } else {
            System.out.println("KURUS   \n \"Note : Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga.\" ") ;
        }
        System.out.println("####################################");
    }
   
}