package OopExamples.callCenter;

import java.util.List;

public class CallHandler {
    //3 levels of employees
    private final int LEVELS = 3;

    //number of emp in each levels
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;

//    employeeLevels[0] = respondents;
//    employeeLevels[1] = managers;
//    employeeLevels[2] = directors;

    List<List<Call>> callQueues;

    public CallHandler(){
    }

    //get the first emp who can handle this call
    public Employee getHandlerForCall(Call call) {
        Call call = new Call(caller);
        dispatchCall(call);
    }





}
