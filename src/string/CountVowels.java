package string;

public class CountVowels {
    public static void main(String[] args) {

        String  str = "programmming";
        int vowel_count =0;
        int consonants_count =0;

        for(int i =0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel_count++;
            }else{
                consonants_count++;
            }

        }
        System.out.println("Vowels =" + vowel_count);
        System.out.println("Vowels =" + consonants_count);

    }
}
