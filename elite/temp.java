private static int toMins(String time) {
        String hourMins[] = time.split(":");
        int hours = Integer.parseInt(hourMins[0]);
        int mins = Integer.parseInt(hourMins[1]);
        return hours * 60 + mins;
    }