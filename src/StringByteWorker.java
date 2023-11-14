class StringByteWorker {

    public String process(byte[] bytes){
        // Створюємо рядок із масиву байт
        String result = new String(bytes);
        // Переводимо рядок в нижній регістр
        result = result.toLowerCase();

        return result;
    }
}
class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
