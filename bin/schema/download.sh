#!/bin/sh

if [ "$1" = "clean" ]; then
    echo "Remove Schema files"
    rm *.xsd
    rm -rf schema
    rm AUTOSAR_MMOD_XMLSchema.zip*
else
    echo "Download AUTOSAR Schema..."
    wget --no-check-certificate https://www.autosar.org/fileadmin/standards/R4.0.3/CP/AUTOSAR_MMOD_XMLSchema.zip
    mkdir schema && unzip AUTOSAR_MMOD_XMLSchema.zip -d schema
    cp schema/*.xsd .
fi
