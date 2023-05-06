import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolder {

    public String pathFolder;
    public String pathFale;
    static StringBuilder builder = new StringBuilder();


    public static void createFolder(String pathFolder) {
        File myDiretori = new File(pathFolder);
        if (myDiretori.mkdir()) {
            System.out.println("Папка " + pathFolder + " успешно создана.");
            builder.append("Папка ").append(pathFolder).append(" успешно создана.\n");
        } else {
            System.out.println("Папка " + pathFolder + " не создана.");
            builder.append("Папка ").append(pathFolder).append(" не создана.\n");
        }
        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void createFale(String pathFale) {
        File myfile = new File(pathFale);
        try {
            if (myfile.createNewFile()) {
                System.out.println("Файл " + pathFale + " успешно создан.");
                builder.append("Файл ").append(pathFale).append(" успешно создан.\n");
            } else {
                System.out.println("Файл " + pathFale + " не создан.");
                builder.append("Файл ").append(pathFale).append(" не создан.\n");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void log(String pathFale) {
        try (FileWriter writer = new FileWriter(pathFale)) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
