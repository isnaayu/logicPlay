public class SecondToTimeConverter {
    public static void main(String[] args) {
        int numbersInSecond = 3651;

        int hours = numbersInSecond / 3600;
        int minutes = (numbersInSecond % 3600) / 60;
        int seconds = numbersInSecond % 60;

        System.out.println(hours+" "+minutes+" "+seconds+"");
    }
}
