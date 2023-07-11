import java.util.*;

interface MessagingService
{
    public void sendMessage();
}
class SMSMessagingService implements MessagingService
{
    public void sendMessage()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Mobile No.");
        String ph_no=scan.next();
        String regex="[6-9][0-9]{9}";
        //String message="";
        boolean condition=ph_no.matches(regex);
        if(condition)
        {
            System.out.println("Type the message you need to send :");
            scan.nextLine();
            String message=scan.nextLine();
            System.out.println("The SMS "+message+" has been sent to "+ph_no);
        }
        else
        {
            System.out.println("Enter the valid Phone number");
        }


    }
}
class EmailMessagingService implements MessagingService
{
    public void sendMessage()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the receiver mail ID:");
        String mail=scan.next();
        String reg="^(.+)@(.+)$";
        //String mess="";
        boolean cond=mail.matches(reg);
        if(cond)
        {
            System.out.println("Type the message you need to send :");
            scan.nextLine();
            String mess=scan.nextLine();
            System.out.println("The mail with the message "+mess+" has been sent to "+mail);
        }
        else
        {
            System.out.println("Enter the valid Mail ID");
        }

    }
}
class WhatsAppMessagingService implements MessagingService
{
    public void sendMessage()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter WhatsApp No.");
        String cell_no=scan.next();
        String re="[6-9][0-9]{9}";
       // String m="";
        boolean con=cell_no.matches(re);
        if(con)
        {
            System.out.println("Type the message you need to send :");
            scan.nextLine();
            String m=scan.nextLine();
            System.out.println("The Message "+m+" has been sent to "+cell_no);
        }
        else
        {
            System.out.println("Enter the valid Phone number");
        }

    }
}
class Messenger
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        SMSMessagingService sms=new SMSMessagingService();
        EmailMessagingService email=new EmailMessagingService();
        WhatsAppMessagingService whatsapp=new WhatsAppMessagingService();
        while(true)
        {
            System.out.println("How do you want your message to be sent ?");
            System.out.println("1.SMS");
            System.out.println("2.Email");
            System.out.println("3.WhatsApp");
            System.out.println("4.Exit");
            int option=scan.nextInt();
            switch(option)
            {
                case 1:
                    sms.sendMessage();
                    break;

                case 2:
                    email.sendMessage();
                    break;

                case 3:
                    whatsapp.sendMessage();
                    break;

                case 4:
                    System.out.println("Process Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option ");
                    break;
            }
        }

    }
}
