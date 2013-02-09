/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ait.ffmpegsoundconverter;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ListModel;

/**
 *
 * @author aitkiar
 */
public class SoundConverterMain extends javax.swing.JFrame
{
    private File ultimaCarpeta = null;
    private DefaultListModel<Fichero> ficheros = new DefaultListModel<>();
    
    /**
     * Creates new form SoundConverterMain
     */
    public SoundConverterMain()
    {
        initComponents();
        listaFicheros.setModel( ficheros );
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        listaFicheros = new javax.swing.JList();
        comboFormatos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoDirDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonCambiarDestino = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        botonAñadir = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setViewportView(listaFicheros);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 289;
        gridBagConstraints.ipady = 624;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        comboFormatos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "flac", "mp3", "ogg - vorbis", "wav" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 46, 0, 18);
        getContentPane().add(comboFormatos, gridBagConstraints);

        jLabel1.setText("Convertir A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 46, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Ficheros de Entrada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        textoDirDestino.setMinimumSize(new java.awt.Dimension(200, 24));
        textoDirDestino.setName(""); // NOI18N
        textoDirDestino.setPreferredSize(new java.awt.Dimension(200, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(16, 46, 0, 0);
        getContentPane().add(textoDirDestino, gridBagConstraints);

        jLabel3.setText("Destino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        botonCambiarDestino.setText("Cambiar");
        botonCambiarDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonCambiarDestinoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(13, 28, 0, 18);
        getContentPane().add(botonCambiarDestino, gridBagConstraints);

        jButton4.setText("Convertir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(28, 46, 0, 18);
        getContentPane().add(jButton4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 46, 0, 18);
        getContentPane().add(barraProgreso, gridBagConstraints);

        jLabel4.setText("Progreso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 46, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        panelBotones.setLayout(new java.awt.GridBagLayout());

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonAñadirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        panelBotones.add(botonAñadir, gridBagConstraints);

        botonQuitar.setText("Quitar");
        botonQuitar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonQuitarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        panelBotones.add(botonQuitar, gridBagConstraints);

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        panelBotones.add(botonLimpiar, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelBotones.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(panelBotones, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Añade nuevos ficheros a la lista de ficheros a convertir. Si se añaden ficheros, se actualiza el valor de la
     * variable interna de la clase ultimaCarpeta, para empezar por esta carpeta la siguiente vez que se abra el
     * selector de ficheros.
     * 
     * @param evt 
     */
    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        // TODO add your handling code here:
        JFileChooser selector = new JFileChooser();
        if ( ultimaCarpeta != null )
        {
            selector.setCurrentDirectory( ultimaCarpeta );
        }
        selector.setMultiSelectionEnabled( true );
        selector.setFileSelectionMode( JFileChooser.FILES_ONLY );
        selector.showOpenDialog( this );
        File[] seleccionados = selector.getSelectedFiles();
        if ( seleccionados != null && seleccionados.length > 0 )
        {
            ultimaCarpeta = seleccionados[0].getParentFile();
            for ( int i = 0; i < seleccionados.length; i++ )
            {
                ficheros.addElement( new Fichero( seleccionados[i]) );
            }
        }
        listaFicheros.revalidate();
    }//GEN-LAST:event_botonAñadirActionPerformed

    /** Elimina los ficheros seleccionados de la lista de ficheros.
     * 
     * @param evt 
     */
    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonQuitarActionPerformed
    {//GEN-HEADEREND:event_botonQuitarActionPerformed
        // TODO add your handling code here:
        int[] seleccionados = listaFicheros.getSelectedIndices();
        if ( seleccionados != null && seleccionados.length > 0 )
        {
            for( int i = seleccionados.length -1; i >= 0; i -- )
            {
                ficheros.remove( seleccionados[i] );
            }
        }
        listaFicheros.revalidate();
    }//GEN-LAST:event_botonQuitarActionPerformed

    /** Elimina todo el contenido de la lista de ficheros para converitr.
     * 
     * @param evt 
     */
    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonLimpiarActionPerformed
    {//GEN-HEADEREND:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        ficheros.clear();
        listaFicheros.revalidate();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    /** Cambia la carpeta en la que se dejaran los archivos convertidos.
     * 
     * @param evt 
     */
    private void botonCambiarDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonCambiarDestinoActionPerformed
    {//GEN-HEADEREND:event_botonCambiarDestinoActionPerformed
        // TODO add your handling code here:
        JFileChooser selector = new JFileChooser();
        if ( !"".equals( textoDirDestino.getText().trim() ))
        {
            selector.setCurrentDirectory( new File( textoDirDestino.getText().trim()));
        }
        selector.setMultiSelectionEnabled( false );
        selector.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        selector.showOpenDialog( this );
        File seleccionado = selector.getSelectedFile();
        if ( seleccionado != null )
        {
            textoDirDestino.setText( seleccionado.getAbsolutePath() );
        }
    }//GEN-LAST:event_botonCambiarDestinoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] )
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() )
            {
                if ( "Nimbus".equals( info.getName() ) )
                {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        } catch ( ClassNotFoundException ex )
        {
            java.util.logging.Logger.getLogger( SoundConverterMain.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex )
        {
            java.util.logging.Logger.getLogger( SoundConverterMain.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex )
        {
            java.util.logging.Logger.getLogger( SoundConverterMain.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger( SoundConverterMain.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            public void run()
            {
                new SoundConverterMain().setVisible( true );
            }
        } );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCambiarDestino;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JComboBox comboFormatos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaFicheros;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTextField textoDirDestino;
    // End of variables declaration//GEN-END:variables
}