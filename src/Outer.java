public class Outer {
    private int out;

    public Outer(int out) {
        this.out = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }


    public class Inner {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public void update() {
            in++;
            out++;
        }

        public void display() {
            System.out.println("in = " + in);
            Outer.this.display();
        }

        public void displayIn() {
            System.out.println("in = " + in + " out = " + out);
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }
    }
}
