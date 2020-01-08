import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * author:yangyuanliang Date:2020-01-08 Time:11:27
 **/
public class Demo {
    public static Queue<String> queue=new LinkedList<>();

    public static void main(String[] args) {

        while (true){
            System.out.println("---菜单---");
            System.out.println("1.排队");
            System.out.println("2.就诊");
            System.out.println("3.查看排队");
            System.out.println("4.下班");
            System.out.println("请输入您的选择：");
            Scanner scanner=new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    inQueue();
                    break;
                case 2:
                    outQueue();
                    break;
                case 3:
                    lookQueue();
                    break;
                case 4:
                    System.out.println("下班");
                    System.exit(-1);
            }

        }
        
    }

    private static void lookQueue() {
        if(queue.size()>0){
            queue.forEach(q-> System.out.println("队列病人病例号:"+q));
        }else{
            System.out.println("没有病人");
        }
    }

    private static void outQueue() {
        String peek = queue.poll();
        System.out.println("病例号"+peek+"请去就诊");
    }

    private static void inQueue() {
        System.out.println("请输入病例号");
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        queue.add(next);
        System.out.println(next+"排队成功");

    }
}
