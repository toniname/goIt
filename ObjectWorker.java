class ObjectWorker {
    public String join(Object[] objects) {
        String result = "";
        StringBuilder result1 = new StringBuilder();

        for(int i = 0; i < objects.length; i++) {
            result1.append(objects[i]);

            if (i != objects.length - 1) {
                result1.append(" ");
            }

            result = String.valueOf(result1);
        }

        return result;
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
