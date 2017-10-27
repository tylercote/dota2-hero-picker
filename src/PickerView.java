import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PickerView {

  private PickerModel model;

  private JPanel mainPanel;
  private JPanel teamsPanel;
  private JPanel radiantPanel;
  private JPanel radiantPBPanel;
  private JPanel radiantSuggestionPanel;
  private JPanel radiantPBSPanel;
  private JPanel direPanel;
  private JPanel direPBPanel;
  private JPanel direSuggestionPanel;
  private JPanel direPBSPanel;

  private JLabel titleLabel;
  private JLabel radiantTitle;
  private JLabel radiantPickTitle;
  private JLabel radiantBanTitle;
  private JLabel radiantSuggestionTitle;
  private JList radiantSuggestions;
  private JScrollPane radiantSuggestScroll;
  private JComboBox radiantPick1;
  private JComboBox radiantPick2;
  private JComboBox radiantPick3;
  private JComboBox radiantPick4;
  private JComboBox radiantPick5;
  private JLabel radiantPick1Pic;
  private JLabel radiantPick2Pic;
  private JLabel radiantPick3Pic;
  private JLabel radiantPick4Pic;
  private JLabel radiantPick5Pic;
  private JComboBox radiantBan1;
  private JComboBox radiantBan2;
  private JComboBox radiantBan3;
  private JComboBox radiantBan4;
  private JComboBox radiantBan5;
  private JLabel radiantBan1Pic;
  private JLabel radiantBan2Pic;
  private JLabel radiantBan3Pic;
  private JLabel radiantBan4Pic;
  private JLabel radiantBan5Pic;

  private JLabel direTitle;
  private JLabel direPickTitle;
  private JLabel direBanTitle;
  private JLabel direSuggestionTitle;
  private JList direSuggestions;
  private JScrollPane direSuggestScroll;
  private JComboBox direPick1;
  private JComboBox direPick2;
  private JComboBox direPick3;
  private JComboBox direPick4;
  private JComboBox direPick5;
  private JLabel direPick1Pic;
  private JLabel direPick2Pic;
  private JLabel direPick3Pic;
  private JLabel direPick4Pic;
  private JLabel direPick5Pic;
  private JComboBox direBan1;
  private JComboBox direBan2;
  private JComboBox direBan3;
  private JComboBox direBan4;
  private JComboBox direBan5;
  private JLabel direBan1Pic;
  private JLabel direBan2Pic;
  private JLabel direBan3Pic;
  private JLabel direBan4Pic;
  private JLabel direBan5Pic;

  public PickerView(PickerModel model) {
    this.model = model;

    radiantPick1Pic = new JLabel();
    radiantPick2Pic = new JLabel();
    radiantPick3Pic = new JLabel();
    radiantPick4Pic = new JLabel();
    radiantPick5Pic = new JLabel();
    radiantBan1Pic = new JLabel();
    radiantBan2Pic = new JLabel();
    radiantBan3Pic = new JLabel();
    radiantBan4Pic = new JLabel();
    radiantBan5Pic = new JLabel();

    direPick1Pic = new JLabel();
    direPick2Pic = new JLabel();
    direPick3Pic = new JLabel();
    direPick4Pic = new JLabel();
    direPick5Pic = new JLabel();
    direBan1Pic = new JLabel();
    direBan2Pic = new JLabel();
    direBan3Pic = new JLabel();
    direBan4Pic = new JLabel();
    direBan5Pic = new JLabel();

    radiantPickTitle = new JLabel("Picks");
    radiantPick1 = new JComboBox(HeroEnum.values());
    radiantPick1.setSelectedIndex(-1);
    radiantPick1.addActionListener(new JComboListener());
    radiantPick2 = new JComboBox(HeroEnum.values());
    radiantPick2.setSelectedIndex(-1);
    radiantPick2.addActionListener(new JComboListener());
    radiantPick3 = new JComboBox(HeroEnum.values());
    radiantPick3.setSelectedIndex(-1);
    radiantPick3.addActionListener(new JComboListener());
    radiantPick4 = new JComboBox(HeroEnum.values());
    radiantPick4.setSelectedIndex(-1);
    radiantPick4.addActionListener(new JComboListener());
    radiantPick5 = new JComboBox(HeroEnum.values());
    radiantPick5.setSelectedIndex(-1);
    radiantPick5.addActionListener(new JComboListener());

    radiantBanTitle = new JLabel("Bans");
    radiantBan1 = new JComboBox(HeroEnum.values());
    radiantBan1.setSelectedIndex(-1);
    radiantBan1.addActionListener(new JComboListener());
    radiantBan2 = new JComboBox(HeroEnum.values());
    radiantBan2.setSelectedIndex(-1);
    radiantBan2.addActionListener(new JComboListener());
    radiantBan3 = new JComboBox(HeroEnum.values());
    radiantBan3.setSelectedIndex(-1);
    radiantBan3.addActionListener(new JComboListener());
    radiantBan4 = new JComboBox(HeroEnum.values());
    radiantBan4.setSelectedIndex(-1);
    radiantBan4.addActionListener(new JComboListener());
    radiantBan5 = new JComboBox(HeroEnum.values());
    radiantBan5.setSelectedIndex(-1);
    radiantBan5.addActionListener(new JComboListener());

    radiantSuggestionPanel = new JPanel();
    radiantSuggestionPanel.setLayout(new BoxLayout(radiantSuggestionPanel, BoxLayout.PAGE_AXIS));
    radiantSuggestionTitle = new JLabel("Suggested picks:");
    radiantSuggestions = new JList(model.getSuggestions(TeamEnum.RADIANT).toArray());
    radiantSuggestScroll = new JScrollPane(radiantSuggestions);
    radiantSuggestScroll.setPreferredSize(new Dimension(200, 400));
    radiantSuggestionPanel.add(radiantSuggestionTitle);
    radiantSuggestionPanel.add(radiantSuggestScroll);

    radiantTitle = new JLabel("RADIANT");

    radiantPBPanel = new JPanel();
    radiantPBPanel.setLayout(new GridLayout(6, 4));

    radiantPBPanel.add(Box.createRigidArea(new Dimension(100, 50)));
    radiantPBPanel.add(radiantPickTitle);
    radiantPBPanel.add(Box.createRigidArea(new Dimension(100, 50)));
    radiantPBPanel.add(radiantBanTitle);

    radiantPBPanel.add(radiantPick1Pic);
    radiantPBPanel.add(radiantPick1);
    radiantPBPanel.add(radiantBan1Pic);
    radiantPBPanel.add(radiantBan1);

    radiantPBPanel.add(radiantPick2Pic);
    radiantPBPanel.add(radiantPick2);
    radiantPBPanel.add(radiantBan2Pic);
    radiantPBPanel.add(radiantBan2);

    radiantPBPanel.add(radiantPick3Pic);
    radiantPBPanel.add(radiantPick3);
    radiantPBPanel.add(radiantBan3Pic);
    radiantPBPanel.add(radiantBan3);

    radiantPBPanel.add(radiantPick4Pic);
    radiantPBPanel.add(radiantPick4);
    radiantPBPanel.add(radiantBan4Pic);
    radiantPBPanel.add(radiantBan4);

    radiantPBPanel.add(radiantPick5Pic);
    radiantPBPanel.add(radiantPick5);
    radiantPBPanel.add(radiantBan5Pic);
    radiantPBPanel.add(radiantBan5);

    radiantPBSPanel = new JPanel();
    radiantPBSPanel.setLayout(new FlowLayout());
    radiantPBSPanel.add(radiantPBPanel);
    radiantPBSPanel.add(radiantSuggestionPanel);

    radiantPanel = new JPanel();
    radiantPanel.setLayout(new BoxLayout(radiantPanel, BoxLayout.PAGE_AXIS));
    radiantPanel.add(radiantTitle);
    radiantPanel.add(radiantPBSPanel);


    direPickTitle = new JLabel("Picks");
    direPick1 = new JComboBox(HeroEnum.values());
    direPick1.setSelectedIndex(-1);
    direPick1.addActionListener(new JComboListener());
    direPick2 = new JComboBox(HeroEnum.values());
    direPick2.setSelectedIndex(-1);
    direPick2.addActionListener(new JComboListener());
    direPick3 = new JComboBox(HeroEnum.values());
    direPick3.setSelectedIndex(-1);
    direPick3.addActionListener(new JComboListener());
    direPick4 = new JComboBox(HeroEnum.values());
    direPick4.setSelectedIndex(-1);
    direPick4.addActionListener(new JComboListener());
    direPick5 = new JComboBox(HeroEnum.values());
    direPick5.setSelectedIndex(-1);
    direPick5.addActionListener(new JComboListener());

    direBanTitle = new JLabel("Bans");
    direBan1 = new JComboBox(HeroEnum.values());
    direBan1.setSelectedIndex(-1);
    direBan1.addActionListener(new JComboListener());
    direBan2 = new JComboBox(HeroEnum.values());
    direBan2.setSelectedIndex(-1);
    direBan2.addActionListener(new JComboListener());
    direBan3 = new JComboBox(HeroEnum.values());
    direBan3.setSelectedIndex(-1);
    direBan3.addActionListener(new JComboListener());
    direBan4 = new JComboBox(HeroEnum.values());
    direBan4.setSelectedIndex(-1);
    direBan4.addActionListener(new JComboListener());
    direBan5 = new JComboBox(HeroEnum.values());
    direBan5.setSelectedIndex(-1);
    direBan5.addActionListener(new JComboListener());

    direSuggestionPanel = new JPanel();
    direSuggestionPanel.setLayout(new BoxLayout(direSuggestionPanel, BoxLayout.PAGE_AXIS));
    direSuggestionTitle = new JLabel("Suggested picks:");

    direSuggestions = new JList(model.getSuggestions(TeamEnum.DIRE).toArray());
    direSuggestScroll = new JScrollPane(direSuggestions);
    direSuggestScroll.setPreferredSize(new Dimension(200, 400));
    direSuggestionPanel.add(direSuggestionTitle);
    direSuggestionPanel.add(direSuggestScroll);

    direTitle = new JLabel("DIRE");

    direPBPanel = new JPanel();
    direPBPanel.setLayout(new GridLayout(6, 4));

    direPBPanel.add(direBanTitle);
    direPBPanel.add(Box.createRigidArea(new Dimension(100, 50)));
    direPBPanel.add(direPickTitle);
    direPBPanel.add(Box.createRigidArea(new Dimension(100, 50)));

    direPBPanel.add(direBan1);
    direPBPanel.add(direBan1Pic);
    direPBPanel.add(direPick1);
    direPBPanel.add(direPick1Pic);

    direPBPanel.add(direBan2);
    direPBPanel.add(direBan2Pic);
    direPBPanel.add(direPick2);
    direPBPanel.add(direPick2Pic);

    direPBPanel.add(direBan3);
    direPBPanel.add(direBan3Pic);
    direPBPanel.add(direPick3);
    direPBPanel.add(direPick3Pic);

    direPBPanel.add(direBan4);
    direPBPanel.add(direBan4Pic);
    direPBPanel.add(direPick4);
    direPBPanel.add(direPick4Pic);

    direPBPanel.add(direBan5);
    direPBPanel.add(direBan5Pic);
    direPBPanel.add(direPick5);
    direPBPanel.add(direPick5Pic);

    direPBSPanel = new JPanel();
    direPBSPanel.setLayout(new FlowLayout());
    direPBSPanel.add(direSuggestionPanel);
    direPBSPanel.add(direPBPanel);

    direPanel = new JPanel();
    direPanel.setLayout(new BoxLayout(direPanel, BoxLayout.PAGE_AXIS));
    direPanel.add(direTitle);
    direPanel.add(direPBSPanel);

    teamsPanel = new JPanel();
    teamsPanel.setLayout(new FlowLayout());
    teamsPanel.add(radiantPanel);
    teamsPanel.add(direPanel);

    JLabel titleLabel = new JLabel("Dota 2 Picker");
    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainPanel.add(titleLabel);
    mainPanel.add(teamsPanel);


  }

  //gets main gui
  public JComponent getMainPanel() {
    return mainPanel;
  }

  private class JComboListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      JComboBox comboBox = (JComboBox) e.getSource();
      HeroEnum hero = (HeroEnum) comboBox.getSelectedItem();
      String heroIconFilepath = "/pics/" + String.valueOf(hero).toLowerCase().replaceAll("_","-") + ".jpg";
      int index;
      TeamEnum team;
      boolean isPick = false;
      JLabel iconLabel;

      if (comboBox.equals(radiantPick1)) {
        team = TeamEnum.RADIANT;
        isPick = true;
        index = 0;
        iconLabel = radiantPick1Pic;
      } else if (comboBox.equals(radiantPick2)) {
        team = TeamEnum.RADIANT;
        isPick = true;
        index = 1;
        iconLabel = radiantPick2Pic;
      } else if (comboBox.equals(radiantPick3)) {
        team = TeamEnum.RADIANT;
        isPick = true;
        index = 2;
        iconLabel = radiantPick3Pic;
      } else if (comboBox.equals(radiantPick4)) {
        team = TeamEnum.RADIANT;
        isPick = true;
        index = 3;
        iconLabel = radiantPick4Pic;
      } else if (comboBox.equals(radiantPick5)) {
        team = TeamEnum.RADIANT;
        isPick = true;
        index = 4;
        iconLabel = radiantPick5Pic;
      } else if (comboBox.equals(radiantBan1)) {
        team = TeamEnum.RADIANT;
        index = 0;
        iconLabel = radiantBan1Pic;
      } else if (comboBox.equals(radiantBan2)) {
        team = TeamEnum.RADIANT;
        index = 1;
        iconLabel = radiantBan2Pic;
      } else if (comboBox.equals(radiantBan3)) {
        team = TeamEnum.RADIANT;
        index = 2;
        iconLabel = radiantBan3Pic;
      } else if (comboBox.equals(radiantBan4)) {
        team = TeamEnum.RADIANT;
        index = 3;
        iconLabel = radiantBan4Pic;
      } else if (comboBox.equals(radiantBan5)) {
        team = TeamEnum.RADIANT;
        index = 4;
        iconLabel = radiantBan5Pic;
      } else if (comboBox.equals(direPick1)) {
        team = TeamEnum.DIRE;
        isPick = true;
        index = 0;
        iconLabel = direPick1Pic;
      } else if (comboBox.equals(direPick2)) {
        team = TeamEnum.DIRE;
        isPick = true;
        index = 1;
        iconLabel = direPick2Pic;
      } else if (comboBox.equals(direPick3)) {
        team = TeamEnum.DIRE;
        isPick = true;
        index = 2;
        iconLabel = direPick3Pic;
      } else if (comboBox.equals(direPick4)) {
        team = TeamEnum.DIRE;
        isPick = true;
        index = 3;
        iconLabel = direPick4Pic;
      } else if (comboBox.equals(direPick5)) {
        team = TeamEnum.DIRE;
        isPick = true;
        index = 4;
        iconLabel = direPick5Pic;
      } else if (comboBox.equals(direBan1)) {
        team = TeamEnum.DIRE;
        index = 0;
        iconLabel = direBan1Pic;
      } else if (comboBox.equals(direBan2)) {
        team = TeamEnum.DIRE;
        index = 1;
        iconLabel = direBan2Pic;
      } else if (comboBox.equals(direBan3)) {
        team = TeamEnum.DIRE;
        index = 2;
        iconLabel = direBan3Pic;
      } else if (comboBox.equals(direBan4)) {
        team = TeamEnum.DIRE;
        index = 3;
        iconLabel = direBan4Pic;
      } else {
        team = TeamEnum.DIRE;
        index = 4;
        iconLabel = direBan5Pic;
      }

      if (isPick) {

        if (model.dire.picksContains(hero)
                || model.radiant.picksContains(hero)) {
          comboBox.setSelectedIndex(-1);
        } else {
          model.addPick(hero, team, index);
          iconLabel.setIcon(new ImageIcon(this.getClass().getResource(heroIconFilepath)));
        }


      } else {
        if (model.dire.picksContains(hero)
                || model.radiant.picksContains(hero)) {
          comboBox.setSelectedIndex(-1);
        } else {
          model.addBan(hero, team, index);
          iconLabel.setIcon(new ImageIcon(this.getClass().getResource(heroIconFilepath)));
        }

      }

      model.updateAggregatedMatchups(team);
      if (team == TeamEnum.RADIANT) {
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());
      } else {
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    }
  }
}
