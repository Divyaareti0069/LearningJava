package collect;

public class Article {
	int article_id;
	String article_name;
	String publishedwebsite;
	int no_of_likes;
	
	public Article(int article_id,String article_name,String publishedwebsite,int no_of_likes) {
		this.article_id=article_id;
		this.article_name=article_name;
		this.no_of_likes=no_of_likes;
		this.publishedwebsite=publishedwebsite;
	}
	
	public int getId() {
		return article_id;
		
	}
	public void setId(int article_id) {
		this.article_id=article_id;
	}
	
	
	

	public String getname() {
		return article_name;
	}
	public void setA_name(String a_name) {
		this.article_name = article_name;
	}
	public String getA_publishedwebsite() {
		return publishedwebsite;
	}
	public void setA_publishedwebsite(String a_publishedwebsite) {
		this.publishedwebsite = publishedwebsite;
	}
	public int getNo_of_likes() {
		return no_of_likes;
	}
	public void setNo_of_likes(int no_of_likes) {
		this.no_of_likes = no_of_likes;
	}
	public static void main(String[] args) {
		
		
	}

}
