   String  str="prograaming is a fun and fun is prograaming";
           String[] words = str.split(" ");
           HashMap<String,Integer> map = new HashMap<>();
           for (String i : words) {
               map.put(i, map.getOrDefault(i, 0)+1);
           }
         