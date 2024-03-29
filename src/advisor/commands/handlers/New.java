package advisor.commands.handlers;

import advisor.commands.Command;

public class New extends Command {

    public New() {
        this.setBefore("---NEW RELEASES---");
        this.setRegex("new");
        this.setAuth(true);
    }

    @Override
    public void run() throws Exception {
        super.run();

        System.out.println("""
                Mountains [Sia, Diplo, Labrinth]
                Runaway [Lil Peep]
                The Greatest Show [Panic! At The Disco]
                All Out Life [Slipknot]""");
    }
}
