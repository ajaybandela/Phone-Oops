public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
    if(isPowerOn==true){
        System.out.println("You are the dailing no: "+phoneNo);
    }else{
        System.out.println("Your LandLine is off");
    }
    return;
    }

    @Override
    public void recieveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Hey, "+myPhoneNo+" You are recieving a Call");
        }else{
            System.out.println("call not Recievied");
        }
        return;

    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call Answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
//       if(isRinging==true)
//           return true;
//       else
//           return false;
        return isRinging;
    }
}
