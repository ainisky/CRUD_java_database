import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // CREATE
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku berhasil ditambahkan!");
    }

    // READ
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Belum ada data buku.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println("Index Buku: " + i);
            books.get(i).display();
        }
    }

    // UPDATE
    public void updateBook(int index, String title, String author, int year) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            book.setTitle(title);
            book.setAuthor(author);
            book.setYear(year);
            System.out.println("Data buku berhasil diperbarui!");
        } else {
            System.out.println("Index buku tidak valid.");
        }
    }

    // DELETE
    public void deleteBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("Buku berhasil dihapus!");
        } else {
            System.out.println("Index buku tidak valid.");
        }
    }
}
