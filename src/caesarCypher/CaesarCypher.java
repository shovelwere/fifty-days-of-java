package caesarCypher;

public class CaesarCypher {
    Alphabet abc = new Alphabet();

    public String processMsg(String option, String msg, int shiftNumber) {
        StringBuilder processedMsg = new StringBuilder();
        int size = abc.getAlphabet().size();
        int direction = option.equalsIgnoreCase("encode") ? 1 : -1;
        for (char c : msg.toCharArray()) {
            int index = abc.getAlphabet().indexOf(c);
            if (index != -1) {
                int newIndex = (index + direction * shiftNumber + size) % size;
                processedMsg.append(abc.getAlphabet().get(newIndex));

            }else{
                processedMsg.append(c); //keep numbers and special characters in their original index
            }
        }
        return processedMsg.toString();

    }

}
