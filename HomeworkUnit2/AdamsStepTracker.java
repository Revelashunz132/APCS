    //John Aston Adams
    //12/4/22

    //package HomeworkUnit2;

    public class StepTracker {
        private int min_num_steps, steps_today, total_steps, days_tracked, active_days;{
        total_steps = 0;
        days_tracked = 0;
        active_days = 0;}

        public StepTracker(int m) {
            min_num_steps = m;
        }

        public void activeDays(){
            System.out.println(active_days);
        }

        public void averageSteps(){
            if (days_tracked == 0){
                System.out.println(0.0);
            }
            else{
                System.out.println((double) total_steps / days_tracked);
            }
        }

        public void addDailySteps(int s){
            steps_today = s;
            total_steps += steps_today;
            days_tracked += 1;
            if (steps_today >= min_num_steps){
                active_days += 1;
            }
        }
        
        public static void main(String[] args) {
            StepTracker tr = new StepTracker(10000);
            tr.activeDays();
            tr.averageSteps();
            tr.addDailySteps(9000);
            tr.addDailySteps(5000);
            tr.activeDays();
            tr.averageSteps(); 
            tr.addDailySteps(13000);
            tr.activeDays();
            tr.averageSteps();
            tr.addDailySteps(23000);
            tr.addDailySteps(1111);
            tr.activeDays();
            tr.averageSteps();
        }

    }
