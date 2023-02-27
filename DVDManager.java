package jp.co.brightstar.dvd;

//測試
public class test {
	public static void main(String[] args) {
		
		DVDManager manager = new DVDManager();
		
		//初始化DVD
		DVD[]dvds = new DVD[6];
		//有參構造器的順序，是照定義的順序
		dvds[0] = new DVD("羅馬假日",1,1,15);
		dvds[1] = new DVD("風聲鶴唳",0,0,12);
		dvds[2] = new DVD("浪漫滿屋",0,0,30);
		manager.setDvds(dvds);
		manager.menu();
		
		
}
}
