package common.test;

import java.lang.Math;

public class BoardGenerator {
	 int [][] newboard;
	 boolean debugging=false;;
public BoardGenerator(){
	int i,j,ran;
   newboard=new int [9][9];
   for (i=0;i<9;i++){
	    for (j=0;j<9;j++){
	    	newboard[i][j]=(j+i%3*3)%9;
	    	if (i>=3) newboard[i][j]=(newboard[i][j]+1)%9;
	    	if (i>=6) newboard[i][j]=(newboard[i][j]+1)%9;
	    	newboard[i][j]++;
	    }	    
   }
   for (i=0;i<10;i++){
	   if (debugging) {
		   tostring();
		   System.out.println("");
	   }
   ran=(int) Math.floor(Math.random()*30);
   switch (ran){
   case 0: reflectrow(); break;
   case 10:reflectcolumn();break;
   case 1:exchangerow(1,2);break;
   case 2:exchangerow(1,3);break;	
   case 3:exchangerow(3,2);break;
   case 4:exchangerow(4,5);break;
   case 5:exchangerow(4,6);break;
   case 6:exchangerow(6,5);break;
   case 7:exchangerow(7,8);break;
   case 8:exchangerow(7,9);break;
   case 9:exchangerow(8,9);break;
   case 11:exchangecolumn(1,2);break;
   case 12:exchangecolumn(1,3);break;	
   case 13:exchangecolumn(3,2);break;
   case 14:exchangecolumn(4,5);break;
   case 15:exchangecolumn(4,6);break;
   case 16:exchangecolumn(6,5);break;
   case 17:exchangecolumn(7,8);break;
   case 18:exchangecolumn(7,9);break;
   case 19:exchangecolumn(8,9);break;
   case 20:case 21:case 22:case 23: case 24:reflectdiaganol1();break;
   default: reflectdiaganol2();break;
   }  
  
   
}
  
}
private void reflectrow(){
	int i;
	 for (i=0;i<4;i++){
		  int[] temp=newboard[i];
		  newboard[i]=newboard[8-i];
		  newboard[8-i]=temp;		        
	   }
}

private void exchangerow(int i1, int i2){
    int[] temp=newboard[i1-1];
    newboard[i1-1]=newboard[i2-1];
    newboard[i2-1]=temp;
}
private void exchangecolumn(int j1, int j2){
	int i;
	j1--;j2--;
	 for (i=0;i<9;i++){		    
		    		int temp=newboard[i][j1];
		    	    newboard[i][j1]= newboard[i][j2];
		    	    newboard[i][j2]=temp;		    	    
	   }
}
private void reflectcolumn(){
	int i,j;
	 for (i=0;i<9;i++){
		    for (j=0;j<4;j++){		    	
		    		int temp=newboard[i][j];
		    	    newboard[i][j]= newboard[i][8-j];
		    	    newboard[i][8-j]=temp;		    	
		    }	    
	   }
}
private void reflectdiaganol1(){
	int i,j;
	 for (i=0;i<9;i++){
		    for (j=0;j<9;j++){		   
		    	if (i<j){
		    		int temp=newboard[i][j];
		    	    newboard[i][j]= newboard[j][i];
		    	    newboard[j][i]=temp;		    	
		    }	    }
	   }
}
private void reflectdiaganol2(){
	int i,j;
	 for (i=0;i<9;i++){
		    for (j=0;j<9;j++){		   
		    	if (i+j<8){
		    		int temp=newboard[i][j];
		    	    newboard[i][j]= newboard[8-i][8-j];
		    	    newboard[8-i][8-j]=temp;		    	
		    }	    }
	   }
}

public void tostring(){
	int i,j;
	 for (i=0;i<9;i++){
		    for (j=0;j<9;j++){
		    	System.out.print(newboard[i][j]+" ");
		    }	    
		    System.out.println();
	   }
}
}