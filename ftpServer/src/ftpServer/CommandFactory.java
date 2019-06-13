/**
 * The type CommandFactory.
 *
 * @author yi.wang11@hand-china.com
 * @version 1.0
 * @date ${.now?string["yyyy/MM/dd"]}
 */

package ftpServer;

public class CommandFactory {

    public static Command createCommand(String type) {

        type = type.toUpperCase();
        switch(type)
        {
            case "USER":return new UserCommand();

            case "PASS":return new PassCommand();

            case "LIST":return new ListCommand();

            case "PORT":return new PortCommand();

            case "QUIT":return new QuitCommand();

            case "RETR":return new RetrCommand();

            case "CWD":return new CwdCommand();

            case "STOR":return new StoreCommand();

            default :return null;
        }

    }
}