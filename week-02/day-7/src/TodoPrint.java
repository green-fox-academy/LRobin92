public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        StringBuilder builder = new StringBuilder(todoText);
        todoText = builder.insert(builder.indexOf(" - B"), "My todo:\n").toString();
        todoText = builder.append(" - Download games\n").toString();
        todoText = builder.append("  - Diablo").toString();

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
