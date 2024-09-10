import java.util.ArrayList;

// There are 9 elevators (E1, E2, E3, E4, E5, E6, E7, E8, E9) and 14 Floors in
// the ZOHO
// Signature Tower building (GF, M, F1 ,F2, F3...., F12).
// ● All the elevators are initially available in ground floor( GF).
// ● It takes 30 seconds for the elevator to move one floor up/down.
// ● Elevators E1 , E2 and E3 serve / stop at all the floors starting from GF
// till F12.
// ● Elevators E4, E5 and E6 serve / stop only at GF, M, F1 and all the other
// even
// number floors (F2, F4, F6, F8, F10, F12)
// ● Elevators E7, E8 and E9 serve / stop only at GF, M, F1 and all the other
// odd
// number floors (F3, F5, F7, F9, F11)
// ● The elevator can be availed by pressing the UP / DOWN buttons stationed on
// all
// the floors.
// ● If any employee presses the elevator button from X floor along with the
// destination floor, then anyone of available elevator in the floor should be
// opened
// and allotted for that user.
// ● If there are no elevators available on that floor, then the nearest
// possible elevator
// should be allotted and the time taken to reach that floor should be printed
// along
// with the elevator name.
// ● Once the elevator is allotted to the user, the elevator should not be
// allotted for the
// next user until the elevator has reached the destination. Once the elevator
// is
// allotted, it doesn't stop in any other floor but the destination floor.
// ● In case all the elevators are busy, the user should be allotted the
// elevator which
// will take the shortest time to reach him after the current drop.
// 03:03 PM
// Design the elevator allocation application using Java with all the above
// conditions
// satisfied. Object oriented solution will be given higher preference. Handle
// all the errors /
// warnings properly in your application. Your application should work for any
// number of
// elevators and Floors with other conditions. All the elevators current floor
// location and
// history should be maintained until your application is terminated.
// 1. Print individual elevator's current position and its movement history.
// 2. Display option for all the elevators current position as table.
// 3. Any additional options you would like to include which will be useful for
// the end user

class Elevator {
    int curr_floor;
    boolean currently_in_use;
    int time_to_reach;

    Elevator(int curr_floor) {
        this.curr_floor = curr_floor;
        this.currently_in_use = false;
        this.time_to_reach = 0;
    }

    int max_floor;
    ArrayList<Floor> floors_it_serves;

    void conditions(int max_floor) {
        this.max_floor = max_floor;
        floors_it_serves = new ArrayList<>();
    }
}

class Floor {
    int floor_no;
    int no_of_elevators;
    ArrayList<Elevator> elevators_in_this_floor;

    Floor(int floor_no) {
        this.floor_no = floor_no;
    }

    Floor(int floor_no, int no_of_elevators) {
        this.floor_no = floor_no;
        this.no_of_elevators = no_of_elevators;
        this.elevators_in_this_floor = new ArrayList<>();
    }
}