package Module5;

public class Main {
    public static void main(String[] args){
        String cool = Encrypt.encrypt("hello guys the quick brown fox jumps over the lazy dog", 4);
        System.out.println(cool);
        String great = Decrypt.decrypt("lipps kycw xli uymgo fvsar jsb nyqtw sziv xli pedc hsk", 4);
        System.out.println(great);
    }
}