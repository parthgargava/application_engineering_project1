/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import business.EducationDetails;
import business.PersonalDetails;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Parth
 */
public class CreatePanel1 extends javax.swing.JPanel {

    private EducationDetails education;
    private PersonalDetails personal;

    public CreatePanel1(EducationDetails education, PersonalDetails personal) {
        initComponents();
        this.education = education;
        this.personal = personal;

        //I have HIDDEN 4 textfields by default so that if user has just one degree then the textfields need not be displayed
        degree2TextField.setVisible(false);
        college2TextField.setVisible(false);
        major2TextField.setVisible(false);
        year2TextField.setVisible(false);
        CreatePanel1.this.revalidate();
        CreatePanel1.this.repaint();  //repainting was required for new changes to reflect on JPane

    }
    
    public void isNumerics (String string) //throws IllegalArgumentException
{
	boolean isnumeric=true;
char chars[]=string.toCharArray();
for(int i=0;i<chars.length;i++)
{
	isnumeric = Character.isDigit(chars[i]);
	if(!isnumeric)
	break;

	}
if(isnumeric==false)
JOptionPane.showMessageDialog(null, string + "is not a number! Please put a valid input!");
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberDegreeButtonGroup = new javax.swing.ButtonGroup();
        genderButtonGroup = new javax.swing.ButtonGroup();
        nationalityButtonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        fnameTextField = new javax.swing.JTextField();
        mailTextField = new javax.swing.JTextField();
        lnameTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        mobileTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nonUSRadioButton = new javax.swing.JRadioButton();
        USRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        collegeTextField = new javax.swing.JTextField();
        degreeTextField = new javax.swing.JTextField();
        majorTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        degree2TextField = new javax.swing.JTextField();
        college2TextField = new javax.swing.JTextField();
        major2TextField = new javax.swing.JTextField();
        year2TextField = new javax.swing.JTextField();
        radio2Button = new javax.swing.JRadioButton();
        radio1Button = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        affiliationTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        academicTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        careerTextArea = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        signTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cCheckBox = new javax.swing.JCheckBox();
        javaCheckBox = new javax.swing.JCheckBox();
        pythonCheckBox = new javax.swing.JCheckBox();
        phpCheckBox = new javax.swing.JCheckBox();
        aspCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mobile No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("City");

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("State");

        uploadButton.setBackground(new java.awt.Color(51, 153, 0));
        uploadButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadButton.setText("Upload (.JPG)");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        fnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTextFieldActionPerformed(evt);
            }
        });

        mailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextFieldActionPerformed(evt);
            }
        });

        lnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTextFieldActionPerformed(evt);
            }
        });

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        mobileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTextFieldActionPerformed(evt);
            }
        });

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("ZIP CODE");

        zipTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipTextFieldActionPerformed(evt);
            }
        });

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderButtonGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Gender");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Nationality");

        nationalityButtonGroup.add(nonUSRadioButton);
        nonUSRadioButton.setText("Non US citizen");
        nonUSRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonUSRadioButtonActionPerformed(evt);
            }
        });

        nationalityButtonGroup.add(USRadioButton);
        USRadioButton.setText("US citizen");
        USRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USRadioButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Education Qualifications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Number of degrees");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Degree");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("College/School");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Major");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Year of graduation");

        degreeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeTextFieldActionPerformed(evt);
            }
        });

        degree2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree2TextFieldActionPerformed(evt);
            }
        });

        numberDegreeButtonGroup.add(radio2Button);
        radio2Button.setText("2");
        radio2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ButtonActionPerformed(evt);
            }
        });

        numberDegreeButtonGroup.add(radio1Button);
        radio1Button.setText("1");
        radio1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Affiliation");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Career Objective");

        academicTextArea.setColumns(20);
        academicTextArea.setRows(5);
        jScrollPane1.setViewportView(academicTextArea);

        careerTextArea.setColumns(20);
        careerTextArea.setRows(5);
        jScrollPane2.setViewportView(careerTextArea);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Academic Projects");

        createButton.setBackground(new java.awt.Color(0, 153, 0));
        createButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("CREATE NOW!");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("DIGITAL SIGNATURE");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Programming skills");

        cCheckBox.setText("C/C++");
        cCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCheckBoxActionPerformed(evt);
            }
        });

        javaCheckBox.setText("Java");

        pythonCheckBox.setText("Python");

        phpCheckBox.setText("PHP");

        aspCheckBox.setText("ASP.NET");
        aspCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(degreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(collegeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(college2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(major2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(radio1Button)
                        .addGap(18, 18, 18)
                        .addComponent(radio2Button)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40)
                        .addComponent(affiliationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(degree2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(javaCheckBox)
                        .addGap(55, 55, 55)
                        .addComponent(cCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(pythonCheckBox)
                        .addGap(26, 26, 26)
                        .addComponent(phpCheckBox)
                        .addGap(29, 29, 29)
                        .addComponent(aspCheckBox))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(createButton))))
                    .addComponent(jLabel15))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(affiliationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(radio1Button)
                        .addComponent(radio2Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collegeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degree2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(college2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(major2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(year2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cCheckBox)
                        .addComponent(pythonCheckBox)
                        .addComponent(phpCheckBox)
                        .addComponent(aspCheckBox))
                    .addComponent(javaCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobileTextField)
                            .addComponent(addressTextField)
                            .addComponent(cityTextField)
                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lnameTextField)
                                .addComponent(mailTextField)
                                .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(USRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nonUSRadioButton)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton)
                            .addComponent(jLabel19))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(nonUSRadioButton)
                            .addComponent(USRadioButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed

        JFileChooser chooser = new JFileChooser(); //gives user the option of choosing from his System
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg"); //filter to allow only JPG files
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            ImageIcon image = new ImageIcon(file.getAbsolutePath());

            Rectangle rect = imageLabel.getBounds(); //Scaling image in the right height, and width

            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);

            image = new ImageIcon(scaledImage);

            imageLabel.setIcon(image);

            personal.setImage((ImageIcon) imageLabel.getIcon());
        } else {
            JOptionPane.showMessageDialog(null, "Please use only JPG files"); //if User doesn't use JPG files
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void fnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTextFieldActionPerformed

    private void mailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextFieldActionPerformed

    private void lnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void mobileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextFieldActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void zipTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextFieldActionPerformed

    private void nonUSRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonUSRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nonUSRadioButtonActionPerformed

    private void USRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USRadioButtonActionPerformed

    private void degreeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeTextFieldActionPerformed

    }//GEN-LAST:event_degreeTextFieldActionPerformed

    private void degree2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree2TextFieldActionPerformed

    private void radio2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ButtonActionPerformed
        degree2TextField.setVisible(true); //if degree number is 2 then textfields will be set Visible
        college2TextField.setVisible(true);
        major2TextField.setVisible(true);
        year2TextField.setVisible(true);
        CreatePanel1.this.revalidate();
        CreatePanel1.this.repaint();
    }//GEN-LAST:event_radio2ButtonActionPerformed

    private void radio1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ButtonActionPerformed

        degree2TextField.setVisible(false);
        college2TextField.setVisible(false);
        major2TextField.setVisible(false);
        year2TextField.setVisible(false);
        CreatePanel1.this.revalidate();
        CreatePanel1.this.repaint();
    }//GEN-LAST:event_radio1ButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        personal.setFname(fnameTextField.getText());
        personal.setLname(lnameTextField.getText());

        String m=mobileTextField.getText();

        isNumerics(m);

        personal.setMob(mobileTextField.getText());
        personal.setAddress(addressTextField.getText());
        personal.setMail(mailTextField.getText());
        personal.setCity(cityTextField.getText());
        personal.setState((String) stateComboBox.getSelectedItem());
        personal.setZip(zipTextField.getText());
        if(maleRadioButton.isSelected())
        {
            personal.setGender(maleRadioButton.getText());
        }
        else personal.setGender(femaleRadioButton.getText());
        if(USRadioButton.isSelected())
        {personal.setNationality(USRadioButton.getText()); }
        else
        personal.setNationality(nonUSRadioButton.getText());

        education.setAffiliation(affiliationTextField.getText());
        education.setDegree1(degreeTextField.getText());
        education.setCollege1(collegeTextField.getText());
        education.setMajor1(majorTextField.getText());
        education.setYear1(yearTextField.getText());
        education.setSignature(signTextField.getText());
        education.setDegree2(degree2TextField.getText());
        education.setCollege2(college2TextField.getText());
        education.setMajor2(major2TextField.getText());
        education.setYear2(year2TextField.getText());
        education.setProjects(academicTextArea.getText());
        education.setCareerobjective(careerTextArea.getText());

        String tempString="";
        if(javaCheckBox.isSelected())
        {
            tempString=javaCheckBox.getText();
        }

        if(cCheckBox.isSelected())
        {
            tempString=tempString+"  "+cCheckBox.getText();
        }
        if(pythonCheckBox.isSelected())
        {
            tempString=tempString+"  "+pythonCheckBox.getText();
        }
        if(phpCheckBox.isSelected())
        {
            tempString=tempString+"  "+phpCheckBox.getText();
        }
        if(aspCheckBox.isSelected())
        {
            tempString=tempString+"  "+aspCheckBox.getText();
        }

        education.setProgramming(tempString);

        if (radio1Button.isSelected()) {
            education.setNumberdegrees(radio1Button.getText());
        } else {
            education.setNumberdegrees(radio2Button.getText());
        }

        JOptionPane.showMessageDialog(null, "Resume entry created!");

    }//GEN-LAST:event_createButtonActionPerformed

    private void cCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCheckBoxActionPerformed

    private void aspCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aspCheckBoxActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton USRadioButton;
    private javax.swing.JTextArea academicTextArea;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField affiliationTextField;
    private javax.swing.JCheckBox aspCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cCheckBox;
    private javax.swing.JTextArea careerTextArea;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField college2TextField;
    private javax.swing.JTextField collegeTextField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField degree2TextField;
    private javax.swing.JTextField degreeTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox javaCheckBox;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JTextField major2TextField;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.ButtonGroup nationalityButtonGroup;
    private javax.swing.JRadioButton nonUSRadioButton;
    private javax.swing.ButtonGroup numberDegreeButtonGroup;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JCheckBox phpCheckBox;
    private javax.swing.JCheckBox pythonCheckBox;
    private javax.swing.JRadioButton radio1Button;
    private javax.swing.JRadioButton radio2Button;
    private javax.swing.JTextField signTextField;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JButton uploadButton;
    private javax.swing.JTextField year2TextField;
    private javax.swing.JTextField yearTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
