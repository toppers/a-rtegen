#!/bin/bash
BASEDIR=$(dirname "$0")
PLATFORM_NAME=$(uname -o)

if [ "$PLATFORM_NAME" = "Cygwin" ]; then
	BASEDIR=$(cygpath -m "$BASEDIR")
	array=()
	for arg in "$@"
	do
		TMP_ARG_VALUE=${arg}
		echo ${arg} | grep "^\-" > /dev/null
		if [ $? -ne 0 ]; then
			echo ${arg} | grep "^\/cygdrive" > /dev/null
			if [ $? -eq 0 ]; then
				TMP_ARG_VALUE=$(cygpath -m "$arg")
			fi
		fi
		array+=("$TMP_ARG_VALUE")
	done

	set "0"		#最初の引数に"--"が入っていた場合,setのオプションとして読み込まれる為"0"を設定.
	for i in "${array[@]}"
	do
		set "$@" "$i"
	done
	shift		#"0"をクリア.
fi

java -cp "$BASEDIR/../lib/*" -DA_RTE_HOME="$BASEDIR/.." -Djava.util.logging.config.file="$BASEDIR/logging.properties" jp.ac.nagoya_u.is.nces.a_rte.app.RteGeneratorApp "$@"
