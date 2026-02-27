class TimeConversion{

    public static String timeConversion(String s) {
       int hour= Integer.parseInt(s.substring(0,2));
       String period= s.substring(8,10);
       if(period.equals("AM")){
        if(hour==12){
            hour=0;
        }
       }else{
        if(hour !=12){
            hour+=12;
        }
       }
       String newHour = String.format("%02d",hour);
       return newHour + s.substring(2,8);
    }

}