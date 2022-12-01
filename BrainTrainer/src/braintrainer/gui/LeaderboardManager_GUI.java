/**
 *Sotiris Tsoulos icsd13190
 * 
 */
package braintrainer.gui;

import braintrainer.extra.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class LeaderboardManager_GUI {

    private final JFrame frame;
    private final JTextArea textArea;
    private final JScrollPane scroll;

    public LeaderboardManager_GUI() {
        frame = new JFrame(" LEADERBOARD ");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textArea = new JTextArea(20, 20);
        scroll = new JScrollPane(textArea);
    }

    /**
     *
     * @param u Dexetai ena antikeimeno tipou User pou periexei to username kai tin diskolia tou xristi
     */
    public void addToLeaderboard(User u) {
        try {
            final Path path = Paths.get("leaderboard.txt");
            Files.write(path, Arrays.asList(u.getUsername() + " : " + u.getDiffLvl()), StandardCharsets.UTF_8,
                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        } catch (final IOException ioe) {
            Throwable cause = ioe.getCause();
            System.out.println(cause);
        }

    }

    /**
     * emfanizei to frame me ta statistika
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public void showLeaderboard() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        final File path = new File("leaderboard.txt");
        BufferedReader in = new BufferedReader(new FileReader(path)); //diavazei
        StringBuilder sb = new StringBuilder(); //apothikeuei ston string builder
        while (in.readLine() != null) {
            sb.append(in.readLine());
            sb.append("\n");
        }

        this.textArea.setText(sb.toString()); //thetei to string builder sto text field
        frame.add(this.scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}

