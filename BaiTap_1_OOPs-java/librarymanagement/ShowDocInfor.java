
package librarymanagement;

import java.util.ArrayList;

public class ShowDocInfor{
     public void showInfor(ArrayList<Document> documents) {
        documents.forEach(document -> System.out.println(document.toString()));
    }
}
