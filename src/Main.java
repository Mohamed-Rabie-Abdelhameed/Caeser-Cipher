
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String plainText;
        String ciphertext;
        int key;
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Plain Text: ");
        plainText = input.nextLine();
        System.out.println("Enter The Key: ");
        key = input.nextInt();
        ciphertext = encrypt(plainText, key);
        System.out.println("Encrypted Text: " + ciphertext);
        System.out.println("Decrypted Text: " + decrypt(ciphertext, key));
    }
    public static String encrypt(String plainText, int key){
        char[] charArray = plainText.toCharArray();
        StringBuilder cipherText = new StringBuilder();
        for(int item: charArray){
            cipherText.append(Character.toString(item + (key%26)));
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key){
        char[] charArray = cipherText.toCharArray();
        StringBuilder plainText = new StringBuilder();
        for(int item: charArray){
            plainText.append(Character.toString(item - key%26));
        }
        return plainText.toString();
    }
}