public class SizeofShirt {
    public static void main(String[]args){
        int num=38;
        String size;

        switch (num){
            case 32:
                size="Small";
                break;
            case 34:
                size="Medium";
                break;
            case 36:
                size="Large";
                break;
            case 38:
                size="Extra Large";
                break;
            case 40:
                size="Double Extra Large";

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        {
            System.out.println("Size " + size);
        }
    }
}
