public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int v = status.getVelocity();
        int a = status.getAltitude();
        int burn = 0;
        //int burn = (v*v)/(2*a);
//        if(a>1000 && v>100){
//            burn = 150;
//            return burn;
//        }
      //  burn = (v*v)/(2*a);
        if (a <= 100){
            if (a == 1)
                burn = 100+v-1;
            else
                burn=100+(v-a)+1;
        } else if (a<=5500 && v > 100){
            burn=200;
        }else
            burn = 100;
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
