package huawei;

import java.util.*;
public class Error {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		while(in.hasNext()){
			String st = in.nextLine();
			int index = st.lastIndexOf("\\");
			String str = index<0?st:st.substring(index+1);
			if(map.containsKey(str)){
				map.put(str, map.get(str)+1);
			}else{
				map.put(str, 1);
			}
		}
		for(String s:map.keySet()){
			System.out.println(s+" "+map.get(s));
		}
		
	}

//		Scanner in = new Scanner(System.in);
//		         
//		        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap������hashmap����������
//		        String key;
//		        String filename;
//		        String path;
//		        while(in.hasNext()){
//		            path = in.next();
//		            //��·��ת��Ϊ�ļ���
//		            int id = path.lastIndexOf('\\');
//		            //����Ҳ���˵��ֻ���ļ���û��·��
//		            filename = id<0  ? path : path.substring(id+1);
//		            int linenum = in.nextInt();
//		            //ͳ��Ƶ��
//		            key = filename+" "+linenum;
//		            if(map.containsKey(key)){
//		                map.put(key, map.get(key)+1);
//		            }else{
//		                map.put(key, 1);
//		            }
//		        }
//		         
//		        in.close();
//		         
//		        //�Լ�¼��������
//		        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//		        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
//		            //����
//		            @Override
//		            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
//		                return(arg1.getValue()-arg0.getValue()) == 0? (arg0.getValue()-arg1.getValue()) : (arg1.getValue()-arg0.getValue());
//		            }
//		        });
//		        //ֻ���ǰ8��
//		        int m=0;
//		        for(Map.Entry<String, Integer> mapping : list){
//		            m++;
//		            if(m<=8){
//		                String[] str = mapping.getKey().split(" ");
//		                String k = str[0].length()>16 ? str[0].substring(str[0].length()-16) : str[0];
//		                String n = str[1];
//		                System.out.println(k+" "+n+" "+mapping.getValue());
//		            }else{
//		                break;
//		            }
//		             
//		        }
//		         

}
