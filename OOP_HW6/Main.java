package OOP_HW6;

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
/* Пример вывода.
Список команд:  NONE    READ    CREATE  UPDATE  LIST    HELP    DELETE  EXIT
Введите команду: list
Идентафикатор: 1
Имя: Maikl,Фамилия: Kolosov,Телефон: +56545678934 
Идентафикатор: 2
Имя: Anatoliy,Фамилия: Nosov,Телефон: +23267854329
Идентафикатор: 3
Имя: Petr,Фамилия: Korin,Телефон: +76857689456    

Введите команду:
*/