Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	
    for(int i=0; i<s.length();i++) {
    	char ch = s.charAt(i);
    	if(map.containsKey(ch)) {
    	   int c = map.get(ch);
    	   map.put(ch,c+1);
    	  }else {
    		  map.put(ch,1);
    	  }
    	}
    //System.out.println(map);
    
    Set<Character> keySet = map.keySet();
         for(char ch :keySet) {
    	 System.out.println(ch +":" + map.get(ch));
       }
       
	
	  int[] ar = new int[n];
	
	  for(int i=0; i<ar.length;i++) {
		  ar[i] = scan.nextInt();
	  }
	  
	  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i=0; i<ar.length;i++) {
    	if(map.containsKey(ar[i])) {
    		map.put(ar[i], map.get(ar[i]) + 1);
    	}else {
    		map.put(ar[i],1);
    	}
     }
     Collection<Integer> values = map.values();
     
     for(int value : values) {
    	 System.out.println(value/2);
     }
     
    }

}




