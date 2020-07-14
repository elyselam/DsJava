package OopExamples.callCenter;

public class Call {
    //lowest ranking employee handle this call

    private Rank rank;
    private Caller caller;
    private Employee handler;
    public Call(Caller c) {
        rank = Rank.Responder;
        caller = c;
    }


}
