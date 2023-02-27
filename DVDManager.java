package jp.co.brightstar.dvd;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//DVD管理器
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DVDManager {
	//DVD數組
	private DVD[]dvds ;
	
	//菜單
		public void menu() {
			System.out.println("歡迎使用DVD管理器");
			System.out.println("-----------------------");
			System.out.println("1.新增DVD");
			System.out.println("2.查看DVD");
			System.out.println("3.刪除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.歸還DVD");
			System.out.println("6.退出DVD");
			System.out.println("-----------------------");
			System.out.print("請選擇 : ");
			
			int option = new java.util.Scanner(System.in).nextInt();
			switch(option) {
				case 1:
					System.out.println("新增DVD");
					insertDVD();
					break;
				case 2:
					System.out.println("查看DVD");
					selectDVD();
					break;
				case 3:
					System.out.println("刪除DVD");
					deleteDVD();
					break;
				case 4:
					System.out.println("借出DVD");
					rentDVD();
					break;
				case 5:
					System.out.println("歸還DVD");
					returnDVD() ;
					break;
				case 6:
					System.out.println("退出DVD");
					exitDVD();
					break;
				default:
					//TODO 輸入數字範圍不正的情況下，請重新輸入
					System.out.println("請輸入1~6之間的數字");
					menu();	
			}
			System.out.println("-----------------------");
			returnMenu();
		}
	//返回菜單
		public void returnMenu() {
			System.out.println("輸入0返回");
			int input = new java.util.Scanner(System.in).nextInt();
				if(input==0) {
					menu();
				}else {
					System.out.println("請輸入0");
					returnMenu();
				}
		}
		
	//新增DVD
		public void insertDVD() {
			Scanner Sca =new Scanner(System.in);
			for(int i = 0;i<=dvds.length;i++) {
				if(dvds[i]==null) {
					System.out.println("請輸入要新增的DVD資訊");
					String name = Sca.nextLine();
					dvds[i] = new DVD(name,0,0,0);
					System.out.println("如需退出新增請輸入0返回菜單如需繼續輸入請輸入1");
					//想新增一個超過null就無法輸入的功能
					if(Sca.nextInt()==1){
						 insertDVD() ;
					}else {
						returnMenu();
					}
				} 
			}
		}
	//查看DVD
		public void selectDVD() {
			System.out.println("序號\t狀態\t名稱\t借出日期\t借出次數");
			
			for(int i = 0;i<dvds.length;i++) {
				if(dvds[i]!=null) {
					int state =dvds[i].getState();
					String name = dvds[i].getName();
					int date =dvds[i].getDate();
					int count =dvds[i].getCount();
						if(state==1) {
							System.out.println(i+1+"\t已借出\t"+name+"\t"+date+"日\t"+count+"次\t");
						}else if(state==0) {
							System.out.println(i+1+"\t未借出\t"+name+"\t"+date+"日\t"+count+"次\t");
						}
				}
		} returnMenu();
		
}
	//刪除DVD
		public void deleteDVD() {
			System.out.println("請輸入想刪除DVD的序號");
			Scanner Sca =new Scanner(System.in);
			int deleteNum = Sca.nextInt();
			dvds[deleteNum-1] = dvds[deleteNum];
			for(int i =deleteNum; i<dvds.length-1;i++) {
					dvds[i] =dvds[i+1];			
			}
			dvds[dvds.length-1] =null;
			System.out.println("目前的DVD列表如下");
			selectDVD();
		}
	//借出DVD
		public void rentDVD() {
			
		}
	//歸還DVD
		public void returnDVD() {
			
		}
	//退出DVD
		public void exitDVD() {
			System.out.println("感謝你的使用");
			System.exit(0);
		}
}