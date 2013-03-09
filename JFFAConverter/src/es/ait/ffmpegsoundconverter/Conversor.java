/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ait.ffmpegsoundconverter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingWorker;

/** Formatos de salida:
 * 0 --> flac
 * 1 --> mp3
 * 2 --> ogg/vorbis
 * 3 --> wav
 *
 * @author aitkiar
 */
public class Conversor extends SwingWorker<Object, Object>
{

    protected DefaultListModel<Fichero> ficheros;
    protected int formatoSalida = -1;
    protected String directorioSalida;
    
    protected String[] codec =
    {
        null,
        null
    };
    
    protected String[] extension = 
    {
        "flac",
        "mp3"
    };

    /**
     * @return the ficheros
     */
    public DefaultListModel<Fichero> getFicheros()
    {
        return ficheros;
    }

    /**
     * @param ficheros the ficheros to set
     */
    public void setFicheros( DefaultListModel<Fichero> ficheros )
    {
        this.ficheros = ficheros;
    }

    /**
     * @return the formatoSalida
     */
    public int getFormatoSalida()
    {
        return formatoSalida;
    }

    /**
     * @param formatoSalida the formatoSalida to set
     */
    public void setFormatoSalida( int formatoSalida )
    {
        this.formatoSalida = formatoSalida;
    }

    /**
     * @return the directorioSalida
     */
    public String getDirectorioSalida()
    {
        return directorioSalida;
    }

    /**
     * @param directorioSalida the directorioSalida to set
     */
    public void setDirectorioSalida( String directorioSalida )
    {
        this.directorioSalida = directorioSalida;
    }

    public void convertir() throws Exception
    {
        if ( ficheros == null )
        {
            throw new Exception( "Ningún fichero para convertir." );
        }

        if ( formatoSalida == -1 )
        {
            throw new Exception( "No se ha indicado ningún formato de salida." );
        }

        for ( int i = 0; i < ficheros.getSize(); i++ )
        {
            if ( directorioSalida != null )
            {
                ficheros.get( i ).setCarpetaDestino( directorioSalida );
            }
            List<String> comando = new ArrayList<String>();
            comando.add( "ffmpeg" );
            if ( codec[ formatoSalida] != null )
            {
                comando.add( "-acodec" );
                comando.add( codec[formatoSalida] );
            }
            comando.add("-i");
            comando.add( ficheros.get( i ).origen.getAbsolutePath());  
            comando.add( ficheros.get( i ).getDestino( extension[formatoSalida] ).getAbsolutePath());
            Process process = Runtime.getRuntime().exec( comando.toArray( new String[comando.size()]) );
            BufferedReader in = new BufferedReader( new InputStreamReader( process.getErrorStream()) );

            // Al leer ambos buffers, se obliga a que no se lance más de una conversión a la vez.
            String linea = "";
            while ( ( linea = in.readLine()) != null )
            {
            }
            in.close();
            in = new BufferedReader( new InputStreamReader( process.getInputStream()) );
            linea = "";
            while ( ( linea = in.readLine()) != null )
            {
            }
            
            // Actualizamos el progreso.
            setProgress( i + 1 );
        }
    }

    @Override
    protected Object doInBackground() throws Exception
    {
        convertir();
        return null;
    }
}
