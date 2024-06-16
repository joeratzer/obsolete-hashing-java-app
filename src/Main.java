package src;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, this is going to print out an MD5 hash");

        var obsoleteHasher = new ObsoleteHasher();
        System.out.println("MD5 hash: " + obsoleteHasher.GetMd5Hash("The cat sat on the mat"));
    }
}