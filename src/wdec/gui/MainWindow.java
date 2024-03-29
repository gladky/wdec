/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wdec.gui;

import javax.swing.plaf.SliderUI;


import wdec.decision_utils.DataIn;
import wdec.decision_utils.DataOut;
import wdec.decision_utils.DecisionUtils;
import wdec.decision_utils.Stage;

/**
 *
 * @author gladky
 */
public class MainWindow extends javax.swing.JFrame {

	Stage stage;
	DecisionUtils decUt;
	
    /**
     * Creates new form main
     */
    public MainWindow() {
        
        System.out.println("creating new stage");
		decUt = new DecisionUtils();
		//stage = decUt.newStage(new DataIn(1.0, 1.0, 1.0));
		stage = decUt.newStage(new DataIn(300000.0,0.0,20.0));
		
		// if(stage == null) System.out.println("du");
		
		initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	chart = new Chart();
    	
		// DataIn dataIn = new DataIn(20000,1000,10);
    	
    	chart.setModel(stage);
    	
    	chart.setBackground(new java.awt.Color(254, 254, 254));
        chart.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Parametry wejściowe");

        jLabel9.setText("gotowka");

        jLabel10.setText("przychody z odsprzedaży");

        jLabel13.setText("udział w rynku");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        jTextField11.setText("jTextField11");

        jButton1.setText("Znajdź rozwiązania");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);


            }
        });
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Stałe");

        jLabel15.setText("max kredyt");

        jLabel16.setText("oprocentowanie kredytu");

        jLabel17.setText("max zdolność produkcyjna");

        jTextField12.setText("jTextField11");

        jTextField13.setText("jTextField10");

        jTextField14.setText("jTextField9");

        jButton2.setText("Wprowadź stałe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
        jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
                .addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addGap(10,
																												10,
																												10)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel16)
																														.addComponent(
																																jLabel15)
																														.addComponent(
																																jLabel17))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jTextField13)
																														.addComponent(
																																jTextField12)
																														.addComponent(
																																jTextField14,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																65,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addComponent(
																								jLabel14,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								189,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
														.addComponent(
																jTextField14,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
														.addComponent(
																jTextField13,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
        jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
                .addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																197,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				189,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addGap(10,
																								10,
																								10)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jLabel10)
																										.addComponent(
																												jLabel9)
																										.addComponent(
																												jLabel13))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												jTextField10)
																										.addComponent(
																												jTextField11)
																										.addComponent(
																												jTextField9)))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addComponent(jPanel4,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
														.addComponent(
																jTextField9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
														.addComponent(
																jTextField10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Wykres");
        
        //////////////
       // jPanel5.setLayout(jPanel5Layout);
		// jPanel5.addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE,
		// 600, javax.swing.GroupLayout.PREFERRED_SIZE)
       // chart.repaint();
        //////////////

		// javax.swing.GroupLayout jPanel5Layout = new
		// javax.swing.GroupLayout(jPanel5);
       
       // jPanel5Layout.setHorizontalGroup(
       //     jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       //     .addGap(0, 0, Short.MAX_VALUE)
       // );
       // jPanel5Layout.setVerticalGroup(
      //      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       //     .addGap(0, 230, Short.MAX_VALUE)
        //);
        
        //output -> jPanel5
        //outputLayout -> jPanel5Layout
        
		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
        jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
                        .addContainerGap()
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								chart,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								600,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
                              .addContainerGap()))
																		.addContainerGap(
																				12,
																				Short.MAX_VALUE)))));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
                .addContainerGap()
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												chart,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												400,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)));
        
        chart.repaint();
        
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
        jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jSlider1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
                        .addContainerGap()
																		.addComponent(
																				jLabel18,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				189,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addComponent(
																jPanel5,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSlider1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

        jTextField1.setText("jTextField1");

        jLabel1.setText("cena");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Parametry wyjściowe");

        jLabel4.setText("jakość");

        jLabel5.setText("wolumen");

        jLabel6.setText("reklama TV");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel7.setText("reklama internet");

        jLabel8.setText("reklama gazety");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jLabel11.setText("kredyt");

        jLabel12.setText("spłacana rata");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
        jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
                        .addContainerGap()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				164,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(73,
																				73,
																				73)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel5))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jLabel7))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel11))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												jLabel12))
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(181, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel1))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(78, 78, 78)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
        getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
        
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
		Stage stage2 = decUt.newStage(new DataIn(Double
				.parseDouble(jTextField9.getText()), Double
				.parseDouble(jTextField10.getText()), Double
				.parseDouble(jTextField11.getText())));
		this.stage = stage2;
		chart.setModel(stage2);
		System.out.println(stage2.findBestData(50).getResult());
		//System.out.print(decUt.getStage(2).findBestData(50).getResult());
		
    	chart.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
    	int ryzyko = (int) jSlider1.getValue();
		chart.updateRyzyko(ryzyko);
		chart.repaint();
		updateOutput(ryzyko);
    }  
    private void updateOutput(int ryzyko)
	{
    	DataOut r = stage.findBestData(ryzyko);
		if (r == null)
		{
			return;
		}
		jTextField1.setText(String.valueOf(r.getPrice()));
		jTextField2.setText(String.valueOf(r.getQuality()));
		jTextField3.setText(String.valueOf(r.getQuantity()));
		jTextField4.setText(String.valueOf(r.getTelevision()));
		jTextField5.setText(String.valueOf(r.getInternet()));
		jTextField6.setText(String.valueOf(r.getMagazines()));
		jTextField7.setText("not yet implemented");
		jTextField8.setText("not yet implemented");
		//jakosc.setValue(r.getJakosc());
		//cenaSprzedazy.setValue(r.getCena());
		//int reklama = (int)r.getReklama();
        //        int[] podzialReklamy = Funkcje.pieniadzeNaReklame(reklama);
        //        reklamaInternetowa.setValue(podzialReklamy[1]);
       //         reklamaTelewizyjna.setValue(podzialReklamy[0]);
        //        reklamaWPrasie.setValue(podzialReklamy[2]);
		//kredyt.setValue(r.getKredyt());
		//zysk.setValue(r.getZysk());
	}

    /**
	 * @param args
	 *            the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
    private Chart chart;
}
