public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] addressFolder = {"C:\\Users\\B\\Desktop\\Games1", "C:\\Users\\B\\Desktop\\Games1\\src",
                "C:\\Users\\B\\Desktop\\Games1\\res", "C:\\Users\\B\\Desktop\\Games1\\savegames",
                "C:\\Users\\B\\Desktop\\Games1\\temp", "C:\\Users\\B\\Desktop\\Games1\\src\\main",
                "C:\\Users\\B\\Desktop\\Games1\\src\\test", "C:\\Users\\B\\Desktop\\Games1\\res\\drawables",
                "C:\\Users\\B\\Desktop\\Games1\\res\\vectors", "C:\\Users\\B\\Desktop\\Games1\\res\\icons",
        };

        String[] addressFile = {"C:\\Users\\B\\Desktop\\Games1\\src\\main\\Main.java",
                "C:\\Users\\B\\Desktop\\Games1\\src\\main\\Utils.java",
                "C:\\Users\\B\\Desktop\\Games1\\temp\\temp.txt."
        };
        for (int i = 0; i < addressFolder.length; i++) {
            CreateFolder.createFolder(addressFolder[i]);
        }
        for (int j = 0; j < addressFile.length; j++) {
            CreateFolder.createFale(addressFile[j]);
        }
        CreateFolder.log("C:\\Users\\B\\Desktop\\Games1\\temp\\temp.txt.");


    }
}