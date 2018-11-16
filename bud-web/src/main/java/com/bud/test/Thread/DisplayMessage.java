package com.bud.test.Thread;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-24
 */
public class DisplayMessage implements Runnable  {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}
