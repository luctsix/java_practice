import java.io.*;

public class RunEncap{
    public static void main(String []args){
        EncapsulationDemo encap = new EncapsulationDemo();
        encap.setName("qianqian");
        encap.setAddress("zhangzhou");
        encap.setAge(18);

        System.out.println("name: " + encap.getName() 
                         + "\naddr: " + encap.getAddress()
                         + "\nage : " + encap.getAge());
    }
}