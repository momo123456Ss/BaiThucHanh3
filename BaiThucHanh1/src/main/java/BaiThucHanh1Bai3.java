import java.io.*;
import java.util.Scanner;

public class BaiThucHanh1Bai3 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/resources/input.txt");
        Scanner sc = new Scanner(f);
        String content = sc.nextLine();
        System.out.println(content);
        int SoLuong = content.trim().split("[\\S,]+").length;
        System.out.println(SoLuong);
        GhiFile();
        ChuanHoa();
    }
    public static void GhiFile() throws IOException {
        File f = new File("src/main/resources/input.txt");
        Scanner sc = new Scanner(f);
        String content = sc.nextLine();
        FileWriter out = new FileWriter("src/main/resources/output.txt");
        try (PrintWriter writer = new PrintWriter(out)) {
            writer.println(content.replaceAll("\\{file}","Tap Tin"));
        }
        sc.close();
        out.close();
    }
    public  static void ChuanHoa() throws FileNotFoundException {
        File f = new File("src/main/resources/input.txt");
        Scanner sc = new Scanner(f);
        String content = sc.nextLine();
        content = content.replaceAll("\\{file}","Tap Tin");
        content = content.trim();
        char[] charArray = content.toCharArray();
        boolean foundSpace = true;
        for (int i = 0 ;i < content.length();i++){
            if (Character.isLetter(content.charAt(i))){
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        content = String.valueOf(charArray);
        System.out.println(content);
    }
}
