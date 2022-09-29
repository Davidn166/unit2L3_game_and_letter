public class Letter
{
    private String fromName;
    public void writeLetter(String toName, String fromName)
    {
        greeting(toName);
        specialMessage();
        closing(fromName);
    }

    public void greeting(String toName)
    {
        System.out.println("Hello, " + toName);
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing(String fromName)
    {
        System.out.println("From," + fromName);
    }
}

