
package librarymanagement;

import java.util.ArrayList;

public class DeleteDoc {
    public boolean deleteDocument(String id, ArrayList<Document> documents) {
        Document doc = documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null); 
        if (doc == null) {
            return false;
        }
        documents.remove(doc);
        return true;
    }
}
