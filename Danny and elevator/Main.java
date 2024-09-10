import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_elevators = sc.nextInt();
        Elevator[] elevators = new Elevator[no_of_elevators];
        for (int i = 0; i < no_of_elevators; i++) {
            elevators[i] = new Elevator(0);
        }
        int no_of_floors = sc.nextInt();
        Floor[] floors = new Floor[no_of_floors];
        for (int i = 0; i < no_of_floors; i++) {
            floors[i] = new Floor(i, 0);
        }
        // intializing the floors and elevators with conditions
        // 1) Elevator 1, 2 and 3 serve upto 12 th floor
        // 2)Elevator 4,5 and 6 server GF,M,F1 and all even floors
        // 3)Elevator 7,8,9 server GF,M,F1 and all odd floors
        // Conditions
        // max floor should be given
        // constraints for each elevator time ku ena
        for (int i = 0; i < elevators.length; i++) {
            System.out.println("The conditions for the elevator " + i);
            System.out.println("Please Enter the max_floor it can reach");
            elevators[i].conditions(sc.nextInt());
            System.out.println("Please Enter the no of floors the elevator can serve");
            int no_of_floor = sc.nextInt();
            System.out.println("Please Enter the floors it can server:");
            ArrayList<Floor> input_floors = new ArrayList<>();
            for (int floor = 0; floor < no_of_floor; floor++) {
                input_floors.add(floors[sc.nextInt()]);
            }
            elevators[i].floors_it_serves.addAll(input_floors);
        }
        //
        System.out.print("The Following commands are avaliable:");
        System.out.println("1.Find the positions of elevator");
        System.out.println("2.UP");
        System.out.println("3.DOWN");

        //
        //
        //
        boolean flag = true;
        while (flag) {
            String command = "in";
            System.out.println("Enter the curr_floor u r in:");
            int cur_floor = sc.nextInt();
            Floor curr_floor = null;
            for (int i = 0; i < floors.length; i++) {
                if (floors[i].floor_no == cur_floor) {
                    curr_floor = floors[i];
                }
            }
            // testing
            // for (int i = 0; i < no_of_elevators; i++) {
            // int size = elevators[i].floors_it_serves.size();
            // for (int j = 0; j < size; j++) {
            // System.out.println(elevators[i].floors_it_serves.get(j).floor_no);
            // }
            // }
            while (command != "exit" || command != "EXIT" || command != "Exit") {
                System.out.println("Enter the actions:");
                command = sc.nextLine();
                if (command.equals("show")) {
                    System.out.println("in");
                    for (int i = 0; i < no_of_elevators; i++) {
                        for (int j = 0; j < elevators[i].floors_it_serves.size(); j++) {
                            System.out.println(
                                    "Elevators " + i + " " + "floors it serves "
                                            + elevators[i].floors_it_serves.get(j).floor_no + " "
                                            + "current floor " + elevators[i].curr_floor);
                        }
                    }
                } else if (command.equals("UP")) {
                    Elevator elevator_to_be_used = find_elevator(elevators, curr_floor,
                            no_of_elevators);
                    System.out.println("elevator from " + elevator_to_be_used.curr_floor + " " + "is coming for ya!");
                } else if (command.equals("DOWN")) {
                    Elevator elevator_to_be_used = find_elevator(elevators, curr_floor,
                            no_of_elevators);
                    System.out.println("elevator from " + elevator_to_be_used.curr_floor + " " + "is coming for ya!");
                }
                // here time works in 30 seconds for each operation
                // so after every operation we reduce the timetoreach of an elevator by 30
                // since we consider that all operating elevators reach their destination by 30
                // seconds
                for (int i = 0; i < elevators.length; i++) {
                    if (elevators[i].time_to_reach != 0)
                        elevators[i].time_to_reach -= 30;
                }
                System.out.println("Do you wish to continue? : if Yes say in else say exit");
                command = sc.nextLine();
            }
            System.out.println("Do you wish to continue? : if Yes say true else say false");
            flag = sc.nextBoolean();
        }
    }

    static Elevator find_elevator(Elevator[] elevators, Floor curr_floor, int no_of_elevators) {
        Elevator res = null;
        for (int i = 0; i < no_of_elevators; i++) {
            if (elevators[i].curr_floor == curr_floor.floor_no) {
                res = elevators[i];
            }
        }

        int mindist = Integer.MAX_VALUE;
        if (res == null) {
            for (int i = 0; i < no_of_elevators; i++) {
                if (mindist > Math.abs(elevators[i].curr_floor - curr_floor.floor_no)
                        && elevators[i].floors_it_serves.contains(curr_floor)
                        && elevators[i].currently_in_use == false) {
                    mindist = Math.abs(elevators[i].curr_floor - curr_floor.floor_no);
                    res = elevators[i];
                }
            }
        }
        if (res == null) {
            int mintime = Integer.MAX_VALUE;
            for (int i = 0; i < elevators.length; i++) {
                if (mindist > Math.abs(elevators[i].curr_floor - curr_floor.floor_no)
                        && elevators[i].floors_it_serves.contains(curr_floor)
                        && mintime > elevators[i].time_to_reach) {
                    mindist = Math.abs(elevators[i].curr_floor - curr_floor.floor_no);
                    mintime = elevators[i].time_to_reach;
                    res = elevators[i];
                }
            }
        }
        for (int i = 0; i < elevators.length; i++) {
            if (elevators[i] == res) {
                elevators[i].curr_floor = curr_floor.floor_no;
                elevators[i].currently_in_use = true;
                // time to reach is in seconds
                elevators[i].time_to_reach += 30;
            }
        }
        return res;
    }
}
