/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.core.service;

/**
 * Encapsulate access to the news texts.
 *
 * @author mhwood
 */
public interface NewsService {

    /**
     * Reads news from a text file.
     *
     * @param newsFile
     *        name of the news file to read in, relative to the news file path.
     */
    public String readNewsFile(String newsFile);

    /**
     * Writes news to a text file.
     *
     * @param newsFile
     *        name of the news file to read in, relative to the news file path.
     * @param news
     *            the text to be written to the file.
     */
    public String writeNewsFile(String newsFile, String news);

    /**
     * Get the path for the news files.
     *
     */
    public String getNewsFilePath();
}
