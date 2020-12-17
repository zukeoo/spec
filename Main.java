public class Main {
    public static void main(String[] args){
        ProgramWindow MainWindow = new ProgramWindow();
        GetData Get = new GetData();
        MainWindow.createWindow();
        Get.Get();
    }
}
