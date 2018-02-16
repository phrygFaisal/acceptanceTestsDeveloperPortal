package fyber.acceptenceTests

import java.io.FileInputStream
import java.io.IOException
import java.util.*




    object AcceptanceTestsDeveloperPortalUtility {

        private var properties: Properties? = null

        private var pageProperties:Properties?=null

        fun loadProperties(): Unit {
            try {
                properties = Properties()
                properties?.load(FileInputStream("config.properties"))
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        fun getProperties(properties: String): String {
            loadProperties()
            return AcceptanceTestsDeveloperPortalUtility.properties?.getProperty(properties).toString()
        }


    }

