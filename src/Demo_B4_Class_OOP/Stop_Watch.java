package Demo_B4_Class_OOP;

import javafx.scene.paint.Stop;

public class Stop_Watch {
    long startTime, endTime, elapsedTime;

    public Stop_Watch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long getStart(){
       return startTime = System.currentTimeMillis();
    }
    public long getEnd(){
       return endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return elapsedTime = endTime - startTime;
    }

//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }

    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i]=(int)(Math.random()*1000);
        }
        long t1 = System.currentTimeMillis();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int tempt = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tempt;
                }
            }
        }
        long t2 = System.currentTimeMillis();
        Stop_Watch watch = new Stop_Watch(t1, t2);
        System.out.println("Thời gian thực hiện dòng lệnh là: " + watch.getElapsedTime() + " hmls");
    }



}
