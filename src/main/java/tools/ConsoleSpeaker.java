package tools;

public class ConsoleSpeaker {

    public void printTryAgain(final int attemptNumber) {
        System.out.println(prepareMessageTryAgain(attemptNumber));
    }

    private String prepareMessageTryAgain(final int attemptNumber) {
        return "Try again. You have only " + attemptNumber + (attemptNumber == 1 ? " attempt" : " attempts");
    }
}
