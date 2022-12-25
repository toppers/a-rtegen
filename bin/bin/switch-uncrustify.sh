#!/bin/sh

## switch-uncrustify.sh

SCRIPT_DIR=$(cd $(dirname $0); pwd)

# echo $SCRIPT_DIR
# echo "args = "$#
# echo "args2 = "$1

if [ $# = 1 ]; then
    if [ "$1" = "win" ]; then
        echo "cp -f $SCRIPT_DIR/win/uncrustify.exe $SCRIPT_DIR/uncrustify.exe"
        cp -f $SCRIPT_DIR/win/uncrustify.exe $SCRIPT_DIR/uncrustify.exe
    elif [ "$1" = "linux" ]; then
        echo "cp -f $SCRIPT_DIR/linux/uncrustify $SCRIPT_DIR/uncrustify.exe"
        cp -f $SCRIPT_DIR/linux/uncrustify $SCRIPT_DIR/uncrustify.exe
    else
        echo "switch-uncrustify.sh [win|linux]"
        exit 1
    fi
else
    echo "switch-uncrustify.sh [win|linux]"
    exit 1
fi

echo "switch-uncrustify.sh done"
