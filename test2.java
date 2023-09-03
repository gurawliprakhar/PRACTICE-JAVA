static int linearSearch(int[] a, int key) {
    for(int i=0; i<a.length;i++) {
        if(a[i] == key) {
            return i;
        }
    }
    return-1;
}

public static int binarySearch(int[] ar, int key) {
    int low = 0;
    int high = ar.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (ar[mid] == key) {
            return mid; 
        } else if (ar[mid] < key) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }

    return -1; 
}

static int  spanOfArray(int[] a) {
    int max = a[0];
    int min = a[0];
    
    for(int i = 0; i < a.length;i++) {
        if(a[i] > max) {
            max = a[i];
        }if(a[i] < min) {
            min = a[i];
        }
    }
    return max-min;
}

static int countWords(String s) {
    int count = 0;
    for(int i =0; i< s.length();i++) {
        if(s.charAt(i) == ' ' && s.charAt(i+1)!= ' ' ) {
            count ++;
        }
    }
    return count+1;
}

static String reverse(String s) {
    String t = "";
    
    for(int i=s.length()-1; i>=0;i--) {
        t = t+s.charAt(i);
    }
    return t;
}

static int ascBinarySearch(int[]a, int key) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == key) {
            return mid; 
        } else if (a[mid] < key) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }

    return -1; 
}

static int dscBinarySearch(int[]a, int key) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == key) {
            return mid; 
        } else if (a[mid] < key) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }

    return -1; 
}

static int bitonicPont(int[]a) {
    int l =0, r=a.length-1,mid=0;
    while(l<=r) {
        mid = (l+r)/2;
        if(a[mid]>a[mid-1]&& a[mid]>a[mid+1]) {
            return mid;
        }else if (a[mid]>a[mid-1] && a[mid]<a[mid+1]){
            l = mid;
        }else {
            r=mid;
        }
    }
    return -1;
}

static int searchBitonic(int[]a, int key,int bIndex) {
    if(key == a[bIndex]) {
         return bIndex;
     } if(key> a[bIndex]) {
         return-1;
     }
     int res1 = ascBinarySearch(a,key,bIndex-1);
     if(res1 != -1) {
         return res1;
         }
     int res2 = dscBinarySearch(a,key,bIndex+1);
     if(res2 != -1) {
         return res2;
         }
     return-1;
     }

