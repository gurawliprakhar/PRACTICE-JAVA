
import java.util.Arrays;
import java.util.Scanner;
public class Test {

	

	static int fact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			 res *= i;
		}
		return res;
	}

	static int countDigits(int n) {
		int  count = 0;
		
		while(n>0){
			n = n/10;
			count++;
		}
		return count;
	}
	
	static int trailingZero(int n) {
		int res = 0 ;
		int powerOf5 = 5;
		while(n >= powerOf5) {
			res = res + (n/powerOf5);
			powerOf5 = powerOf5 * 5;
		}
		return res ;
	}
	
	static int Gcd(int m, int n) {
		int min = 0;
		if(m<n) {
		  min = m;
		}else {
			min = n;
		}
		for(int i=min; i>=1; i--) {
			if(m%i == 0 && n%i == 0) {
				return i;
			}
		}
		return 1;
	}
	
	static int euclidGcd(int m, int n) {
		while(m!=0 && n !=0) {
			if(m>n) {
				m = m-n;
			}else {
				n = n-m;
			}
		}return m;
	}
	
	static int gabrielGcd(int m, int n) {
		while(m!=n) {
			if(m>n) {
				m = m%n;
			}else {
				n = n%m;
			}
		}
			if(m!=0) {
			    return m;
			}else {
				return n;
			}
		
		
	}
	
	static int findLcm(int m, int n) {
		int res = Math.max(m, n);//inbuilt function for maximumn number
		
		while(true) {
			if(res%m == 0 && res%n==0) {
				break;
			}
			res++;
		}
		return res;
	}
	
	static int euclidLcm(int m, int n) {
		return(m*n)/euclidGcd(m,n);
	}
	
	static boolean isPrime(int n) {
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean checkPrime(int n) {
		if(n==1) {
			return false;
		}if(n==2|| n==3) {
			return true;
		}if(n%2==0) {
			return false;
		}
		for(int i=5; i<=Math.sqrt(n);i=i+6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean printPrimes(int n) {
		for(int i=2; i<=n;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
		return true;
	}

	static void sievePrintPrime(int n) {
		boolean[] prime = new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(prime[i] == false) {
				for(int j=i*i;j<=n;j=j+1) {
					prime[j] = true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	static void printDivisor(int n) {
		int i=0;
	 for( i=1; i<=n; i++) {
		 if(n%i == 0) {
			 System.out.println(i);
			
		 }
	 }
	 for( ;i>=1;i--) {
		 if(n%i == 0 && i!= n/i) {
			 System.out.println(n/i);
		 }
	  }
	}
	
	static void primeFactors(int n) {
		int i = 2;
		while(n>1){
		while(n%i == 0) {
			System.out.println(i);
			n = n/i;
		}
		i++;
		}if(n > 1) {
			System.out.println(n);
		}
	}
		
	static int[] mergeSort(int[] ar1, int[] ar2) {
	        int[] res = new int[ar1.length + ar2.length];
	        int i = 0, j = 0, k = 0;
	        while (i < ar1.length && j < ar2.length) {
	            if (ar1[i] < ar2[j]) {
	                res[k++] = ar1[i++];
	            } else {
	                res[k++] = ar2[j++];
	            }
	        }
	        while (i < ar1.length) {
	            res[k++] = ar1[i++];
	        }
	        while (j < ar2.length) {
	            res[k++] = ar2[j++];
	        }
	        return res;
	    }
	
	static String decimalToBinary(int n) {
		String b = "";	
		
		while(n>=1) {
		    int x  = n%2;
		     n= n/2;
		     b= x+b;
		}
		return b;
	}
	
	static void binaryToDecimal(String b) {
		int res = 0;
		int powOf2 = 1;
		
		for(int i=b.length()-1; i<0; i++) {
			res = res + powOf2;
		}powOf2 = powOf2 * 2;
		
	}
	
     static void printSubArray(int[] ar, int k) {
	  for(int i = 0; i<ar.length-k; i++) {
		  for (int j=i; j<i+k;j++){
			  System.out.print(ar[j] + " ");
		  }
		  System.out.println();
	  }
	}
  
     static boolean powOf2(int n) {
    	 if(n==0) {
    		 return false;
    	 }
    	 return (n & (n-1))==0;
     }

     static int lonelyInterger(int[] ar) {
    	 int res = 0;
    	 
		for(int i:ar) {
    		 res = res ^ i;
    	 }
		return res;
     }
     
     static boolean isConscutive(int n) {
    	 if((n & (n<<1)) != 0) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }

     static int countConscutive(int n) {
    	 int count = 0;
    	 
    	 while (n>0) {
    		 n = (n&(n<<1));
    			 count++;
    		 }
    	 return count;
    	 }
     
     static int swapEvenOdd(int n) {
    	 return((n & 0xaaaaaaaa)>>>1 ) | (( n & 0x55555555)<<1);
     }
     
     static int numberOfTZ(int n) {
    	 return(int)( Math.log10((n&n-1) ^ n));
     }
     
     static int reverseBinary(int n, int len) {
    	 int f=len-1,l=0;
    	 int rev = 0;
    	 
    	 while(f >= 0){
    		if((n & (1<<f)) != 0){
    			rev = rev | (1 << l);
    		}
    		if((n & (1 << 1)) != 0) {
    			rev = rev | (1 << f);
    		}
    		f--;
    		l++;
    	 }
    	 return rev;
     }
     
     static void replace(int[] ar) {
    	 
    	 int i=0, j=ar.length-1;
    	 while(i<j) {
    		 while(ar[i] == 1) {
    			 i++;
    		 }while(ar[j] == 0) {
    			j--;
    		 }if(i < j) {
    		 ar[i] = 1;
    		 ar[j] = 0;
    		 i++;
    		 j--;
    		 }
    	 }
     }
     
     static void longestSubArray(int[] ar) {
    	 int si = 0, ei = 0,start = 0, end = 0;
          for(int i =0; i < ar.length-1; i++) {
        	  if(ar[i] - ar[i+1] == 1) {
        		  ei++;
        	  }else {
        		  if(ei-si > end-start) {
        			  start = si;
        			  end = ei;
        		  }
        		  si = i+1;
        		  ei = i+1;
        	  }
          }for (int i = start; i <= end; i--) {
        	  System.out.print(ar[i] + " ");
          }
      }
     
     static int palindromicBinaryNumber(int n) {
    	 int l = 0, count = 0;
    	  while(count < n) {
    		  l++;
    		  count = count +(int) Math.pow(2,(l-1)/2);
    	  }
    	 count = count - (int)Math.pow(2,(1-1)/2); 
    	 
    	 int ele = n-count-1;
    	 int ans = (1<< (l-1) | (ele << (1 / 2)));
    	int reversed = reverseBinary(ans,1);
    	return reversed;
    	
     }
     
     static int checkBits(int[] ar,int mask) {
    	 int count = 0;
    	 for(int i=0; i<ar.length;i++) {
    	 if((mask & ar[i]) == mask) {
    		 count++;
    	  }
    	 }
    	 return count;
     }
     
     static int maxAndValue(int[] ar) {
    	 int mask = 0;
    	 int res = 0;
    	 
    	 for(int i=31; i>=0; i--) {
    		mask = (1 << i) | res;
    		int count = checkBits(ar, mask);
    		
    		if(count >= 2) {
    			res = res | mask;
    		}
    	 }
    	 return res;
     }
     
     static int factRecursion(int n) {
    	 if(n==0 || n==1) {
    		 return 1;
    	 }
    	return n*factRecursion(n-1); 
     }
     
     static int fibonacciRecursion(int n) {
    	 if(n==1 || n==2) {
    		 return 1;
    	 }
    	 return fibonacciRecursion(n-1) + fibonacciRecursion(n-2); 
     }
     
     static void printNRecursion(int n) {
    	 if(n==0) {
    		 return;
    	 }
    	 printNRecursion(n-1);
    	 System.out.println(n);
     }
     
     static int countDigitsRecursion(int n) {
    	 if(n==0) {
    		 return 0;
    	 }
    	 return countDigitsRecursion(n/10)+1;
     }
     
     static int sumofDigitsRecursion(int n) {
    	 if(n==0) {
    		 return 0;
    	 }
    	return sumofDigitsRecursion(n/10) + n%10;
     }
   
     static int medianCalculator(int [] arr) {
    	 Arrays.sort(arr);
    	 
         if(arr.length%2 == 1) {
        	 return arr[arr.length/2];
         }else {
        	 int middleLeft = arr[(arr.length-1)/2];
        	 int middleRight = arr[arr.length/2]; 
        	 return(int)(middleLeft + middleRight)/2;
         }
     }
     
    static String reverseStringRecursion(String s, String r, int i) {
    	if(i < 0) {
    		return r;
    	}
    	return reverseStringRecursion(s,r+s.charAt(i),i-1);
    }
     
     public static void main(String[] args) {
 		Scanner scan  = new Scanner(System.in);	
        String s =  scan.next();
        System.out.println(reverseStringRecursion(s, "", s.length()-1));
         scan.close();
 	 }  
}
	
	





























