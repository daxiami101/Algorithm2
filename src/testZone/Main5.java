package testZone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 * 
 * @author user001
 *测试方法
 *关于括号的问题，关键：考虑可能出现的字符的情况。
 *            solution：1、情况是并列的，采用if-else-if结构
 *                      2、字符需要一个个判断，外层须有for循环
 *                      3、判断每个字符是，还有对之前的记录进行对比，
 *                          数据结构：stack或者List均可，【注意】判定无效之后，及时清空 
 *                      4、转义字符
 */
public class Main5{
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        (quote "!@#$%") "!@#$%"
//        (reverse "a b c") "c b a"
//        (search "abcdef" "cd" ) "cdef"
//        (search "abcdef" "xy" ) ""
//        (combine "a" "b" "cde) ") "abcde) "
        String s=sc.nextLine();//注意转义字符
        Stack<String> stack=new Stack<String>();
        StringBuilder str=new StringBuilder();
        List<String> strList=new ArrayList<String>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
        	System.out.println("当前char"+i+":"+chars[i]);
            if(chars[i]=='('){
            	System.out.println("======进入结果："+chars[i]);
                if(str.indexOf("\"")==-1){
                    stack.push("(");
                }else{
                    str.append('(');
                }
            }
            else if(chars[i]==')'){
            	System.out.println("======进入结果："+chars[i]);
                if(str.indexOf("\"")!=-1){
                    str.append(')');
                }else{
                    String back=stack.pop();
                    while(!back.equals("(")){
                        strList.add(back);
                        back=stack.pop();
                    }
                    String operate=strList.get(strList.size()-1);
                    switch(operate){
                        case "quote":stack.push("\""+(strList.get(0)).replaceAll("\"","")+"\"");break;
                        case "search":stack.push(search(strList.get(1),strList.get(0)));break;
                        case "reverse":stack.push(reverse(strList.get(0)));break;
                        case "combine":
                            String stringComb=combine(strList.subList(0,strList.size()-1));
                            stack.push(stringComb);
                            break;
                    }
                    strList.clear();//注意必须清空
                }
            }
            else if(chars[i]==' '){
            	System.out.println("======进入结果："+chars[i]);
                if((str.indexOf("\"")!=-1)&&(chars[i-1]!='\"')){
                    str.append(chars[i]);                
                }else{
                    if(str.length()>0){
                        String tempString=str.toString();
                        stack.push(tempString);
                        str.setLength(0);
                    }
                }
            }
            else if((chars[i]=='\"')&&(str.indexOf("\"")!=-1)){
            	System.out.println("======进入结果："+chars[i]);
                if(str.length()>0){
                        str.append('\"');
                        String tempString=str.toString();
                        stack.push(tempString);//目标字符
                        str.setLength(0);
                    }
            }
            else{
            	System.out.println("======进入结果："+chars[i]);
                str.append(chars[i]);
            }
        }
        for(int i=0;i<stack.size();i++){
            System.out.print("result:"+stack.pop());//输出
        }
        sc.close();
    }
    
    static String search(String s1,String s2){
        s1=s1.replaceAll("\"","");
        s2=s2.replaceAll("\"","");
        if(s1.indexOf(s2)!=-1){
            return "\""+s1.substring(s1.indexOf(s2))+"\"";
        }else{
            return  "\""+ "\"";
        }
    }
    static String reverse(String str){
    	str=str.replaceAll("\"","");//【注意】赋值之后才有效，不可以直接使用
        StringBuilder sb=new StringBuilder();//关于字符串拼接，不要用String，StringBuilder效率高，节省时间
        char[] chars=str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            sb.append(chars[i]);
        }
        return "\""+sb+"\"";
    }
    static String combine(List<String> list){
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            String s=(list.get(i)).replaceAll("\"","");
            sb.append(s);//关于字符串拼接，不要用String，StringBuilder效率高，节省时间
        }
        return "\""+sb+"\"";
    }
}