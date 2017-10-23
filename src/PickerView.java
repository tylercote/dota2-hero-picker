import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PickerView {

  private PickerController control;
  //private PickerModel model;

  private JPanel mainPanel;
  private JPanel teamsPanel;
  private JPanel radiantPanel;
  private JPanel radiantPickPanel;
  private JPanel radiantBanPanel;
  private JPanel radiantSuggestionPanel;
  private JPanel direPanel;
  private JPanel direPickPanel;
  private JPanel direBanPanel;
  private JPanel direSuggestionPanel;

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
  private JComboBox radiantBan1;
  private JComboBox radiantBan2;
  private JComboBox radiantBan3;
  private JComboBox radiantBan4;
  private JComboBox radiantBan5;

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
  private JComboBox direBan1;
  private JComboBox direBan2;
  private JComboBox direBan3;
  private JComboBox direBan4;
  private JComboBox direBan5;

  public PickerView(PickerModel model) {
    //this.model = model;

    radiantPickPanel = new JPanel();
    radiantPickPanel.setLayout(new BoxLayout(radiantPickPanel, BoxLayout.PAGE_AXIS));
    radiantPickTitle = new JLabel("Picks");
    radiantPick1 = new JComboBox(HeroEnum.values());
    radiantPick1.setSelectedIndex(-1);
    radiantPick1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.dire.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            radiantPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.RADIANT, 0);
          }
        }
        catch (IllegalArgumentException er) {
          radiantPick1.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.RADIANT);
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());
      }
    });
    radiantPick2 = new JComboBox(HeroEnum.values());
    radiantPick2.setSelectedIndex(-1);
    radiantPick2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.dire.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            radiantPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.RADIANT, 1);
          }
        }
        catch (IllegalArgumentException er) {
          radiantPick2.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.RADIANT);
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());

      }
    });
    radiantPick3 = new JComboBox(HeroEnum.values());
    radiantPick3.setSelectedIndex(-1);
    radiantPick3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.dire.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            radiantPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.RADIANT, 2);
          }
        }
        catch (IllegalArgumentException er) {
          radiantPick3.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.RADIANT);
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());
      }
    });
    radiantPick4 = new JComboBox(HeroEnum.values());
    radiantPick4.setSelectedIndex(-1);
    radiantPick4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.dire.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            radiantPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.RADIANT, 3);
          }
        }
        catch (IllegalArgumentException er) {
          radiantPick4.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.RADIANT);
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());
      }
    });
    radiantPick5 = new JComboBox(HeroEnum.values());
    radiantPick5.setSelectedIndex(-1);
    radiantPick5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.dire.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            radiantPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.RADIANT, 4);
          }
        }
        catch (IllegalArgumentException er) {
          radiantPick5.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.RADIANT);
        direSuggestions.setListData(model.getSuggestions(TeamEnum.DIRE).toArray());
      }
    });
    radiantPickPanel.add(radiantPickTitle);
    radiantPickPanel.add(radiantPick1);
    radiantPickPanel.add(radiantPick2);
    radiantPickPanel.add(radiantPick3);
    radiantPickPanel.add(radiantPick4);
    radiantPickPanel.add(radiantPick5);

    radiantBanPanel = new JPanel();
    radiantBanPanel.setLayout(new BoxLayout(radiantBanPanel, BoxLayout.PAGE_AXIS));
    radiantBanTitle = new JLabel("Bans");
    radiantBan1 = new JComboBox(HeroEnum.values());
    radiantBan1.setSelectedIndex(-1);
    radiantBan2 = new JComboBox(HeroEnum.values());
    radiantBan2.setSelectedIndex(-1);
    radiantBan3 = new JComboBox(HeroEnum.values());
    radiantBan3.setSelectedIndex(-1);
    radiantBan4 = new JComboBox(HeroEnum.values());
    radiantBan4.setSelectedIndex(-1);
    radiantBan5 = new JComboBox(HeroEnum.values());
    radiantBan5.setSelectedIndex(-1);
    radiantBanPanel.add(radiantBanTitle);
    radiantBanPanel.add(radiantBan1);
    radiantBanPanel.add(radiantBan2);
    radiantBanPanel.add(radiantBan3);
    radiantBanPanel.add(radiantBan4);
    radiantBanPanel.add(radiantBan5);

    radiantSuggestionPanel = new JPanel();
    radiantSuggestionPanel.setLayout(new BoxLayout(radiantSuggestionPanel, BoxLayout.PAGE_AXIS));
    radiantSuggestionTitle = new JLabel("Suggested picks:");
    radiantSuggestions = new JList(model.getSuggestions(TeamEnum.RADIANT).toArray());
    radiantSuggestScroll = new JScrollPane(radiantSuggestions);
    radiantSuggestionPanel.add(radiantSuggestionTitle);
    radiantSuggestionPanel.add(radiantSuggestScroll);

    radiantTitle = new JLabel("RADIANT");

    radiantPanel = new JPanel();
    radiantPanel.setLayout(new BorderLayout());
    radiantPanel.add(radiantTitle, BorderLayout.PAGE_START);
    radiantPanel.add(radiantPickPanel, BorderLayout.LINE_START);
    radiantPanel.add(radiantBanPanel, BorderLayout.CENTER);
    radiantPanel.add(radiantSuggestionPanel, BorderLayout.LINE_END);


    direPickPanel = new JPanel();
    direPickPanel.setLayout(new BoxLayout(direPickPanel, BoxLayout.PAGE_AXIS));
    direPickTitle = new JLabel("Picks");
    direPick1 = new JComboBox(HeroEnum.values());
    direPick1.setSelectedIndex(-1);
    direPick1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.radiant.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            direPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.DIRE, 0);
          }
        } catch (IllegalArgumentException er) {
          direPick1.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.DIRE);
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    });
    direPick2 = new JComboBox(HeroEnum.values());
    direPick2.setSelectedIndex(-1);
    direPick2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.radiant.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            direPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.DIRE, 1);
          }
        } catch (IllegalArgumentException er) {
          direPick2.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.DIRE);
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    });
    direPick3 = new JComboBox(HeroEnum.values());
    direPick3.setSelectedIndex(-1);
    direPick3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.radiant.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            direPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.DIRE, 2);
          }
        } catch (IllegalArgumentException er) {
          direPick3.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.DIRE);
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    });
    direPick4 = new JComboBox(HeroEnum.values());
    direPick4.setSelectedIndex(-1);
    direPick4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.radiant.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            direPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.DIRE, 3);
          }
        } catch (IllegalArgumentException er) {
          direPick4.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.DIRE);
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    });
    direPick5 = new JComboBox(HeroEnum.values());
    direPick5.setSelectedIndex(-1);
    direPick5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        try {
          if (model.radiant.picksContains((HeroEnum) comboBox.getSelectedItem())) {
            direPick1.setSelectedIndex(-1);
          }
          else {
            model.addPick((HeroEnum) comboBox.getSelectedItem(), TeamEnum.DIRE, 4);
          }
        } catch (IllegalArgumentException er) {
          direPick5.setSelectedIndex(-1);
        }
        model.updateAggregatedMatchups(TeamEnum.DIRE);
        radiantSuggestions.setListData(model.getSuggestions(TeamEnum.RADIANT).toArray());
      }
    });
    direPickPanel.add(direPickTitle);
    direPickPanel.add(direPick1);
    direPickPanel.add(direPick2);
    direPickPanel.add(direPick3);
    direPickPanel.add(direPick4);
    direPickPanel.add(direPick5);

    direBanPanel = new JPanel();
    direBanPanel.setLayout(new BoxLayout(direBanPanel, BoxLayout.PAGE_AXIS));
    direBanTitle = new JLabel("Bans");
    direBan1 = new JComboBox(HeroEnum.values());
    direBan1.setSelectedIndex(-1);
    direBan2 = new JComboBox(HeroEnum.values());
    direBan2.setSelectedIndex(-1);
    direBan3 = new JComboBox(HeroEnum.values());
    direBan3.setSelectedIndex(-1);
    direBan4 = new JComboBox(HeroEnum.values());
    direBan4.setSelectedIndex(-1);
    direBan5 = new JComboBox(HeroEnum.values());
    direBan5.setSelectedIndex(-1);
    direBanPanel.add(direBanTitle);
    direBanPanel.add(direBan1);
    direBanPanel.add(direBan2);
    direBanPanel.add(direBan3);
    direBanPanel.add(direBan4);
    direBanPanel.add(direBan5);

    direSuggestionPanel = new JPanel();
    direSuggestionPanel.setLayout(new BoxLayout(direSuggestionPanel, BoxLayout.PAGE_AXIS));
    direSuggestionTitle = new JLabel("Suggested picks:");

    direSuggestions = new JList(model.getSuggestions(TeamEnum.DIRE).toArray());
    direSuggestScroll = new JScrollPane(direSuggestions);
    direSuggestionPanel.add(direSuggestionTitle);
    direSuggestionPanel.add(direSuggestScroll);

    direTitle = new JLabel("DIRE");

    direPanel = new JPanel();
    direPanel.setLayout(new BorderLayout());
    direPanel.add(direTitle, BorderLayout.PAGE_START);
    direPanel.add(direSuggestionPanel, BorderLayout.LINE_START);
    direPanel.add(direBanPanel, BorderLayout.CENTER);
    direPanel.add(direPickPanel, BorderLayout.LINE_END);

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

  //sets controller
  public void setGuiControl(PickerController control) {
    this.control = control;
  }

  //gets main gui
  public JComponent getMainPanel() {
    return mainPanel;
  }
}
