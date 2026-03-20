package learning;

public class Patterns {

	public static void main(String[] args) {
//1. square hellow pattern
/*
		int r=5,c=5;
		for(int i=1;i<=r;i++)
		{
			for (int j=1;j<=c;j++) {
				if(i==1 || i==r || j==1 || j==c) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
------------------------
//2.Triangular patter
		int r=4,c=4;
		for(int i=1;i<=r;i++) {
			for(int k=i;k<r;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i
						+" ");
			}
			
			System.out.println();
		}

--------------------------------
		
// 3. Number Increasing pyramid
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
//4. Number Increasing Reverse pyramid
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(j);
			}
			System.out.println();
		}	

-----------------------------

//5.Number Changing Pyramid
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		
	
//6. Zero One Triangle
	
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		
		
//7. palindrome Triangle
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=4-i;k++) {
				System.out.print(" ");
			}
			//descending order
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//ascending order
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			
			
			System.out.println();
		}


//8.Rhombus Pattern
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}for(int j=1;j<=4;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		
---output----
* * * * 
 * * * * 
  * * * * 
   * * * * 
    * * * * 

		
//9. Diamond pattern
 for(int i=1;i<=4;i++) {
	 
	 //top angle
	    for(int k=1;k<=4-i;k++) {
			System.out.print(" ");
		}for(int j=i;j>=1;j--) {
				System.out.print("* ");
		}
		System.out.println();
 }
		
	//Systemout.println("--------------");
		
for(int j=1;j<=3;j++) {
		//low angle
		for(int x=1;x<=j;x++) {
			System.out.print(" ");
		}for(int y=j;y<=3;y++) {
				System.out.print("* ");
		}
		System.out.println();
		}		
 ----output-------
 
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
		
------------	
		
//10. Butterfly  Star Pattern
		for(int i=1;i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
-----------output---------


		
//11.Square fill Pattern
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++) {
			System.out.print("*");
			}
			System.out.println();
			}
	
---------output--------

*****
*****
*****
*****
*****

-----------------------------


//12. Right half pyramid
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
-----------output-----------
*
**
***
****
*****
-----------------------------
//13. Reverse Right Half pyramid
		int r=5,c=5;
		for(int i=1;i<=r;i++) {
			for(int j=i;j<=c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

--------output----------------
*****
****
***
**
*
------------------------------

		
//14. Left Half Pyramid
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

---------output-------------
*
**
***
****
*****
-------------------------------

//15. Reverse Left Half Pyramid
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
				
			}
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
------output----------

*****
 ****
  ***
   **
    *
-------------------------------

//16.k pattern
		int r=5,c=5;
		for(int i=1;i<=r;i++) {
			for(int j=i;j<=c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
---------output--------------
*****
****
***
**
*
**
***
****
*****
-------------------------------


//17.Triangle Star pattern
		int r=5,c=4;
		for(int i=1;i<=r;i++) {
			for(int k=i;k<r;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
----------output------------
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
-------------------------------

		
//18.Reverse Number Triangle Pattern	
		
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print( j+" ");
			}
			
			System.out.println();
		}

-------output--------
1 2 3 4 
 2 3 4 
  3 4 
   4 		
-------------------------------
*/
//19. Mirror Image Triangle Pattern

		for(int i=1;i<=4;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print( j+" ");
			}
			
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int k=i;k<=3;k++) {
				System.out.print(" ");
			}
			for(int j=4-i;j<=4;j++) {
				System.out.print( j+" ");
			}
			
			System.out.println();
		}
		/*
------------output-----------

1 2 3 4 
 2 3 4 
  3 4 
   4 
  3 4 
 2 3 4 
1 2 3 4 

-------------------------------
*/
//-----------------------------
	
	
	
	}

}
