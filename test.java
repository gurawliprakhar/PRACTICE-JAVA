
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
	static String PalindromeRecursion(String s, String r, int i) {
		if ( i < 0) {
			return r;
		}
		return PalindromeRecursion(s,r+s.charAt(i),i-1);
	}

	static boolean isPalindromeRecursion(String s, int i, int j) {
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}if(j <= i) {
			return true;
		}
	 return	isPalindromeRecursion(s,i+1,j-1);
	}
	
	static int sumOfEleREcursion(int[] ar, int i) {
		if(i== ar.length) {
			return 0;
		}return ar[i] + sumOfEleREcursion(ar,i+1);
	}
	
	static int josephusRecursion(int n, int k) {
		if(n==1) {
	     return 0;
		}
		return (josephusRecursion(n-1,k) + k)%n;
	}
	
    static void balanceParenthesisRecursion(char[] ar, int n, int i, int o, int c) {
	     if (i == ar.length) {
	         System.out.println(ar);
	          return;
	        }
	        
	      if (o < n) {
	         ar[i] = '(';
	          balanceParenthesisRecursion(ar, n, i + 1, o + 1, c);
	        }
	       if (c < o) {
	          ar[i] = ')';
	          balanceParenthesisRecursion(ar, n, i + 1, o, c + 1);
	        }
	    }

    static String reverseString(String s) {
    	String res = "";
    	
    	for(int i=0; i<s.length();i++) {
    		res = s.charAt(i) + res;
    	}
    	
    	return res;
    }
    
    static boolean isPalindrome(String s) {
    	int i=0, j=s.length()-1;
    	
    	while(i < j) {
    		if(s.charAt(i) == s.charAt(j)) {
    			i++;
    			j--;
    		}else {
    			return false;
    		}
    	}
    	return true;
    }
	
	static int countVowels(String s) {
		int count = 0;
		
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='e'|| ch=='i'||ch=='u' ||ch=='A'|| ch=='E'|| ch=='E'|| ch=='I'||ch=='U') {
				count++;
			}
		}
		return count;
	}
    
    static int countUpperCase(String s) {
    	int uc = 0;
    	
    	for(int i=0; i < s.length();i++) {
    		char ch = s.charAt(i);
    		if(ch >= 'A'  &&  ch <='Z' ) {
    			uc++;
    		}
    	}
    	return uc;
    }
    
    static int countSpace(String s) {
    	int count = 0; 
       for(int i=0; i<s.length();i++) {
    	   
    	  if(s.charAt(i) == ' ') {
    		  count++;
    	     }
    	   }
       return count;
       }

    static String replaceToSpec(String s) {
    	String res = "";
    	
    	for(int i = 0; i< s.length();i++) {
    		char ch = s.charAt(i);
    		if(ch >= 97 && ch <=122) {
    			res = res + "#";
    		}else {
    			res = res + "#";
    		}
    	}
    	return res;
    }
    
    static void getAllSubstringRecursion(String s, String ans) {
    	 ArrayList<String> al = new ArrayList<String>();
    	if(s.length() == 0) {
    		al.add(ans);
    		return;
    	}
    	getAllSubstringRecursion(s.substring(1),ans+s.charAt(0));
    	
    	getAllSubstringRecursion(s.substring(1),ans);
    	
    }
   
    
    //for keypad all possible 
	static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static void possibleWords(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        String key = keypad[s.charAt(0) - '0'];

        for (int i = 0; i < key.length(); i++) {
            possibleWords(s.substring(1), ans + key.charAt(i));
        }
    }

    static void permutationRecursion(char[]ar , int fi) {
    	if(fi== ar.length-1) {
    		System.out.println(ar);
    	return;
    	}
    	for(int i = fi; i<ar.length;i++) {
    		swap(ar,i,fi);
    		permutationRecursion(ar,fi+1);
    		swap(ar,i,fi);
    	}
    }
    
    static void swap(char[]ar, int i, int fi) {
      char temp = ar[i];	
      ar[i] = ar[fi];
      ar[fi] = temp;
    }
    
    static  int maxPiecesrecursion(int n, int a, int b , int c) {
    	if(n == 0) {
    		return 0;
    	}else if(n < 0){
    		return -1;
    	}
    	int temp1 = maxPiecesrecursion(n-a,a,b,c);
    	int temp2 = maxPiecesrecursion(n-b,a,b,c);
    	int temp3 = maxPiecesrecursion(n-c,a,b,c);
    	
    	int pieces = Math.max(temp3,Math.max(temp1,temp2));

    	if(pieces == -1) {
    		return -1;
    	}
    	
    	return pieces +1;
    }
    
    static String toUpperCase(String s) {
    	String res = "";
    	
    	for(int i =0; i<s.length();i++) {
    		char ch = s.charAt(i);
    		
    		if (ch >= 'a' && ch<='z') {
    			res = res + (char)(ch-32);	
			}else {
				res = res +ch;
			}
    	}
    	
    	return res;
    }
    
    static String trim(String s) {
    	int si = 0, ei = 0;
    	for( int i = 0; i<= s.length(); i++) {
        if(s.charAt(i) != ' ') {
        	si = i;
        	break;
        }
      }
    	
    	for( int i = s.length()-1; i >= 0 ; i--) {
       
            if(s.charAt(i) != ' ') {
            	ei = i;
            	break;
            }
          }
    	
    	String res = "";
    	for (int i = si; i <= ei; i++) {
			res = res + s.charAt(i);
		}
    	return res;
    }
    
    static int countSubsetRecursion(int[] ar, int sum,int i) {
    	if(sum == 0) {
    		return 1;
    	}if(sum < 0) {
    		return 0;
    	}if(i == ar.length) {
    		return 0;
    	}
    	
    	return countSubsetRecursion(ar,sum-ar[i],i+1)  + countSubsetRecursion(ar, sum,i+1);
    }
    
    static boolean isLuckyNumberRecursion(int n, int counter) {
    	if(n<counter) {
    		return true;
    	}if(n%counter == 0) {
    		return false;
    	}
    
     return isLuckyNumberRecursion(n-(n/counter),counter+1);
    
    
    }
   
    static void towerOfHanoi(int n, char src, char aux ,char dest) {
    	if(n==1) {
    		System.out.println(src + " -> " + dest);
    		return;
    	}
    	towerOfHanoi(n-1,src,dest,aux);
    	towerOfHanoi(1,src,aux,dest);
    	towerOfHanoi(n-1,aux,src,dest);
    }
    
    static long powRecursion(int x, int y) {
    	if(y == 0) {
    		return 1;
    	}if(y%2 == 0) {
    		long res = powRecursion(x,y/2);
    	   return res*res;
       }else {
    	   return powRecursion(x,y-1) * x;
       }
    }
   
    static String numericSum(String s) {
    	String res = "";
    	int sum = 0;
      for(int i=0; i<s.length();i++) {
    	  char ch = s.charAt(i);
    	  
    	  if(ch >= '0' && ch <= '9') {
    		  sum = sum + ch;
    	  }else {
    		  res = res + ch;
    	  }
      }
    	
    	
    	return res+sum;
    }
    
    //REPLACE WORDS IN GIVEN STRING
    static String findString(String s,String t) {
    	int i=0,j=0;
    	
    	while(i<s.length() && j<t.length()) {
    		 if(s.charAt(i) == t.charAt(j)) {
    			 j++;
    		}else {
    			i++;
    		}
    	}
    	
    	return j == t.length() ? "Yes" : "No";
    }
    
    static void printAllSubstring(String s,int k) {
    	
    	for (int i=0; i <= s.length()-k;i++) {
    		String t  = "";
    		for(int j=i; j<i+4; j++) {
    			t = t+s.charAt(j);
    		}
    		System.out.println(t);
    	}
    }
     
     public static void main(String[] args) {
 		Scanner scan  = new Scanner(System.in);	
        String s =  scan.next();
        System.out.println(reverseStringRecursion(s, "", s.length()-1));
         scan.close();
 	 }  
}
	
	





























