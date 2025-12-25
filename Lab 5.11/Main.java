import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับข้อมูล 4 เอกสาร
        String t1 = sc.nextLine();
        int w1 = Integer.parseInt(sc.nextLine());

        String p1 = sc.nextLine();
        int pg1 = Integer.parseInt(sc.nextLine());

        String t2 = sc.nextLine();
        int w2 = Integer.parseInt(sc.nextLine());

        String p2 = sc.nextLine();
        int pg2 = Integer.parseInt(sc.nextLine());

        Document d1 = new TextDocument(t1, w1);
        Document d2 = new PDFDocument(p1, pg1);
        Document d3 = new TextDocument(t2, w2);
        Document d4 = new PDFDocument(p2, pg2);

        Document[] docs = { d1, d2, d3, d4 };

        int totalPages = 0;

        // รวมเฉพาะจำนวนหน้าของ PDF
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d; // downcasting
                totalPages += pdf.pageCount;
            }
        }

        // แสดงรายละเอียดเอกสาร
        for (Document d : docs) {
            d.displayDetails();
        }

        // แสดงผลรวม
        System.out.println("Total Pages: " + totalPages);

        sc.close();
    }
}
