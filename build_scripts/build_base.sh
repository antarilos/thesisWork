#!/bin/bash

# WORKDIR points to the working directory, where is placed the Yocto toolchain directory, and where the build directory will be created.
WORKDIR='../..'
# CURRDIR points to the current directory, where are placed the necessary patch files.
CURRDIR=`pwd`

echo "WORKDIR = $WORKDIR"
echo "CURRDIR = $CURRDIR"

source $WORKDIR/poky-danny-8.0/oe-init-build-env $WORKDIR/build

echo "Patching the conf/local.conf file..."
patch -p0 < $CURRDIR/base_conf.patch

echo "Building the core-image-sato image..."
time bitbake core-image-sato
