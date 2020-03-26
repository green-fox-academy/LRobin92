package comperable2;

public class Todo implements Comparable {
        private String name;
        private boolean completed;

        public Todo(String name) {
            this.name = name;
        }

        public void complete() {
            this.completed = true;
        }

        @Override
        public String toString() {
            return (completed ? "[x] " : "[ ] ") + name;
        }
        @Override
        public int compareTo(Object o) {
        return 0;
    }
}
