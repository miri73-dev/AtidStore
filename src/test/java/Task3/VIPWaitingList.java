package Task3;

public class VIPWaitingList extends WaitingList {
    @Override
    public void addUser(String user) {
        if (user.startsWith("VIP_")) {
            users.add(0, user);
        } else {
            super.addUser(user);
        }
    }

    @Override
    public void processNextUser() {
        if (!users.isEmpty()) {
            String user = users.remove(0);
            if (user.startsWith("VIP_")) {
                System.out.println("Processing VIP user: " + user);
            } else {
                System.out.println("Processing regular user: " + user);
            }
        } else {
            System.out.println("No users in the waiting list.");
        }
    }
}
