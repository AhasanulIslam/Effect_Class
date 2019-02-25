import java.io.IOException;
import java.util.Scanner;

public class Main_Test_Class
{
    public static void main(String[] args) throws IOException {


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a color: ");
        System.out.println("1.Green Image\n2.Blue Image\n3.Negative Image\n4.Sepia Image\n5.GrayScale\n6.Red Image\n7.exit");
        int letter = reader.nextInt();


        switch (letter) {
            case 1:
                GreenImage f = new GreenImage();
                f.setFilter();
                f.greenFilter();
                System.out.println("Green");
                break;


            case 2:
                BlueImage fi = new BlueImage();
                fi.setBlueFilter();
                fi.blueFilter();
                System.out.println("Blue");
                break;


            case 3:
                NegetiveImage fe = new NegetiveImage();
                fe.setnNegetiveFilter();
                fe.negetiveFilter();
                System.out.println("Negative");
                break;


            case 4:
                Sepia fg = new Sepia();
                fg.setsepiaFilter();
                fg.sepiaFilter();
                System.out.println("sepia");
                break ;



            case 5:
                GrayScaleImage gr = new GrayScaleImage();
                gr.setGrayFilter();
                gr.grayFilter();
                System.out.println("gray");
                break;

            case 6:
                RedImage rg = new RedImage();
                rg.setRedFilter();
                rg.redFilter();
                System.out.println("red");
                break;


            case 7:
                return ;
            default:
                System.out.println("invalid option");
        }

    }

}
