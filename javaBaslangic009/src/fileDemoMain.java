import java.io.*;
import java.util.Scanner;

public class fileDemoMain {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu..: ");
            }else{
                System.out.println("Dosya Zaten Mevcut..: ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya Adı..: " + file.getName());
            System.out.println("Dosya Yolu..: " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir Mi?.: " + file.canWrite());
            System.out.println("Dosya Yazılabilir Mi?.: " + file.canRead());
            System.out.println("Dosya Uzunluğu..: " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    // Aşşağıdaki işlem dosyanın üzerine yazar..:
    public static void writeFile(){
        try {
            // File Name den Yani Url den sonra true yazmamız bizim üstüne yazmak yerine dosyaya yeni veri girişi yapmamızı sağlar..:
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\IdeaProjects\\files\\students.txt",true));
            writer.newLine();
            writer.write(" Merhaba Dünya ");
            System.out.println("Dosyaya Yazıldı..: ");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}