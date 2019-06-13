/**
 * The type Command.
 *
 * @author yi.wang11@hand-china.com
 * @version 1.0
 * @date ${.now?string["yyyy/MM/dd"]}
 */


package ftpServer;

import java.io.Writer;

interface Command {

    /**
     * @param data   从ftp客户端接收的除ftp命令之外的数据
     * @param writer 网络输出流
     * @param t      控制连接所对应的处理线程
     */
    public void getResult(String data, Writer writer, ControllerThread t);

}