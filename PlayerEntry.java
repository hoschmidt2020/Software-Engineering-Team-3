
// Graphical libraries
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

// Event handling libraries
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayerEntry {
    // Constants
    private final int maxEntries = 17;
    private final Font myFont = new Font("Serif", Font.BOLD, 24);

    // Initialize empty arrays
    private JCheckBox[] redChecks = new JCheckBox[maxEntries];
    private JCheckBox[] blueChecks = new JCheckBox[maxEntries];
    private JTextField[] redTexts1 = new JTextField[maxEntries];
    private JTextField[] blueTexts1 = new JTextField[maxEntries];
    private JTextField[] redTexts2 = new JTextField[maxEntries];
    private JTextField[] blueTexts2 = new JTextField[maxEntries];

    /**
     * Creates player entry screen
     */
    PlayerEntry(JFrame jFrame) {
        // Create title panel and add it to the top of the window
        JPanel titlePanel = makeTitlePanel();
        jFrame.add(titlePanel, "North");

        // Create team panels and add them in the center of the window
        JPanel teamsPanel = new JPanel(new GridLayout(0, 2));
        JPanel teamPanelRed = teamPanel(Color.red, "Red Team", redChecks, redTexts1, redTexts2);
        JPanel teamPanelBlue = teamPanel(Color.blue, "Blue Team", blueChecks, blueTexts1, blueTexts2);
        teamsPanel.add(teamPanelRed);
        teamsPanel.add(teamPanelBlue);
        jFrame.add(teamsPanel, "Center");

        // Add function title
        JPanel modesPanel = new JPanel(new GridLayout(2, 1));
        JPanel modePanel = makeModePanel();
        JPanel functionPanel = makeFunctionPanel();
        modesPanel.add(modePanel);
        modesPanel.add(functionPanel);
        jFrame.add(modesPanel, "South");

        // Set size
        jFrame.setTitle("Entry Terminal");

    }

    /**
     * Creates title panel
     * 
     * @return titlePanel
     */
    public JPanel makeTitlePanel() {

        JPanel titlePanel = new JPanel();

        // Create title label and add it to the title panel
        JLabel titleLabel = new JLabel("Edit Current Game");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(myFont);
        titlePanel.add(titleLabel);

        return titlePanel;
    }

    /**
     * Creates mode panel
     * 
     * @return modePanel
     */
    public JPanel makeModePanel() {

        JPanel modePanel = new JPanel();

        // Create mode label and add it to the mode panel
        JLabel modeLabel = new JLabel("Game mode: Standard public mode");
        modeLabel.setForeground(Color.white);
        modeLabel.setOpaque(true);
        modeLabel.setBackground(Color.magenta);
        modeLabel.setFont(myFont);
        modePanel.add(modeLabel);

        return modePanel;
    }

    /**
     * Creates team panel, entry panel, and button panel
     * 
     * @param bgColor    background color
     * @param team       team name
     * @param checkboxes user input array
     * @param texts1     player id numbers
     * @param texts2     player names
     * @return teamPanel
     */
    public JPanel teamPanel(Color bgColor, String team, JCheckBox[] checkboxes, JTextField[] texts1, JTextField[] texts2) {

        JPanel teamPanel = new JPanel();

        // Create an entry panel with
        JPanel entryPanel = new JPanel(new GridLayout(maxEntries + 2, 1));
        entryPanel.setPreferredSize(new Dimension(300, 500));

        // Create team button and button panel, and then add them sequentially
        JButton teamButton = new JButton(team);
        JPanel buttonPanel = new JPanel();

        teamButton.addActionListener(new TeamButtonEventHandler());
        teamButton.setBackground(bgColor);
        teamButton.setForeground(Color.white);

        buttonPanel.add(teamButton);
        entryPanel.add(buttonPanel);

        // For the max number of entries, add a blank input row to the entry panel
        for (int i = 0; i < maxEntries; i++) {
            JPanel itemPanel = new JPanel();

            JCheckBox checkbox = new JCheckBox();
            checkboxes[i] = checkbox;
            itemPanel.add(checkbox);

            JLabel itemLabel = new JLabel(String.format("%2s", i));
            itemPanel.add(itemLabel);

            JTextField textField1 = new JTextField(10);
            texts1[i] = textField1;
            itemPanel.add(textField1);

            JTextField textField2 = new JTextField(10);
            texts2[i] = textField2;
            itemPanel.add(textField2);

            entryPanel.add(itemPanel);
        }

        // Add entry panel to team panel
        teamPanel.add(entryPanel);

        return teamPanel;
    }

    // TODO We might have to move these event handlers to the controller class when moving to the repo
    // Team button handler
    public class TeamButtonEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() instanceof JButton) {
                String command = event.getActionCommand();

            }
        }
    }

    // mode button handler
    public class ModeButtonEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() instanceof JButton) {
                String command = event.getActionCommand();

            }
        }
    }

    public JPanel makeFunctionPanel() {
        JPanel functionPanel = new JPanel();

        // F1
        JButton editGameBtn = new JButton("<html><center>F1<br/>Edit<br/>Game<br/><center></html>");
        editGameBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(editGameBtn);

        // F2
        JButton gameParametersBtn = new JButton("<html><center>F2<br/>Edit<br/>Game<br/><center></html>");
        gameParametersBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(gameParametersBtn);

        // F3
        JButton startGameBtn = new JButton("<html><center>F3<br/>Edit<br/>Game<br/><center></html>");
        startGameBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(startGameBtn);

        // F5
        JButton preEnteredGamesBtn = new JButton("<html><center>F5<br/>Edit<br/>Game<br/><center></html>");
        preEnteredGamesBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(preEnteredGamesBtn);

        // F7
        JButton f7GameBtn = new JButton("<html><center>F7<br/>Edit<br/>Game<center></html>");
        f7GameBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(f7GameBtn);

        // F8
        JButton viewGameBtn = new JButton("<html><center>F8<br/>Edit<br/>Game<br/><center></html>");
        viewGameBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(viewGameBtn);

        // F10
        JButton flickSyncBtn = new JButton("<html><center>F10<br/>Edit<br/>Game<br/><center></html>");
        flickSyncBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(flickSyncBtn);

        // F12
        JButton clearGameBtn = new JButton("<html><center>F12<br/>Edit<br/>Game<br/><center></html>");
        clearGameBtn.addActionListener(new ModeButtonEventHandler());
        functionPanel.add(clearGameBtn);

        return functionPanel;
    }
}