package javaassignments.assignment3;
import java.io.IOException;
import java.net.InetAddress;
import java.util.*;

public class JavaAssignment3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        while(true) {
            System.out.print("Enter the ip address: ");
            String address = sc.next();
            if (address.equalsIgnoreCase("exit")) {
                break;
            } else {
                pingRequest(address,list);
            }
        }
        Collections.sort(list);
        int n = list.size();
        if(n%2==0){
            System.out.println("Median : "+list.get(n/2));
        }else{
            System.out.println("Median : "+(list.get(n/2)+list.get(n/2-1))/2);
        }
    }
    public static void pingRequest(String address, ArrayList<Long> list) throws IOException {
        InetAddress inetAddress = InetAddress.getByName(address);

        long startTime = System.nanoTime();
        if(inetAddress.isReachable(5000)){
            long endTime = System.nanoTime();
            list.add(endTime-startTime);
        } else {
            System.out.println("Host is not reachable!!");
        }
    }
}
