
package librarymanagement;

import java.util.ArrayList;

public class SearchDoc{
    public void searchByBook( ArrayList<Document> documents) {
        documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper( ArrayList<Document> documents) {
        documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal( ArrayList<Document> documents) {
        documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }
}
