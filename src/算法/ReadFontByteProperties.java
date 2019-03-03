package 算法;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author hcoly1
 * @create 2019-02-24-15:32
 */
public class ReadFontByteProperties {

    static private String fontByteStr = null;
    static {
        loads();
    }
    synchronized static public void loads() {
        if (fontByteStr == null) {
            InputStream is = ReadFontByteProperties.class.getResourceAsStream("/fontByte.properties");
            Properties dbproperties = new Properties();
            try {
                dbproperties.load(is);
                fontByteStr = dbproperties.getProperty("fontByteStr").toString();
            } catch (Exception e) {
                //System.err.println("涓嶈兘璇诲彇灞炴�ф枃浠�. " + "璇风‘淇漟ontByte.properties鍦–LASSPATH鎸囧畾鐨勮矾寰勪腑");
            }
        }
    }
    public static String getFontByteStr() {
        if (fontByteStr == null)
            loads();
        return fontByteStr;
    }
}
