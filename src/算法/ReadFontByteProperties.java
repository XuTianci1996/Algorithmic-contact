package 算法;

import java.io.InputStream;
import java.util.Properties;

public class ReadFontByteProperties {

    public static void main(String[] args) {
        int res = -1;
    	for(int i=0;i<=9;i++){
    		if((600+10*i+6)*(10*i+2)==64032){
    			res = i;
    			break;
    		}
    	}
    	System.out.println(res);
    }
}
