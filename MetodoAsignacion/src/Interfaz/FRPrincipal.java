/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FRPrincipal.java
 *
 * Created on Nov 7, 2011, 10:23:13 PM
 */

package Interfaz;

import Negocio.UI.UIAsignacion;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marco
 */
public class FRPrincipal extends javax.swing.JFrame {

    /** Creates new form FRPrincipal */
    private UIAsignacion uiAsignacion = new UIAsignacion();


    public FRPrincipal() {
        initComponents();
        btnSolucionOptima.setVisible(false);
        setSize(592, 90);
        setLocationRelativeTo(this);
    }

    public JButton getBtnResolver() {
        return btnResolver;
    }

    public void setBtnResolver(JButton btnResolver) {
        this.btnResolver = btnResolver;
    }

    public JLabel getLblColumnas() {
        return lblColumnas;
    }

    public void setLblColumnas(JLabel lblColumnas) {
        this.lblColumnas = lblColumnas;
    }

    public JLabel getLblFilas() {
        return lblFilas;
    }

    public void setLblFilas(JLabel lblFilas) {
        this.lblFilas = lblFilas;
    }

    public JLabel getLblInfoIngresar() {
        return lblInfoIngresar;
    }

    public void setLblInfoIngresar(JLabel lblInfoIngresar) {
        this.lblInfoIngresar = lblInfoIngresar;
    }

    public JPanel getPnlFondo() {
        return pnlFondo;
    }

    public void setPnlFondo(JPanel pnlFondo) {
        this.pnlFondo = pnlFondo;
    }

    public JPanel getPnlHeader() {
        return pnlHeader;
    }

    public void setPnlHeader(JPanel pnlHeader) {
        this.pnlHeader = pnlHeader;
    }

    public JPanel getPnlSolucion() {
        return pnlSolucion;
    }

    public void setPnlSolucion(JPanel pnlSolucion) {
        this.pnlSolucion = pnlSolucion;
    }

    public JScrollPane getScrSolucion() {
        return scrSolucion;
    }

    public void setScrSolucion(JScrollPane scrSolucion) {
        this.scrSolucion = scrSolucion;
    }

    public JScrollPane getScrTablaCostos() {
        return scrTablaCostos;
    }

    public void setScrTablaCostos(JScrollPane scrTablaCostos) {
        this.scrTablaCostos = scrTablaCostos;
    }

    public JTable getTablaCostos() {
        return tablaCostos;
    }

    public void setTablaCostos(JTable tablaCostos) {
        this.tablaCostos = tablaCostos;
    }

    public JTextField getTxtColumnas() {
        return txtColumnas;
    }

    public void setTxtColumnas(JTextField txtColumnas) {
        this.txtColumnas = txtColumnas;
    }

    public JTextField getTxtFilas() {
        return txtFilas;
    }

    public void setTxtFilas(JTextField txtFilas) {
        this.txtFilas = txtFilas;
    }

    public JTextArea getTxtSolucion() {
        return txtSolucion;
    }

    public void setTxtSolucion(JTextArea txtSolucion) {
        this.txtSolucion = txtSolucion;
    }

    public UIAsignacion getUiAsignacion() {
        return uiAsignacion;
    }

    public void setUiAsignacion(UIAsignacion uiAsignacion) {
        this.uiAsignacion = uiAsignacion;
    }

    public JButton getBtnSolucionOptima() {
        return btnSolucionOptima;
    }

    public void setBtnSolucionOptima(JButton btnSolucionOptima) {
        this.btnSolucionOptima = btnSolucionOptima;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        scrTablaCostos = new javax.swing.JScrollPane();
        tablaCostos = new javax.swing.JTable();
        pnlHeader = new javax.swing.JPanel();
        lblFilas = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        lblColumnas = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        btnSolucionOptima = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        lblInfoIngresar = new javax.swing.JLabel();
        pnlSolucion = new javax.swing.JPanel();
        scrSolucion = new javax.swing.JScrollPane();
        txtSolucion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Asignación");
        setResizable(false);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        tablaCostos.setFont(new java.awt.Font("Tahoma", 0, 14));
        tablaCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Columna 1", "Columna 2", "Columna 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrTablaCostos.setViewportView(tablaCostos);
        tablaCostos.getColumnModel().getColumn(0).setResizable(false);
        tablaCostos.getColumnModel().getColumn(1).setResizable(false);
        tablaCostos.getColumnModel().getColumn(2).setResizable(false);
        tablaCostos.getColumnModel().getColumn(3).setResizable(false);

        pnlHeader.setBackground(new java.awt.Color(102, 0, 0));

        lblFilas.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12));
        lblFilas.setForeground(new java.awt.Color(255, 255, 255));
        lblFilas.setText("# Filas:");

        txtFilas.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtFilas.setText("0");

        lblColumnas.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12));
        lblColumnas.setForeground(new java.awt.Color(255, 255, 255));
        lblColumnas.setText("# Columnas:");

        txtColumnas.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtColumnas.setText("0");

        btnSolucionOptima.setBackground(new java.awt.Color(255, 255, 255));
        btnSolucionOptima.setFont(new java.awt.Font("Comic Sans MS", 0, 10));
        btnSolucionOptima.setText("Solucion Optima");
        btnSolucionOptima.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnSolucionOptima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionOptimaActionPerformed(evt);
            }
        });

        btnResolver.setBackground(new java.awt.Color(255, 255, 255));
        btnResolver.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        btnResolver.setText("Resolver");
        btnResolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSolucionOptima, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolucionOptima, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblInfoIngresar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12));
        lblInfoIngresar.setText("Ingrese el costo correspondiente a cada celda seguido del boton \"Enter\".");

        pnlSolucion.setBackground(new java.awt.Color(255, 255, 255));

        txtSolucion.setColumns(20);
        txtSolucion.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12));
        txtSolucion.setForeground(new java.awt.Color(51, 51, 51));
        txtSolucion.setRows(5);
        txtSolucion.setBorder(null);
        txtSolucion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSolucion.setEnabled(false);
        scrSolucion.setViewportView(txtSolucion);

        javax.swing.GroupLayout pnlSolucionLayout = new javax.swing.GroupLayout(pnlSolucion);
        pnlSolucion.setLayout(pnlSolucionLayout);
        pnlSolucionLayout.setHorizontalGroup(
            pnlSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSolucionLayout.setVerticalGroup(
            pnlSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTablaCostos, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrTablaCostos, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        uiAsignacion.resolver(this);
    }//GEN-LAST:event_btnResolverActionPerformed

    private void btnSolucionOptimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionOptimaActionPerformed
        uiAsignacion.calcularSolOptima(this);
    }//GEN-LAST:event_btnSolucionOptimaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResolver;
    private javax.swing.JButton btnSolucionOptima;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblFilas;
    private javax.swing.JLabel lblInfoIngresar;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlSolucion;
    private javax.swing.JScrollPane scrSolucion;
    private javax.swing.JScrollPane scrTablaCostos;
    private javax.swing.JTable tablaCostos;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextArea txtSolucion;
    // End of variables declaration//GEN-END:variables

}
