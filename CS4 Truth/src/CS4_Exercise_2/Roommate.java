package CS4_Exercise_2;

public class Roommate{
        private String fullName;
        private int messagesCount;
        private boolean hasJowa;
        
        //getter and setter methods
        public String getFullName() {
                return fullName;
        }
        public void setFullName(String fullName) {
                this.fullName = fullName;
        }
        public int getMessagesCount() {
                return messagesCount;
        }
        public void setMessagesCount(int messagesCount) {
                this.messagesCount = messagesCount;
        }
        public boolean getHasJowa() {
                return hasJowa;
        }
        public void setHasJowa(boolean hasJowa) {
                this.hasJowa = hasJowa;
        }

        //constructor method
        public Roommate(String fullName, int messagesCount, boolean hasJowa){
        this.fullName = fullName;
        this.messagesCount = messagesCount;
        this.hasJowa = hasJowa;
        }
}
