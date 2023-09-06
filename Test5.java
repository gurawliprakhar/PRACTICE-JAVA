public class Test5 {
    	
	static int findWoodCount(int [] height, int m) {
		
		int woodCount = 0;
		for(int i=0; i<height.length;i++) {
			if(height[i] > m) {
				woodCount = woodCount + (height[i]-m);
			}
		}
		return woodCount;	
	}
	
	static int mashinHeigth(int[]height, int b) {
	  	int max = 0;
	  	for(int i=0; i<height.length;i++) {
	  		if(height[i] > max) {
	  			max = height[i];		
	  		}
	  	}
	  	int l = 0, h =max,m=0;
	  	
	  	while(l<=h) {
	  		m = (l+h)/2;
	  		
	  		int woodCount = findWoodCount(height,m);
	  		
	  		if(woodCount == b || l == m) {
	  			return m;
	  		}else if(woodCount > b) {
	  			l = m;
	  		}else {
	  			h = m;
	  		}
	  	}
	  	return -1;
	}
	
	static float findMedian1(int[]ar1, int[]ar2) {
		int i=0,j=0,k=0;
		
		int[] m = new int[ar1.length+ar2.length];
		while(i<ar1.length &&  j<ar2.length) {
			
			if(ar1[i] < ar2[j]) {
				m[k] = ar1[i];
				i++;
				k++;
			}else {
				m[k]= ar2[j];
			    j++;
			    k++;
			}
		}
		while(i > ar1.length) {
			m[k] = ar1[i];
			i++;
			k++;
		}
		while(j <ar2.length) {
			m[k]= ar2[j];
		    j++;
		    k++;
		}
		if(m.length%2 == 0) {
			int mid = m.length/2;	
			return (float)(m[mid] + m[mid-1])/2;
		}else {
			int mid = m.length/2;
			return m[mid];
		}
		
		
	}
	
	public static double findMedian(int[] ar1, int[] ar2) {
	    if (ar2.length < ar1.length) {
	        return findMedian(ar2, ar1); // Ensure ar1 is the shorter array
	    }

	    int m = ar1.length;
	    int n = ar2.length;
	    int low = 0;
	    int high = m;

	    while (low <= high) {
	        int partitionX = (low + high) / 2;
	        int partitionY = (m + n + 1) / 2 - partitionX;

	        int maxX = (partitionX == 0) ? Integer.MIN_VALUE : ar1[partitionX - 1];
	        int maxY = (partitionY == 0) ? Integer.MIN_VALUE : ar2[partitionY - 1];

	        int minX = (partitionX == m) ? Integer.MAX_VALUE : ar1[partitionX];
	        int minY = (partitionY == n) ? Integer.MAX_VALUE : ar2[partitionY];

	        if (maxX <= minY && maxY <= minX) {
	            if ((m + n) % 2 == 0) {
	                return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
	            } else {
	                return (double) Math.max(maxX, maxY);
	            }
	        } else if (maxX > minY) {
	            high = partitionX - 1;
	        } else {
	            low = partitionX + 1;
	        }
	    }
	    
	    return 0.0; // Return 0.0 if no median found
	}

	static boolean isPossibleSol(int[] ar, int a, int m) {
	    int Painters = 1;
	    int pbc = 0;

	    for (int i = 0; i < ar.length; i++) {
	        if (ar[i] > m) {
	            return false;
	        }

	        if (pbc + ar[i] <= m) {
	            pbc += ar[i];
	        } else {
	        	Painters++;
	            if (Painters > a) {
	                return false;
	            }
	            pbc = ar[i];
	        }
	    }
	    return true;
	}

	static int maxPage(int[] ar, int b) {
	    if (b > ar.length) {
	        return -1;
	    }
	    int l = Integer.MIN_VALUE, h = 0;

	    for (int i = 0; i < ar.length; i++) {
	        if (ar[i] > l) {
	            l = ar[i];
	        }
	        h += ar[i];
	    }

	    int res = -1;

	    while (l <= h) {
	        int m = (l + h) / 2;

	        if (isPossibleSol(ar, b, m)) {
	            res = m;
	            h = m - 1;
	        } else {
	            l = m + 1;
	        }
	    }
	    return res;
	}
	
	static int maxTime(int[]ar, int a, int b) {
		int l = 0, h = 0;
		
		for(int i=0; i <ar.length; i++) {
			h = h+ ar[i];
		}
		
		int res = -1;
		
		while( l <= h) {
			int m = (l+h)/2;
			
			if(isPossibleSol(ar,a,m) == true) {
				res = m;
				h = m-1;
			}else {
				l = m +1;
			}
		}
		return res*b;
	}
	
	static boolean isSorted(int[] ar) {
		
		for(int i=1; i<ar.length;i++) {
			if(ar[i] < ar[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	static void reverseArray(int[] ar) {
		int i = 0, j = ar.length-1;
		
		while(i < j) {
			int t = ar[i];
			ar[i] = ar[j];
			ar[j] = t;
			i++;
			j--;
		}
	}
	
	static int sqrt(int n) {
		if(n==1 || n==0) {
			return n;
		}
		int l =2,h=n/2;
		int res = 0;
		
		while(l<=h) {
			int m = (l+h)/2;
			
			if(m*m == n) {
				return m;
			}else if (m*m < n){
				l = m+1;
				res = m;
			}else {
				h = m-1;
			}
		}
		return res;
	}
}
