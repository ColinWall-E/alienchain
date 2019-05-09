#!/bin/sh

# change work directory
cd "$(dirname "$0")"

# default JVM options
jvm_options=`java -cp alienchain.jar org.alienchain.JvmOptions --cli`

# start kernel
java ${jvm_options} -cp alienchain.jar org.alienchain.Main --cli "$@"
