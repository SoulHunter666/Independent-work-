import java.io.File;

public class main {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\erokh\\Desktop\\Коленька.txt");
        File f2 = new File("C:\\Users\\erokh\\Desktop\\Колясик");
        if(f1.isDirectory()){
            System.out.println("Путь: " + f1.getAbsolutePath() + " является каталогом!!");
        }
        else if(f1.isFile()){
            System.out.println("Путь: " +f1.getAbsolutePath() + " является файлом");
        }
        if(f2.isDirectory()){
            System.out.println("Путь: " + f2.getAbsolutePath() + " является каталогом!!");
        }
        else if(f2.isFile()){
            System.out.println("Путь: " +f2.getAbsolutePath() + " является файлом");
        }
    }
}
