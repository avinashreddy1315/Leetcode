class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        int[] indices = findContain(words, x);

        // Convert int[] to List<Integer>
        List<Integer> result = new ArrayList<>();
        for (int index : indices) {
            result.add(index);
        }

        return result;
        
    }


    public int[] findContain(String[] words, char x){
        int count = 0;

        for(String word : words){
            if(word.contains(Character.toString(x))){
                count++;
            }
        }



        int[] result = new int[count];

        int idx = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(Character.toString(x))){
                result[idx] = i;
                idx++;
            }
        }



        return result;
    }
}