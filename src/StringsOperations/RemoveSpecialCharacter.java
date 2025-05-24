package StringsOperations;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str="@s!t$ramol";
        String replacedString=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(replacedString);
        String str2="A m o l j a d h a v";
        String spaceRemovedString=str2.replaceAll(" ","");
        System.out.println(spaceRemovedString);

    }
}
