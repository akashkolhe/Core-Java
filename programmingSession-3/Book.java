import javax.lang.model.util.ElementScanner6;

class Book implements Comparable {
    String name;
    int id;
    double price;

    Book(String bname, int bid, double bprice) {
        this.name = bname;
        this.id = bid;
        this.price = bprice;
    }

    public String toString() {
        return "Book name=" + name + " " + "book id=" + id + ",price=" + price;
    }

    public int compareTo(Object o) {
        Book b = (Book) o;
        if (this.price > b.price) {
            return 1;
        } else if (this.price < b.price) {
            return -1;
        } else {
            return 0;
        }
    }
}