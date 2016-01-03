package findletters;

public class FindLetters {

    public static void main(String[] args) {
        String str1 = "moskal";
        String str2 = "hohol";
        char[] char_array1 = str1.toCharArray();
        char[] char_array2 = str2.toCharArray();
        boolean present;
        for (int i=0; i<char_array1.length; i++){
            present = false;
            for (int j=0; j<char_array2.length; j++){
                if (char_array1[i]==char_array2[j]) present=true;
            }
            if (!present){
                System.out.println("Letter "+char_array1[i]+" is absent in second word");
            }
        }
    }
}