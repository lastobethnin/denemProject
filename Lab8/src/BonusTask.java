import javax.swing.*;
import java.io.File;

public class BonusTask {
    public static void main(String[] args) {
        pickFile();

    }
    public static File pickFile(){
        JFileChooser fileChooser = new JFileChooser(".");
        int i = fileChooser.showOpenDialog(null);
        System.out.println("showOpenFile() returned: " + i);
        File file = null;
        if(i == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile();
            System.out.println("You selected: " + file);
            System.out.println("File length is: "+ file.length());
            System.out.println("is it readable: " +file.canRead());
        }
        return file;
    }
}
