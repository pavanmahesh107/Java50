package JavaInterview;

import java.nio.charset.StandardCharsets;

public class bytetostring {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108,111};  // Given

        String string = new String(bytes);  // Using default platform encoding not recommended.
        System.out.println(string);

        String str = new String(bytes, StandardCharsets.UTF_8); // Using a specific encoding.
        System.out.println(str);
    }


}
