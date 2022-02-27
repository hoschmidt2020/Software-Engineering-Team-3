// PlayerEntry.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Player Entry
 *
 */
public class PlayerEntry extends JFrame{
	
	// constants
	private static final long serialVersionUID = 1L;
	private final int NUM_ENTRYS = 17;
    private final Font myFont = new Font("Serif", Font.BOLD, 24);
    
    // storage
    private JCheckBox[] redChecks = new JCheckBox[NUM_ENTRYS];
    private JCheckBox[] blueChecks = new JCheckBox[NUM_ENTRYS];
    private JTextField[] redTexts1 = new JTextField[NUM_ENTRYS];
    private JTextField[] blueTexts1 = new JTextField[NUM_ENTRYS];
    private JTextField[] redTexts2 = new JTextField[NUM_ENTRYS];
    private JTextField[] blueTexts2 = new JTextField[NUM_ENTRYS];
	
    // construct app
	PlayerEntry()
	{
		// make title panel
		JPanel titlePanel = makeTitlePanel();
		add(titlePanel,"North");
		
		
		// add team panels
		JPanel teamsPanel = new JPanel(new GridLayout(0,2));
		JPanel teamPanelRed =  teamPanel(Color.red,"Red Teaam",redChecks,redTexts1,redTexts2); 
		JPanel teamPanelBlue =  teamPanel(Color.blue,"Blue Teaam",blueChecks,blueTexts1,blueTexts2); 
		teamsPanel.add(teamPanelRed);
		teamsPanel.add(teamPanelBlue);
		add(teamsPanel,"Center");
		
		//add function title
		JPanel modesPanel = new JPanel(new GridLayout(2,1));
		JPanel modePanel = makeModePanel();
		JPanel functionPanel = makeFunctionPanel();
		modesPanel.add(modePanel);
		modesPanel.add(functionPanel);
		add(modesPanel,"South");
		
				
		// set size
		setTitle("Entry Terminal");
		setSize(700,700);
		setVisible(true);
	}
	
	// make title panel
	public JPanel makeTitlePanel()
	{
		
		// make title
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Edit Current Game");
		titleLabel.setForeground(Color.blue);
		titleLabel.setFont(myFont);
		titlePanel.add(titleLabel);
		return titlePanel;
		
	}
	
	// make mode panel
	public JPanel makeModePanel()
		{
			
			// make mode
			JPanel modePanel = new JPanel();
			JLabel modeLabel = new JLabel("Game mode: Standard public mode");
			modeLabel.setForeground(Color.white);
			modeLabel.setOpaque(true);
			modeLabel.setBackground(Color.magenta);
			modeLabel.setFont(myFont);
			modePanel.add(modeLabel);
			return modePanel;
					
		}
	
	
	// make team panel
	public JPanel teamPanel(Color color,String team,JCheckBox[] checks,JTextField[] texts1,JTextField[] texts2)
	{
		// make team
		JPanel teamPanel = new JPanel();

		// make check box and text box
		JPanel entryPanel = new JPanel(new GridLayout(NUM_ENTRYS+2,1));
		entryPanel.setPreferredSize(new Dimension(300,500));		
		// make team button
		JButton teamButton = new JButton(team);
		teamButton.addActionListener(new TeamButtonEventHandler());
		teamButton.setBackground(color);
		teamButton.setForeground(Color.white);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(teamButton);
		entryPanel.add(buttonPanel);
		
		// for each item
		for(int i=0;i<NUM_ENTRYS;i++)
		{
			JPanel itemPanel = new JPanel();
			JCheckBox chkbox = new JCheckBox();
			checks[i] = chkbox;
			itemPanel.add(chkbox);
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
				
	    // add entry panel to team panel
		teamPanel.add(entryPanel);
		
		return teamPanel;
	}
	
	//team button handler
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
	
	
	// function button panel 
	public JPanel makeFunctionPanel()
	{
		JPanel functionPanel = new JPanel();
		
		// f1
		JButton editGameBtn = new JButton("<html><center>F1<br/>Edit<br/>Game<br/><center></html>");
		editGameBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(editGameBtn);
		
		// f2
		JButton gameParamatersBtn = new JButton("<html><center>F2<br/>Edit<br/>Game<br/><center></html>");
		gameParamatersBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(gameParamatersBtn);
				
		// f3
		JButton startGameBtn = new JButton("<html><center>F3<br/>Edit<br/>Game<br/><center></html>");
		startGameBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(startGameBtn);
		
		// f5
		JButton preEnteredGamesBtn = new JButton("<html><center>F5<br/>Edit<br/>Game<br/><center></html>");
		preEnteredGamesBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(preEnteredGamesBtn);
		
		// f7
		JButton f7GameBtn = new JButton("<html><center>&nbsp;<br/>F7<br/>&nbsp;<center></html>");
		f7GameBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(f7GameBtn);
		
		// f8
		JButton viewGameBtn = new JButton("<html><center>F8<br/>Edit<br/>Game<br/><center></html>");
		viewGameBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(viewGameBtn);
		
		// f10
		JButton flickSyncBtn = new JButton("<html><center>F10<br/>Edit<br/>Game<br/><center></html>");
		flickSyncBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(flickSyncBtn);
		
		// f12
		JButton clearGameBtn = new JButton("<html><center>F12<br/>Edit<br/>Game<br/><center></html>");
		clearGameBtn.addActionListener(new ModeButtonEventHandler());
		functionPanel.add(clearGameBtn);
			
		return functionPanel;
	}

	/**
	 * run program
	 */
	public static void main(String[] args) {
	
		new PlayerEntry();
	
	}

}
