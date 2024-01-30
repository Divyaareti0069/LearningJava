package collect;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapwithclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Article> l=new LinkedHashMap<Integer,Article>();
		Article a1=new Article(1,"Shakesphere","google",45000);
		Article a2=new Article(2,"leo","linkedin",60000);
		Article a3=new Article(3,"holmes","chatgpt",90000);
		Article a4=new Article(4,"gulliver","nondetail",7000);
		l.put(1,a1);
		l.put(1,a2);
		l.put(2,a3);
	
		
		
		
		l.remove(2);
		for(Map.Entry e:l.entrySet()) {
			int id=(int) e.getKey();
			Article a=(Article) e.getValue();
			System.out.println(a.article_id+" "+a.article_name+" "+a.no_of_likes+" "+a.publishedwebsite);
		}
		
	}

}
