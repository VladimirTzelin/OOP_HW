package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.utils.Validate;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
/* ˜˜˜˜˜˜ ˜˜˜˜˜˜.
˜˜˜˜˜˜ ˜˜˜˜˜˜:  NONE    READ    CREATE  UPDATE  LIST    HELP    DELETE  EXIT
˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜: list
˜˜˜˜˜˜˜˜˜˜˜˜˜: 1
˜˜˜: Maikl,˜˜˜˜˜˜˜: Kolosod,˜˜˜˜˜˜˜: +56545678934 
˜˜˜˜˜˜˜˜˜˜˜˜˜: 2
˜˜˜: Anatoliy,˜˜˜˜˜˜˜: Nosov,˜˜˜˜˜˜˜: +23267854329
˜˜˜˜˜˜˜˜˜˜˜˜˜: 3
˜˜˜: Petr,˜˜˜˜˜˜˜: Korin,˜˜˜˜˜˜˜: +76857689456    

˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜:
*/