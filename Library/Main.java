import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library CRUD Project ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Update Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Judul   : ");
                    String title = input.nextLine();
                    System.out.print("Penulis : ");
                    String author = input.nextLine();
                    System.out.print("Tahun   : ");
                    int year = input.nextInt();

                    library.addBook(new Book(title, author, year));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    library.showBooks();
                    System.out.print("Index buku yang ingin diupdate: ");
                    int updateIndex = input.nextInt();
                    input.nextLine();

                    System.out.print("Judul baru   : ");
                    String newTitle = input.nextLine();
                    System.out.print("Penulis baru : ");
                    String newAuthor = input.nextLine();
                    System.out.print("Tahun baru   : ");
                    int newYear = input.nextInt();

                    library.updateBook(updateIndex, newTitle, newAuthor, newYear);
                    break;

                case 4:
                    library.showBooks();
                    System.out.print("Index buku yang ingin dihapus: ");
                    int deleteIndex = input.nextInt();

                    library.deleteBook(deleteIndex);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }
}
