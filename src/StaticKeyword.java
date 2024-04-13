public class StaticKeyword {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        StaticKeywordFriend friend1 = new StaticKeywordFriend("Spongebob");
        StaticKeywordFriend friend2 = new StaticKeywordFriend("Patrick");
        StaticKeywordFriend friend3 = new StaticKeywordFriend("Patrick");

        System.out.println(StaticKeywordFriend.numberOfFriends);
    }
}
