/**
 * The type QuitStore.
 *
 * @author yi.wang11@hand-china.com
 * @version 1.0
 * @date ${.now?string["yyyy/MM/dd"]}
 */

package ftpServer;

import java.io.IOException;
import java.io.Writer;

public class QuitCommand implements Command{

    @Override
    public void getResult(String data, Writer writer, ControllerThread t) {

        try {
            writer.write("221 quit.\r\n");
            writer.flush();
            writer.close();
            t.getSocket().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}