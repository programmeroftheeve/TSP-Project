package com.tsp.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.tsp.client.ClientMain;
import com.tsp.client.view.AboutView;
import com.tsp.client.view.HelpView;
import com.tsp.client.view.InfoEntryView;
import com.tsp.client.view.StartupView;

public class StartupController implements ActionListener, MouseListener {

	private StartupView startScreen;
	private InfoEntryView infoEntryScreen;
	private HelpView helpScreen;
	private AboutView aboutScreen;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Launch player/server info entry screen
		if (arg0.getActionCommand().equals("New Game")) {
			infoEntryScreen = new InfoEntryView(this);
			infoEntryScreen.setVisible(true);
		}
		// Launch actual game in terminal window (TODO)
		else if (arg0.getActionCommand().equals("Begin!")) {
			System.out.println("Player: " + infoEntryScreen.getPlayer());			
			System.out.println("Server: " + infoEntryScreen.getServer());	
			infoEntryScreen.setVisible(false);
		}
		// Launch About window
		else if (arg0.getActionCommand().equals("About")) {	
			aboutScreen = new AboutView(this);
			aboutScreen.setVisible(true);
		} 
		// Launch help window
		else if (arg0.getActionCommand().equals("Help")) {
			helpScreen = new HelpView(this);
			helpScreen.setVisible(true);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}