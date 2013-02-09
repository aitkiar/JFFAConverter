/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ait.ffmpegsoundconverter;

import java.io.File;

/**
 *
 * @author aitkiar
 */
public class Fichero 
{
    protected File origen;
    protected File destino;
    protected String carpetaDestino;
    
    
    public Fichero ( File origen )
    {
        this.origen = origen;
    }
    
    public void setCarpetaDestino( String carpetaDestino )
    {
        this.carpetaDestino = carpetaDestino;
    }
    
    public String getCarpString()
    {
        return this.carpetaDestino;
    }
    
    public File getDestino( String nuevoFormato )
    {
        if ( destino != null )
        {
            return destino;
        }
        
        String nombreFichero = origen.getName();
        nombreFichero = nombreFichero.substring(0, nombreFichero.lastIndexOf(".")) + "." + nuevoFormato;
        
        if ( carpetaDestino != null )
        {
            destino = new File( carpetaDestino + File.pathSeparator + nombreFichero );
        }
        else
        {
            destino = new File ( origen.getParent() + File.pathSeparator + nombreFichero );
        }
        
        return destino;
    }
    
    public void setDestino( File destino )
    {
        this.destino = destino;
    }
    
    @Override
    public String toString()
    {
        if ( origen == null )
        {
            return "";
        }
        return origen.getName();
    }
}
