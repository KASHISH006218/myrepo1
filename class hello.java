class Filedownload extends Thread {
    String fileName;

    public Filedownload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Downloading file: " + fileName + " - " + (i + 1) * 10 + "% completed");
            try {
                Thread.sleep(500); // Simulate time taken to download
            } catch (Exception e) {
                System.out.println(fileName + " download interrupted");
            }
        }
        System.out.println(fileName + " doneeeee");
    }
}
class hello{
    public static void main(String[] args) {
        Filedownload file1 = new Filedownload("example.txt");
        Filedownload file2 = new Filedownload("example2.txt");
        file1.start();
        file2.start();
        try {
            file1.join(); // Wait for file1 to finish
            file2.join(); // Wait for file2 to finish
        } catch (Exception e) {
            System.out.println("File download ");
        }
    }
}