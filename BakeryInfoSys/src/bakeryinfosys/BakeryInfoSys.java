/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakeryinfosys;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author aabis
 */
public class BakeryInfoSys extends javax.swing.JFrame {
//int[] a = ArrayUtil.randomIntArray(20, 100);

    int[] a = {20, 1, 8, 80};

    /**
     * Creates new form BakeryInfoSys
     */
    public BakeryInfoSys() {
        initComponents();
        BakeryInfoSys.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jScrollPane3.getViewport().setBackground(new Color(254, 233, 197));
        fileMenuPanel.setVisible(false);
        editMenuPanel.setVisible(false);
        helpMenuPanel.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
        contentTable.setBackground(Color.decode("#F9E0B8")); //sets background color of jtable cell
        JTableHeader header = contentTable.getTableHeader(); //gets the table header contents
        header.setForeground(new Color(253, 176, 50)); //changes font color of table header
        header.setFont(new Font("Pristina", Font.BOLD, 20));//sets font size, tyoe and faimly of the the header titles

        /**
         * Creating lists to enter values in table
         */
        String[] list3 = {"3", "White Bread", "Breads", "This bread is made  of wheat", "45", "5", "No", "No"};
        String[] list7 = {"7", "Vanilla Pastry", "Pastries", "This pastry is  vanilla flavoured", "55", "5", "No", "No"};
        String[] list13 = {"13", "Potato Cracker", "Crackers", " This cracker is made up of potato and lightly salted ", "80", "5", "No", "No"};
        String[] list19 = {"19", "Fruit Yogurt", "Desert", "This contains sweet yogurt and small pieces of fruits", "90", "10", "Yes", "No"};
        String[] list8 = {"8", "Fruit Cake", "Cake", "This cake contains lots of fruits", "1000", "120", "No", "No"};
        String[] list1 = {"1", "BlackForest", "Cake", "This cake conatins chocolates and cream", "1200", "120", "No", "No"};
        String[] list2 = {"2", "WhiteForest", "Cake", "This cake contains lots of white chocolate", "1050", "120", "No", "No"};
        String[] list4 = {"4", "Brown Bread", "Breads", "This bread is gluten free and made of whole grain wheat", "100", "5", "No", "No"};
        String[] list5 = {"5", "Loaf Bread", "Breads", "This is a loaf of a bread", "175", "6", "No", "No"};
        String[] list6 = {"6", "Choco Chip Cookies", "Cookies", "This cookie contains choco chips ", "250", "10", "Yes", "No"};
        String[] list9 = {"9", "Pineapple pastry", "Pastries", "This pastry is pineapple flavoured", "1000", "5", "No", "No"};
        String[] list10 = {"10", "Mushroom Pizza", "Pizza", "This Pizza contains mushroom with lots of cheese", "550", "10", "No", "No"};
        String[] list11 = {"11", "Rice Pudding", "Pudding", "This pudding is made up of milk and rice", "500", "15", "Yes", "No"};
        String[] list12 = {"12", "Sugarfree Rice Pudding", "Pudding", "This pudding is sugarfree", "575", "15", "Yes", "Yes"};
        String[] list14 = {"14", "Jelly Beans", "Sweets", "Soft Jelly Beans with fruits flavour", "100", "5", "No", "No"};
        String[] list15 = {"15", "Apple pie", "Pie", "This pie is apple flavoured", "225", "10", "yes", "No"};
        String[] list16 = {"16", "Blueberry Muffin", "Muffin", "This muffin contains Blueberry flavour", "200", "10", "No", "No"};
        String[] list17 = {"17", "Mac and Cheese", "Breakfast", "This is made of macaroni and cheese", "435", "10", "No", "No"};
        String[] list18 = {"18", "Burgar", "Breakfast", "A flat round paties of minced beef that is fried or grilled and typically served in a bread roll", "370", "15", "No", "No"};

        String[] list20 = {"20", "Americano", "Drinks", "Coffee made with coffee beans inported from arabia", "175", "5", "No", "No"};
        String[] list21 = {"21", "Green Tea", "Drinks", "Made of leaves grown in himalayas", "225", "5", "No", "No"};
        String[] list22 = {"22", "Cinamon Tea", "Drinks", "This tea contains cinamon", "190", "5", "No", "No"};
        String[] list23 = {"23", "Milkshake", "Drinks", "This Drink contains milk and nuts", "250", "5", "Yes", "No"};
        String[] list24 = {"24", "Cheese Coffee cake", "Cake", "This cake contains cheese and coffee flavour", "1500", "120", "No", "No"};
        String[] list25 = {"25", "Chocolate Cupcake", "Muffin", "This cupcake is made of chocolate with nuts", "150", "5", "Yes", "No"};

        /**
         * Inserting Values in the table
         */
        int rowCount = contentTable.getRowCount();
        int colCount = contentTable.getColumnCount();
        boolean emptyFlag = false;
        int nextRow
                = 0;

        for (int i = 0; i < 8; i++) {

            for (int a = 0; a < 8; a++) {
                contentTable.setValueAt(list1[i], 0, i);
                contentTable.setValueAt(list2[i], 1, i);
                contentTable.setValueAt(list3[i], 2, i);
                contentTable.setValueAt(list4[i], 3, i);
                contentTable.setValueAt(list5[i], 4, i);
                contentTable.setValueAt(list6[i], 5, i);
                contentTable.setValueAt(list7[i], 6, i);
                contentTable.setValueAt(list8[i], 7, i);
                contentTable.setValueAt(list9[i], 8, i);
                contentTable.setValueAt(list10[i], 9, i);
                contentTable.setValueAt(list11[i], 10, i);
                contentTable.setValueAt(list12[i], 11, i);
                contentTable.setValueAt(list13[i], 12, i);
                contentTable.setValueAt(list14[i], 13, i);
                contentTable.setValueAt(list15[i], 14, i);
                contentTable.setValueAt(list16[i], 15, i);
                contentTable.setValueAt(list17[i], 16, i);
                contentTable.setValueAt(list18[i], 17, i);
                contentTable.setValueAt(list19[i], 18, i);
                contentTable.setValueAt(list20[i], 19, i);
                contentTable.setValueAt(list21[i], 20, i);
                contentTable.setValueAt(list22[i], 21, i);
                contentTable.setValueAt(list23[i], 22, i);
                contentTable.setValueAt(list24[i], 23, i);
                contentTable.setValueAt(list25[i], 24, i);

            }

        }

    }

    /**
     * Searching items via category
     */
    public void searchByCatagory() {
        ArrayList li = new ArrayList();
        String userItem = (String) searchCatagoryComboBox.getSelectedItem();
        String valueFromTable;
        String itemInTable;
        int itemcount = 0;
        int rowCount = contentTable.getRowCount();
        int colCount = contentTable.getColumnCount();
        if (userItem.equals("-----")) {
            JOptionPane.showMessageDialog(this, "Please select catagory to search", "Missing Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < rowCount; i++) {
                valueFromTable = contentTable.getValueAt(i, 2).toString();

                if (userItem.equals(valueFromTable)) {
                    li.add(contentTable.getValueAt(i, 1));
                    itemcount++;

                } else {

                }
            }

            if (li.isEmpty()) {
                JOptionPane.showMessageDialog(this, "There are no items in this catagory", "No search results", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "There are " + itemcount + " items in " + userItem + " catagory"
                        + "\n List of found items:\n" + li.toString().replace(",", "\n").replace("[", " ").replace("]", ""), "Search by Catagory", JOptionPane.INFORMATION_MESSAGE, null);
            }
        }
    }

    /**
     * Validating if the item id is already present in the table
     */
    public static boolean isItemIdOk; //sets the boolean value for this method weather if this is true or not

    public void checkItemId() {   //checks if item value already exists

        ArrayList li = new ArrayList();   //adding all data to arraylist
        String userNum = txtItemNum.getText();  // the item number that user types
        String valueFromTable; //value of item id that exists in the table

        String itemInTable; //not needed
        int itemcount = 0; // not needed
        int rowCount = contentTable.getRowCount(); //self explanatory
        int colCount = contentTable.getColumnCount();//self explanatory
        boolean flagOk = true;//checks if the condition is tue

        for (int i = 0; i < rowCount; i++) { //checks for the condition if the id already exists or not
            valueFromTable = contentTable.getValueAt(i, 0).toString();

            while (flagOk) {

                if (userNum.equals(valueFromTable)) {
                    isItemIdOk = false;

                    flagOk = false;

                } else {
                    isItemIdOk = true;

                    break;
                }
            }
        }

    }

    /**
     * This method is used to open jFileChooser and open a file
     */
    public void chooseFiles() {
        /**
         * Opens jFileChooser
         */
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        Desktop desktop = Desktop.getDesktop();

        /**
         * handling the file opening process. This try catch blocks opens the
         * file
         */
        try {
            File f = chooser.getSelectedFile();
            String location = f.getAbsolutePath();
            desktop.open(f);

        } catch (IOException ex) {
            Logger.getLogger(BakeryInfoSys.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No files selected", "No Files", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * This method is used to remove item from the table
     */
    public void deleteItem() {
        int rowCount = contentTable.getRowCount() - 1; //self explanatory
        boolean flagOk = true;//checks if the condition is tue
        String userNum = txtItemDel.getText();
        DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
        String valueFromTable;
        String temp = contentTable.getValueAt(rowCount, 0).toString();
        for (int i = 0; i < rowCount; i++) { //checks for the condition if the id exists or not
            valueFromTable = contentTable.getValueAt(i, 0).toString();
            while (flagOk) {

                if (userNum.equals(valueFromTable)) {
                    isItemIdOk = false;
                    model.removeRow(i);
                    flagOk = false;
                } else if (userNum.equals(temp)) {
                    isItemIdOk = false;
                    model.removeRow(rowCount);
                    flagOk = false;
                } else {
                    isItemIdOk = true;
                    break;
                }
            }
        }
    }

    public void storter() {
        ArrayList li = new ArrayList();
        String userItem = (String) searchCatagoryComboBox.getSelectedItem();
        String valueFromTable;
        String itemInTable;
        int itemcount = 0;
        int rowCount = contentTable.getRowCount();
        int colCount = contentTable.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            valueFromTable = contentTable.getValueAt(i, 4).toString();
            li.add(valueFromTable);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nutContains = new javax.swing.ButtonGroup();
        sugarFree = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        operationsPanel = new javax.swing.JPanel();
        maximizeIcon = new javax.swing.JLabel();
        minimizeIcon = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        filesMenu = new javax.swing.JLabel();
        editMenu = new javax.swing.JLabel();
        helpMenu = new javax.swing.JLabel();
        companyTitleTop = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        inputPanel = new javax.swing.JPanel();
        txtItemNum = new javax.swing.JTextField();
        lblItemNumber = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        itemNamelbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        itemDescLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescTxt = new javax.swing.JTextArea();
        prepTimeLbl = new javax.swing.JLabel();
        txtPrepTime = new javax.swing.JTextField();
        catagoryLbl = new javax.swing.JLabel();
        categoryBox = new javax.swing.JComboBox<>();
        nutsLbl = new javax.swing.JLabel();
        nutsYes = new javax.swing.JRadioButton();
        nutNo = new javax.swing.JRadioButton();
        sugarLbl = new javax.swing.JLabel();
        sugarYes = new javax.swing.JRadioButton();
        sugarNo = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        enterBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        additionalPanel = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        searchCatagoryPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        searchPriceLbl = new javax.swing.JLabel();
        searchPrice = new javax.swing.JTextField();
        searchPriceBtn = new javax.swing.JButton();
        searchCatagoryLbl = new javax.swing.JPanel();
        searchCatagoryComboBox = new javax.swing.JComboBox<>();
        searchCatagoryBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        deleteLbl = new javax.swing.JLabel();
        txtItemDel = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fileMenuPanel = new javax.swing.JPanel();
        openMenuItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exitMenuItem = new javax.swing.JLabel();
        editMenuPanel = new javax.swing.JPanel();
        clearMenuItem = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        companyLogoImage = new javax.swing.JLabel();
        helpMenuPanel = new javax.swing.JPanel();
        helpUsMenuItem = new javax.swing.JLabel();
        aboutMenuItem = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/homeIcon.png")).getImage()
        );
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainPanel.setBackground(new java.awt.Color(249, 224, 184));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        mainPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));

        topPanel.setBackground(new java.awt.Color(253, 204, 125));

        operationsPanel.setBackground(new java.awt.Color(253, 204, 125));

        maximizeIcon.setBackground(new java.awt.Color(253, 204, 125));
        maximizeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/maximize.png"))); // NOI18N
        maximizeIcon.setToolTipText("Maximize");
        maximizeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeIconMouseExited(evt);
            }
        });

        minimizeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/minimize.png"))); // NOI18N
        minimizeIcon.setToolTipText("Minimize");
        minimizeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeIconMousePressed(evt);
            }
        });

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/close.png"))); // NOI18N
        closeIcon.setToolTipText("Close");
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeIconMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeIconMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout operationsPanelLayout = new javax.swing.GroupLayout(operationsPanel);
        operationsPanel.setLayout(operationsPanelLayout);
        operationsPanelLayout.setHorizontalGroup(
            operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximizeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeIcon))
        );
        operationsPanelLayout.setVerticalGroup(
            operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operationsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeIcon)
                    .addComponent(minimizeIcon)
                    .addComponent(maximizeIcon))
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(243, 194, 114));

        filesMenu.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        filesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/file.png"))); // NOI18N
        filesMenu.setText(" Files ");
        filesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filesMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filesMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filesMenuMouseExited(evt);
            }
        });

        editMenu.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/edit.png"))); // NOI18N
        editMenu.setText("Edit");
        editMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMenuMouseExited(evt);
            }
        });

        helpMenu.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/help.png"))); // NOI18N
        helpMenu.setText("Help");
        helpMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(filesMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editMenu)
                    .addComponent(filesMenu)
                    .addComponent(helpMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        companyTitleTop.setBackground(new java.awt.Color(204, 204, 204));
        companyTitleTop.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        companyTitleTop.setForeground(new java.awt.Color(153, 153, 153));
        companyTitleTop.setText("Bakery Information System ");
        companyTitleTop.setToolTipText("");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309)
                .addComponent(companyTitleTop, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(operationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(operationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(companyTitleTop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundPanel.setBackground(new java.awt.Color(249, 224, 184));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        tablePanel.setBackground(new java.awt.Color(249, 224, 184));

        jScrollPane3.setBackground(new java.awt.Color(254, 233, 197));

        contentTable.setBackground(new java.awt.Color(254, 233, 197));
        contentTable.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.windowBorder, 2, true));
        contentTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contentTable.setForeground(new java.awt.Color(0, 153, 153));
        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ItemNo", "ItemName", "Catagory", "ItemDescription", "Price", "PreprationTime", "ContainNuts", "SugarFree"
            }
        ));
        contentTable.setRowHeight(25);
        contentTable.setSelectionBackground(new java.awt.Color(252, 222, 168));
        jScrollPane3.setViewportView(contentTable);
        if (contentTable.getColumnModel().getColumnCount() > 0) {
            contentTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            contentTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            contentTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            contentTable.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        inputPanel.setBackground(new java.awt.Color(253, 204, 125));
        inputPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputPanel.setForeground(new java.awt.Color(243, 194, 114));
        inputPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inputPanelMouseExited(evt);
            }
        });

        txtItemNum.setBackground(new java.awt.Color(254, 233, 197));
        txtItemNum.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtItemNum.setForeground(new java.awt.Color(0, 153, 153));
        txtItemNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtItemNumMouseEntered(evt);
            }
        });
        txtItemNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNumActionPerformed(evt);
            }
        });

        lblItemNumber.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        lblItemNumber.setText("Item Number");

        txtItemName.setBackground(new java.awt.Color(254, 233, 197));
        txtItemName.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtItemName.setForeground(new java.awt.Color(0, 153, 153));
        txtItemName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtItemNameMouseEntered(evt);
            }
        });

        itemNamelbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        itemNamelbl.setText("Item Name");

        priceLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        priceLbl.setText("Price(Rs.)");

        priceTxt.setBackground(new java.awt.Color(254, 233, 197));
        priceTxt.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(0, 153, 153));
        priceTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priceTxtMouseEntered(evt);
            }
        });

        itemDescLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        itemDescLbl.setText("Item Description");

        itemDescTxt.setBackground(new java.awt.Color(254, 233, 197));
        itemDescTxt.setColumns(20);
        itemDescTxt.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        itemDescTxt.setForeground(new java.awt.Color(0, 153, 153));
        itemDescTxt.setLineWrap(true);
        itemDescTxt.setRows(5);
        itemDescTxt.setWrapStyleWord(true);
        itemDescTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemDescTxtMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(itemDescTxt);

        prepTimeLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        prepTimeLbl.setText("Prepration Time(Min)");

        txtPrepTime.setBackground(new java.awt.Color(254, 233, 197));
        txtPrepTime.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtPrepTime.setForeground(new java.awt.Color(0, 153, 153));
        txtPrepTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPrepTimeMouseEntered(evt);
            }
        });
        txtPrepTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrepTimeActionPerformed(evt);
            }
        });

        catagoryLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        catagoryLbl.setText("Catagory");

        categoryBox.setBackground(new java.awt.Color(254, 233, 197));
        categoryBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Cake", "Pie", "Pastries", "Sweets", "Cookies", "Breads", "Desert", "Crackers", "Pizza", "Pudding", "Baked Items", "Ice-Cream", "Drinks", "Muffin", "Waffle" }));
        categoryBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryBoxMouseEntered(evt);
            }
        });
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        nutsLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        nutsLbl.setText("Contains Nuts");

        nutsYes.setBackground(new java.awt.Color(253, 204, 125));
        nutContains.add(nutsYes);
        nutsYes.setText("Yes");
        nutsYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nutsYesMouseEntered(evt);
            }
        });
        nutsYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsYesActionPerformed(evt);
            }
        });

        nutNo.setBackground(new java.awt.Color(253, 204, 125));
        nutContains.add(nutNo);
        nutNo.setText("No");
        nutNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nutNoMouseEntered(evt);
            }
        });

        sugarLbl.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        sugarLbl.setText("Sugar Free");

        sugarYes.setBackground(new java.awt.Color(253, 204, 125));
        sugarFree.add(sugarYes);
        sugarYes.setText("Yes");
        sugarYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sugarYesMouseEntered(evt);
            }
        });

        sugarNo.setBackground(new java.awt.Color(253, 204, 125));
        sugarFree.add(sugarNo);
        sugarNo.setText("No");
        sugarNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sugarNoMouseEntered(evt);
            }
        });
        sugarNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarNoActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));

        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/enterBtnNormal.png"))); // NOI18N
        enterBtn.setText("Enter");
        enterBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        enterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enterBtnMouseReleased(evt);
            }
        });
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearBtnNormal.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearBtnMouseReleased(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        additionalPanel.setBackground(new java.awt.Color(252, 199, 114));

        jPanel5.setBackground(new java.awt.Color(252, 199, 114));

        searchCatagoryPanel.setBackground(new java.awt.Color(252, 199, 114));

        jPanel1.setBackground(new java.awt.Color(252, 199, 114));

        searchPriceLbl.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        searchPriceLbl.setText("Price");

        searchPrice.setBackground(new java.awt.Color(254, 233, 197));
        searchPrice.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        searchPrice.setForeground(new java.awt.Color(0, 153, 153));

        searchPriceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtn.png"))); // NOI18N
        searchPriceBtn.setText("Search");
        searchPriceBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        searchPriceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchPriceBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchPriceBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchPriceBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchPriceBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchPriceBtnMouseReleased(evt);
            }
        });
        searchPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPriceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(searchPriceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(searchPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPriceLbl))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(searchPriceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        searchCatagoryPanel.addTab("Price", jPanel1);

        searchCatagoryLbl.setBackground(new java.awt.Color(252, 199, 114));

        searchCatagoryComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchCatagoryComboBox.setForeground(new java.awt.Color(0, 153, 153));
        searchCatagoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Cake", "Pie", "Pastries", "Sweets", "Cookies", "Breads", "Desert", "Crackers", "Pizza", "Pudding", "Baked Items", "Ice-Cream", "Drinks", "Muffin", "Waffle" }));
        searchCatagoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCatagoryComboBoxActionPerformed(evt);
            }
        });

        searchCatagoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtn.png"))); // NOI18N
        searchCatagoryBtn.setText("Search");
        searchCatagoryBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        searchCatagoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCatagoryBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchCatagoryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchCatagoryBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchCatagoryBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchCatagoryBtnMouseReleased(evt);
            }
        });
        searchCatagoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCatagoryBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jLabel14.setText("Category");

        javax.swing.GroupLayout searchCatagoryLblLayout = new javax.swing.GroupLayout(searchCatagoryLbl);
        searchCatagoryLbl.setLayout(searchCatagoryLblLayout);
        searchCatagoryLblLayout.setHorizontalGroup(
            searchCatagoryLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchCatagoryLblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCatagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchCatagoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        searchCatagoryLblLayout.setVerticalGroup(
            searchCatagoryLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchCatagoryLblLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(searchCatagoryLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCatagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(searchCatagoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        searchCatagoryPanel.addTab("Catagory", searchCatagoryLbl);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(searchCatagoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(searchCatagoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        additionalPanel.addTab("Searching", jPanel5);

        jPanel6.setBackground(new java.awt.Color(252, 199, 114));

        deleteLbl.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        deleteLbl.setText("Item Id");

        txtItemDel.setBackground(new java.awt.Color(254, 233, 197));
        txtItemDel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtItemDel.setForeground(new java.awt.Color(0, 153, 153));

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/deleteBtnNormal.png"))); // NOI18N
        deleteBtn.setText("Search");
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteBtnMouseReleased(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(deleteLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtItemDel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItemDel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(deleteLbl)
                        .addGap(21, 21, 21))))
        );

        additionalPanel.addTab("Delete Item", jPanel6);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setText("Utilities");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblItemNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(itemNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(priceLbl)
                                    .addComponent(itemDescLbl)
                                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(inputPanelLayout.createSequentialGroup()
                                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtItemName)
                                                    .addComponent(txtItemNum)
                                                    .addComponent(priceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane1)))
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(inputPanelLayout.createSequentialGroup()
                                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(catagoryLbl)
                                        .addComponent(nutsLbl))
                                    .addGap(81, 81, 81)
                                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(categoryBox, 0, 287, Short.MAX_VALUE)
                                        .addGroup(inputPanelLayout.createSequentialGroup()
                                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nutsYes)
                                                .addComponent(sugarYes))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sugarNo)
                                                .addComponent(nutNo))
                                            .addGap(95, 95, 95))))
                                .addComponent(sugarLbl)
                                .addGroup(inputPanelLayout.createSequentialGroup()
                                    .addComponent(prepTimeLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrepTime)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(additionalPanel))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(itemDescLbl)))
                .addGap(22, 22, 22)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prepTimeLbl)
                    .addComponent(txtPrepTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagoryLbl)
                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsLbl)
                    .addComponent(nutsYes)
                    .addComponent(nutNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugarLbl)
                    .addComponent(sugarYes)
                    .addComponent(sugarNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(additionalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenuPanel.setBackground(new java.awt.Color(243, 194, 114));
        fileMenuPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fileMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuPanelMouseClicked(evt);
            }
        });

        openMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        openMenuItem.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/open.png"))); // NOI18N
        openMenuItem.setText("Open");
        openMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openMenuItemMouseExited(evt);
            }
        });

        exitMenuItem.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/exitMenuItem.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMenuItemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fileMenuPanelLayout = new javax.swing.GroupLayout(fileMenuPanel);
        fileMenuPanel.setLayout(fileMenuPanelLayout);
        fileMenuPanelLayout.setHorizontalGroup(
            fileMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(fileMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fileMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fileMenuPanelLayout.createSequentialGroup()
                        .addComponent(openMenuItem)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fileMenuPanelLayout.setVerticalGroup(
            fileMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileMenuPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(openMenuItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitMenuItem)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        editMenuPanel.setBackground(new java.awt.Color(243, 194, 114));
        editMenuPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        editMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuPanelMouseClicked(evt);
            }
        });

        clearMenuItem.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        clearMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearMenu.png"))); // NOI18N
        clearMenuItem.setText("Clear All");
        clearMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMenuItemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout editMenuPanelLayout = new javax.swing.GroupLayout(editMenuPanel);
        editMenuPanel.setLayout(editMenuPanelLayout);
        editMenuPanelLayout.setHorizontalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearMenuItem)
                .addContainerGap())
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        editMenuPanelLayout.setVerticalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearMenuItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        companyLogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/bakery.jpg"))); // NOI18N

        helpMenuPanel.setBackground(new java.awt.Color(243, 194, 114));
        helpMenuPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        helpMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuPanelMouseClicked(evt);
            }
        });

        helpUsMenuItem.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        helpUsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/helpMenuItem.png"))); // NOI18N
        helpUsMenuItem.setText("Help Us");
        helpUsMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpUsMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpUsMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpUsMenuItemMouseExited(evt);
            }
        });

        aboutMenuItem.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/about.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout helpMenuPanelLayout = new javax.swing.GroupLayout(helpMenuPanel);
        helpMenuPanel.setLayout(helpMenuPanelLayout);
        helpMenuPanelLayout.setHorizontalGroup(
            helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(helpMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpUsMenuItem)
                    .addComponent(aboutMenuItem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        helpMenuPanelLayout.setVerticalGroup(
            helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpUsMenuItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutMenuItem)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(fileMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(helpMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(companyLogoImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyLogoImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        System.exit(0);  // closes the program
    }//GEN-LAST:event_closeIconMouseClicked

    private void closeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseEntered
        // Changes the panel color of operationpanel when mouse enters on close icon
        operationsPanel.setBackground(Color.RED); //changes background color when mosue enters

    }//GEN-LAST:event_closeIconMouseEntered

    private void closeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseExited
        // Changes the panel color back to orginal when mouse exit
        operationsPanel.setBackground(new Color(253, 204, 125));
    }//GEN-LAST:event_closeIconMouseExited

    private void maximizeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeIconMouseEntered
        // Changes the panel color of operationpanel when mouse enters on close icon
        operationsPanel.setBackground(new Color(21, 193, 145));//21, 193, 145
    }//GEN-LAST:event_maximizeIconMouseEntered

    private void maximizeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeIconMouseExited
        // Changes the panel color back to orginal when mouse exit
        operationsPanel.setBackground(new Color(253, 204, 125));
    }//GEN-LAST:event_maximizeIconMouseExited

    private void closeIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMousePressed
        //Changes the color when close is pressed
        operationsPanel.setBackground(new Color(255, 127, 39));
    }//GEN-LAST:event_closeIconMousePressed

    private void closeIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseReleased
        //Changes back the color to orginal when button is released
        operationsPanel.setBackground(new Color(253, 204, 125));

    }//GEN-LAST:event_closeIconMouseReleased

    private void minimizeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeIconMouseClicked
        //Minimizing the program to tray

        this.setState(1);

    }//GEN-LAST:event_minimizeIconMouseClicked

    private void minimizeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeIconMouseEntered
        // Changes the color when mouse enters
        operationsPanel.setBackground(new Color(13, 163, 255));
    }//GEN-LAST:event_minimizeIconMouseEntered

    private void minimizeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeIconMouseExited
        // Changes the color when mouse exits
        operationsPanel.setBackground(new Color(253, 204, 125));
    }//GEN-LAST:event_minimizeIconMouseExited

    private void maximizeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeIconMouseClicked
        /**
         * maximizes the program
         */
        if (maximized) {
            BakeryInfoSys.this.setExtendedState(JFrame.MAXIMIZED_BOTH);  //sets the state of Jframe to max in both direction
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment(); // gets total area of the screen
            BakeryInfoSys.this.setMaximizedBounds(env.getMaximumWindowBounds());  //sets the total area of screen as bounds for grame
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_maximizeIconMouseClicked

    private void minimizeIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeIconMousePressed
        // Changes the color when close is pressed
        operationsPanel.setBackground(new Color(255, 127, 39));
    }//GEN-LAST:event_minimizeIconMousePressed

    private void filesMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesMenuMouseEntered
        //Changes the color when mouse enters
        filesMenu.setForeground(Color.WHITE);
        menuBar.setBackground(new Color(238, 170, 55));
    }//GEN-LAST:event_filesMenuMouseEntered

    private void filesMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesMenuMouseExited
        //Changes the color when mouse exits
        filesMenu.setForeground(Color.BLACK);
        menuBar.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_filesMenuMouseExited

    private void editMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuMouseEntered
        //Changes the color when mouse enters

        menuBar.setBackground(new Color(238, 170, 55));
    }//GEN-LAST:event_editMenuMouseEntered

    private void editMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuMouseExited
        //Changes the color when mouse exits
        editMenu.setForeground(Color.BLACK);
        menuBar.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_editMenuMouseExited

    private void fileMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuPanelMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_fileMenuPanelMouseClicked

    private void filesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesMenuMouseClicked
        /**
         * This if else block checks weather the panel certain menu is visible
         * if no it makes the panel visible and Panels in this code are used as
         * drop menu bar if its already visible it sets panel visibility to
         * false Also if other drop menu are visible it closes them
         */
        if (fileMenuCheck) {
            editMenuPanel.setVisible(false);
            helpMenuPanel.setVisible(false);
            fileMenuPanel.setVisible(true);
            fileMenuCheck = false;
            editMenuCheck = true;
            helpMenuCheck = true;
        } else {
            fileMenuPanel.setVisible(false);
            fileMenuCheck = true;

        }
    }//GEN-LAST:event_filesMenuMouseClicked

    private void editMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuMouseClicked
        /**
         * This if else block checks weather the panel certain menu is visible
         * if no it makes the panel visible and Panels in this code are used as
         * drop menu bar if its already visible it sets panel visibility to
         * false Also if other drop menu are visible it closes them
         */
        if (editMenuCheck) {
            helpMenuPanel.setVisible(false);
            fileMenuPanel.setVisible(false);
            editMenuPanel.setVisible(true);
            editMenuCheck = false;
            fileMenuCheck = true;
            helpMenuCheck = true;
        } else {
            editMenuPanel.setVisible(false);
            editMenuCheck = true;
        }
    }//GEN-LAST:event_editMenuMouseClicked

    private void openMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuItemMouseEntered
        //Changes the color when mouse enters

        openMenuItem.setForeground(Color.RED);
    }//GEN-LAST:event_openMenuItemMouseEntered

    private void openMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuItemMouseExited

        //Changes the color when mouse exits
        openMenuItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_openMenuItemMouseExited

    private void openMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuItemMouseClicked
        chooseFiles();  //calling chooseFiles method

    }//GEN-LAST:event_openMenuItemMouseClicked
    /**
     * Validating if the data entered by user is in string or number
     */
    public boolean idValidation(String id) {
        for (int i = 0; i < id.length(); i++) {
            if (Character.isDigit(id.charAt(i))
                    == false) {
                //txtItemNum.setEditable(false);
                return false;
            }
        }
        return true;
    }

    public boolean prepTimeValidation(String time) {
        for (int i = 0; i < time.length(); i++) {
            if (Character.isDigit(time.charAt(i))
                    == false) {
                //txtItemNum.setEditable(false);
                return false;
            }
        }
        return true;
    }

    public boolean priceValidation(String price) {
        for (int i = 0; i < price.length(); i++) {
            if (Character.isDigit(price.charAt(i))
                    == false) {
                //txtItemNum.setEditable(false);
                return false;
            }
        }
        return true;
    }

    private void editMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuPanelMouseClicked

    private void helpMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuPanelMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_helpMenuPanelMouseClicked

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        /**
         * This if else block checks weather the panel certain menu is visible
         * if no it makes the panel visible and Panels in this code are used as
         * drop menu bar if its already visible it sets panel visibility to
         * false Also if other drop menu are visible it closes them
         */
        if (helpMenuCheck) {
            helpMenuPanel.setVisible(true);
            fileMenuPanel.setVisible(false);
            editMenuPanel.setVisible(false);
            editMenuCheck = true;
            fileMenuCheck = true;
            helpMenuCheck = false;
        } else {
            helpMenuPanel.setVisible(false);
            helpMenuCheck = true;
        }
    }//GEN-LAST:event_helpMenuMouseClicked

    private void exitMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMouseEntered
        exitMenuItem.setForeground(Color.RED);
    }//GEN-LAST:event_exitMenuItemMouseEntered

    private void exitMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemMouseClicked

    private void exitMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMouseExited
        exitMenuItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitMenuItemMouseExited

    private void helpMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseEntered
        // TODO add your handling code here:
        helpMenu.setForeground(Color.WHITE);
        menuBar.setBackground(new Color(238, 170, 55));
    }//GEN-LAST:event_helpMenuMouseEntered

    private void helpMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseExited
        // TODO add your handling code here:
        helpMenu.setForeground(Color.BLACK);
        menuBar.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_helpMenuMouseExited

    private void helpUsMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpUsMenuItemMouseEntered
        helpUsMenuItem.setForeground(Color.RED);
    }//GEN-LAST:event_helpUsMenuItemMouseEntered

    private void helpUsMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpUsMenuItemMouseExited
        helpUsMenuItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_helpUsMenuItemMouseExited

    private void aboutMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseEntered
        aboutMenuItem.setForeground(Color.RED);
    }//GEN-LAST:event_aboutMenuItemMouseEntered

    private void aboutMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseExited
        aboutMenuItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_aboutMenuItemMouseExited

    private void helpUsMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpUsMenuItemMouseClicked
        //Opening Help file
//F:\islington\Emerging Programming Platforms and Technologies\CourseWork 1\helpFile.docx
        try {

            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File("helpFile.pdf"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Help file not found", "File missing", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_helpUsMenuItemMouseClicked

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked

        JOptionPane.showMessageDialog(this, "Bakery InfoSys ©\nDeveloped by Aabishkar Aryal & Nishan Timalsina"
                + "                  \nAny unauthorized use or reproduction/copying of this software is stricly prohibited \n This software is developed as part of the coursework assigned by London Metropolitian University to the developers mentions above");
    }//GEN-LAST:event_aboutMenuItemMouseClicked

    private void clearMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMenuItemMouseEntered
        clearMenuItem.setForeground(Color.RED);
    }//GEN-LAST:event_clearMenuItemMouseEntered

    private void clearMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMenuItemMouseExited
        clearMenuItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_clearMenuItemMouseExited

    private void clearMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMenuItemMouseClicked
        clearInputFields(); //calling clear input fields
    }//GEN-LAST:event_clearMenuItemMouseClicked

    private void inputPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPanelMouseExited
        //Changes the color when mouse exits
        nutsYes.setBackground(new Color(253, 204, 125));
        nutNo.setBackground(new Color(253, 204, 125));
        sugarYes.setBackground(new Color(253, 204, 125));
        sugarNo.setBackground(new Color(253, 204, 125));
        inputPanel.setBackground(new Color(253, 204, 125));
    }//GEN-LAST:event_inputPanelMouseExited

    private void inputPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPanelMouseEntered
        //Changes the color when mouse enters
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
        inputPanel.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_inputPanelMouseEntered

    private void searchCatagoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCatagoryBtnActionPerformed

    }//GEN-LAST:event_searchCatagoryBtnActionPerformed

    private void searchCatagoryBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCatagoryBtnMouseReleased
        searchCatagoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnHovered.png")));
    }//GEN-LAST:event_searchCatagoryBtnMouseReleased

    private void searchCatagoryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCatagoryBtnMousePressed
        searchCatagoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnPressed.png")));
    }//GEN-LAST:event_searchCatagoryBtnMousePressed

    private void searchCatagoryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCatagoryBtnMouseExited
        searchCatagoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtn.png")));
    }//GEN-LAST:event_searchCatagoryBtnMouseExited

    private void searchCatagoryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCatagoryBtnMouseEntered
        searchCatagoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnHovered.png")));
    }//GEN-LAST:event_searchCatagoryBtnMouseEntered

    private void searchCatagoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCatagoryBtnMouseClicked
        searchByCatagory();  //calling searchByCatagory method
    }//GEN-LAST:event_searchCatagoryBtnMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearInputFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void clearBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseReleased
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearBtnNormal.png")));
    }//GEN-LAST:event_clearBtnMouseReleased

    private void clearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMousePressed
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearBtnPressed.png")));
    }//GEN-LAST:event_clearBtnMousePressed

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearBtnNormal.png")));
    }//GEN-LAST:event_clearBtnMouseExited

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/clearBtnHovered.png")));
    }//GEN-LAST:event_clearBtnMouseEntered

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        /**
         * This method adds value to the table and also performs various
         * validation functions
         */
        DefaultTableModel model = (DefaultTableModel) contentTable.getModel();

        String nutContains = null;
        String sugarFreeContains = null;
        if (nutsYes.isSelected()) {
            nutContains = nutsYes.getText();
        } else if (nutNo.isSelected()) {
            nutContains = nutNo.getText();
        }
        if (sugarYes.isSelected()) {
            sugarFreeContains = sugarYes.getText();
        } else if (sugarNo.isSelected()) {
            sugarFreeContains = sugarNo.getText();
        }
        // DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
        //model.addRow(new Object[]{txtItemNum.getText(), txtItemName.getText(), categoryBox.getSelectedItem(), itemDescTxt.getText(),
        // priceTxt.getText(), txtPrepTime.getText(), nutContains, sugarFreeContains});

        // valaditing and adding values to the table
        String itemNumValue = txtItemNum.getText();
        String itemNameValue = txtItemName.getText();
        String categoryBoxValue = (String) categoryBox.getSelectedItem();
        String itemDescTxtValue = itemDescTxt.getText();
        String priceValue = priceTxt.getText();
        String prepTime = txtPrepTime.getText();
        checkItemId();
        //validating item id  and price for wrong data type
        if (!idValidation(itemNumValue)) {
            JOptionPane.showMessageDialog(this, "Enter valid id", "Invalid character", JOptionPane.ERROR_MESSAGE);
        } else if (!priceValidation(priceValue)) {
            JOptionPane.showMessageDialog(this, "Enter valid price", "Invalid character", JOptionPane.ERROR_MESSAGE);
        } else if (!prepTimeValidation(prepTime)) {
            JOptionPane.showMessageDialog(this, "Enter valid preperation time", "Invalid character", JOptionPane.ERROR_MESSAGE);
        } else {
            if (itemNumValue.isEmpty() || itemNameValue.isEmpty() || itemDescTxtValue.isEmpty() || priceValue.isEmpty() || prepTime.isEmpty()) {           //validatiing for empty fields
                JOptionPane.showMessageDialog(this, "Please enter the details", "Details missing!!", JOptionPane.ERROR_MESSAGE, null);
            } else {
                if (isItemIdOk) {
                    if (nutContains != null && sugarFreeContains != null) {    //validating for unchecked radio buttons
                        if (categoryBoxValue != "-----") {      //validating for unselected combobox
                            model.addRow(new Object[]{null, null, null, null});// adding new row
                            String[] info = {itemNumValue, itemNameValue, categoryBoxValue, itemDescTxtValue, priceValue, prepTime, nutContains, sugarFreeContains};  //adding values to an array
                            int rowCount = model.getRowCount();
                            int colCount = model.getColumnCount();
                            int nextRow = 0;
                            boolean emptyFlag = false;
                            if (rowCount != 0) {
                                do {
                                    if ((model.getValueAt(nextRow, 0)) != null) {
                                        nextRow++;
                                    } else {
                                        emptyFlag = true;
                                    }
                                } while (nextRow < rowCount && !emptyFlag);
                                for (int i = 0; i < colCount; i++) {
                                    model.setValueAt(info[i], nextRow, i);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Select the catagory please", "Missing detail", JOptionPane.ERROR_MESSAGE, null);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Please select the catagory", "Details missing!!", JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please selects the contains", "Details missing!!", JOptionPane.ERROR_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Id already exists", "Duplicate id", JOptionPane.ERROR_MESSAGE, null);
                }
            }

        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void enterBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseReleased
        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/enterBtnNormal.png")));
    }//GEN-LAST:event_enterBtnMouseReleased

    private void enterBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMousePressed
        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/enterBtnPressed.png")));
    }//GEN-LAST:event_enterBtnMousePressed

    private void enterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseExited
        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/enterBtnNormal.png")));
    }//GEN-LAST:event_enterBtnMouseExited

    private void enterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseEntered
        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/enterBtnHovered.png")));
    }//GEN-LAST:event_enterBtnMouseEntered

    private void sugarNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sugarNoActionPerformed

    private void nutsYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsYesActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

    private void txtPrepTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrepTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrepTimeActionPerformed

    private void txtItemNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNumActionPerformed

    private void searchPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPriceBtnActionPerformed


    }//GEN-LAST:event_searchPriceBtnActionPerformed

    private void searchPriceBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPriceBtnMouseReleased
        searchPriceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnHovered.png")));
    }//GEN-LAST:event_searchPriceBtnMouseReleased

    private void searchPriceBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPriceBtnMousePressed
        //below code sets icon for search Price button while mouse is pressed
        searchPriceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnPressed.png")));
    }//GEN-LAST:event_searchPriceBtnMousePressed

    private void searchPriceBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPriceBtnMouseExited
        //below code sets icon for search Price button while mouse exits
        searchPriceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtn.png")));
    }//GEN-LAST:event_searchPriceBtnMouseExited

    private void searchPriceBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPriceBtnMouseEntered
        // below code sets icon for search Price button while mouse enters
        searchPriceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/searchBtnHovered.png")));
    }//GEN-LAST:event_searchPriceBtnMouseEntered

    private void searchPriceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPriceBtnMouseClicked

        try {
            int enteredValue = Integer.parseInt(searchPrice.getText());
            DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
            int rowCount = model.getRowCount();
            int firstPrice = 0;
            int l = 0;
            int position;
            int secondPrice = 0;
            String[][] list = new String[rowCount][8];
            for (int i = 0; i < rowCount; i++) { //Adds all the value from table to two dimensional array
                for (int j = 0; j < 8; j++) {
                    String getValue = model.getValueAt(i, j).toString();
                    list[i][j] = getValue;
                }
            }
            list = swap(list, firstPrice, secondPrice, rowCount); //calls the swap method

            for (int i = 0; i < list.length; i++) {

            }

            position = binarySearch(list, l, rowCount - 1, enteredValue); //calls the binary search method
            if (position == -1) {
                JOptionPane.showMessageDialog(rootPane, "No search result", "No result found", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(rootPane, "Item no: " + list[position][0] + "\nItem name: " + list[position][1] + "\nCatagory: " + list[position][2] + "\nPrice: " + list[position][4] + "\nPrepration time:" + list[position][5] + "\n" + "ContainNuts: " + list[position][6] + "\nSugar free: " + list[position][7], "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid number", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_searchPriceBtnMouseClicked

    public String[][] swap(String[][] list, int fPrice, int sPrice, int rowValue) {  //sorts the array in ascending order with respect to price
        String[] temp;    
        for (int z = 0; z < rowValue; z++) {
            for (int y = 1; y < (rowValue - z); y++) {
                fPrice = Integer.parseInt(list[y - 1][4]);
                sPrice = Integer.parseInt(list[y][4]);
                if (fPrice > sPrice) {
                    //swap elements  
                    temp = list[y - 1];
                    list[y - 1] = list[y];
                    list[y] = temp;

                }

            }
        }
        return list;
    }
    private void searchCatagoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCatagoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCatagoryComboBoxActionPerformed

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteItem();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/deleteBtnHover.png")));
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/deleteBtnNormal.png")));
    }//GEN-LAST:event_deleteBtnMouseExited

    private void deleteBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMousePressed
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/deleteBtnPressed.png")));
    }//GEN-LAST:event_deleteBtnMousePressed

    private void deleteBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseReleased
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakeryinfosys/images/deleteBtnHover.png")));
    }//GEN-LAST:event_deleteBtnMouseReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void txtItemNumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtItemNumMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_txtItemNumMouseEntered

    private void txtItemNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtItemNameMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_txtItemNameMouseEntered

    private void itemDescTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemDescTxtMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_itemDescTxtMouseEntered

    private void txtPrepTimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrepTimeMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_txtPrepTimeMouseEntered

    private void categoryBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBoxMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_categoryBoxMouseEntered

    private void priceTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceTxtMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));
    }//GEN-LAST:event_priceTxtMouseEntered

    private void nutsYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutsYesMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));

    }//GEN-LAST:event_nutsYesMouseEntered

    private void nutNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutNoMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));

    }//GEN-LAST:event_nutNoMouseEntered

    private void sugarYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugarYesMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));

    }//GEN-LAST:event_sugarYesMouseEntered

    private void sugarNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugarNoMouseEntered
        inputPanel.setBackground(new Color(243, 194, 114));
        nutsYes.setBackground(new Color(243, 194, 114));
        nutNo.setBackground(new Color(243, 194, 114));
        sugarYes.setBackground(new Color(243, 194, 114));
        sugarNo.setBackground(new Color(243, 194, 114));

    }//GEN-LAST:event_sugarNoMouseEntered
    public void clearInputFields() {
        /**
         * method to clear all input field
         */
        txtItemNum.setText("");
        txtItemName.setText("");
        txtPrepTime.setText("");
        nutContains.clearSelection();
        sugarFree.clearSelection();
        categoryBox.setSelectedIndex(0);
        priceTxt.setText("");
        itemDescTxt.setText("");
    }
    /**
     * @param args the command line arguments
     */
    static boolean maximized = false;
    static boolean fileMenuCheck = true;
    static boolean editMenuCheck = true;
    static boolean helpMenuCheck = true;

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BakeryInfoSys.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BakeryInfoSys.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BakeryInfoSys.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BakeryInfoSys.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BakeryInfoSys().setVisible(true);
            }
        });
    }

    public int binarySearch(String[][] list, int l, int size, int price) {

        if (l <= size) {//To find the position of the variable.
            int mid = (l + size) / 2;
            int intMidVal = Integer.parseInt(list[mid][4]);
            if (intMidVal == price) {
                return mid;
            } else if (intMidVal < price) {

                return binarySearch(list, mid + 1, size, price);
            } else {

                return binarySearch(list, l, mid - 1, price);
            }
        }
        return -1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutMenuItem;
    private javax.swing.JTabbedPane additionalPanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel catagoryLbl;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel clearMenuItem;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel companyLogoImage;
    private javax.swing.JLabel companyTitleTop;
    private javax.swing.JTable contentTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel editMenu;
    private javax.swing.JPanel editMenuPanel;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel exitMenuItem;
    private javax.swing.JPanel fileMenuPanel;
    private javax.swing.JLabel filesMenu;
    private javax.swing.JLabel helpMenu;
    private javax.swing.JPanel helpMenuPanel;
    private javax.swing.JLabel helpUsMenuItem;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel itemDescLbl;
    private javax.swing.JTextArea itemDescTxt;
    private javax.swing.JLabel itemNamelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblItemNumber;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel maximizeIcon;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel minimizeIcon;
    private javax.swing.ButtonGroup nutContains;
    private javax.swing.JRadioButton nutNo;
    private javax.swing.JLabel nutsLbl;
    private javax.swing.JRadioButton nutsYes;
    private javax.swing.JLabel openMenuItem;
    private javax.swing.JPanel operationsPanel;
    private javax.swing.JLabel prepTimeLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton searchCatagoryBtn;
    private javax.swing.JComboBox<String> searchCatagoryComboBox;
    private javax.swing.JPanel searchCatagoryLbl;
    private javax.swing.JTabbedPane searchCatagoryPanel;
    private javax.swing.JTextField searchPrice;
    private javax.swing.JButton searchPriceBtn;
    private javax.swing.JLabel searchPriceLbl;
    private javax.swing.ButtonGroup sugarFree;
    private javax.swing.JLabel sugarLbl;
    private javax.swing.JRadioButton sugarNo;
    private javax.swing.JRadioButton sugarYes;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtItemDel;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemNum;
    private javax.swing.JTextField txtPrepTime;
    // End of variables declaration//GEN-END:variables
}
