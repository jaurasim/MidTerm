/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    public void statusDetail(UserStatus status) {
        switch (status) {
            case REJECTED:
                System.out.println("User status: REJECTED");
                break;
            case PENDING:
                System.out.println("User status: PENDING");
                break;
            case PROCESSING:
                System.out.println("User status: PROCESSING");
                break;
            case APPROVED:
                System.out.println("User status: APPROVED");
                break;
            default:
                System.out.println("User status: NOT VALID CODE");
                break;
        }
    }
}