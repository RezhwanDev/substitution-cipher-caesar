/**
 * @author Rezhwan Sidiq
 * 21/Nov/2017
 * 20:18
 */

    public class Caesar {
    
        // Our Car  Arrays
    char alpha[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
       // Encryption Method
    public void enc(String s,int key){

      String  ss=s.toUpperCase();
      char [] message =ss.toCharArray();
      char [] result =new char[message.length];
      int count ;

      for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (message[i] == alpha[j]) {
                    count=(j+key)%26;
                    result[i]=alpha[count];
                }
            }
        }
        String Sresult = new String (result);
        System.out.println("Final Result of encryption = "+Sresult);
    }

       //Decryption Method
    public void dec(String s,int key){

    String  ss=s.toUpperCase();
    char [] message =ss.toCharArray();
    char [] result =new char[message.length];
    int count ;

    for (int i = 0; i < message.length; i++) {
        for (int j = 0; j < alpha.length; j++) {
            if (message[i] == alpha[j]) {
                    count=j-key;
                    if (count < 0) {
                    count=count+26;
                     result[i]=alpha[count];
                } else result[i]=alpha[count];
            }
        }
    }
        String Sresult = new String (result);
        System.out.println("Final Result of Decryption = "+Sresult);
    }

        //Our Main Method
    public static void main(String[] args) {
        Caesar cob = new Caesar();
        cob.enc("Rezhwan",5);
        cob.dec("WJEMBFS",5);
    }
}
/*  OutPut
Final Result of encryption = WJEMBFS
Final Result of Decryption = REZHWAN
*/
