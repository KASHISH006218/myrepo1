// 
class downloadfile{
    public static void file( String file){
        for ( int i = 0; i < 10; i++) {
            System.out.println("Downloading file: " + file + " - " + (i + 1) * 10 + "% completed");
            try {
                Thread.sleep(500); // Simulate time taken to download
            } catch (InterruptedException e) {
                System.out.println(file  +"done");
            }
        }
    }
}
class Hello {
    public static void main(String[] args) {
        String file = "example.txt";
        System.out.println("Starting download of " + file);
        downloadfile.file(file);
        System.out.println("Download completed for " + file);
    }
}
