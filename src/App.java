public class App {
    public static void main(String[] args) throws Exception
    {
        int age = 36;
        if(age > 0 && age <= 17)
        {
            System.out.println( age + ". You are under age.");
        }
        else if(age >=18 && age <=60 )
        {
            System.out.println("Your age is " + age +". You are young and fine.");
        }
        else
        {
            System.out.println("Your age is " + age + ". You have to retire and take a rest.");
        }
    }
}
