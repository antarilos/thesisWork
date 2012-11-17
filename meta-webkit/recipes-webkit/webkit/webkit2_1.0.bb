DESCRIPTION = "Webkit-Gtk 2 browser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://Source/WebKit/LICENSE;md5=4646f90082c40bcf298c285f8bab0b12"

PR = "r1"

#DEPENDS = "xextproto cairo nss gtk+-native zlib-native libav libxi libgnome-keyring libxss cups"

#DEPENDS = "\
#           autoconf \
#           automake \
#           autotools-dev \
#           bison \
#           flex \
#           gail-3.0 \
#           gawk \
#           gnome-common \
#           autopoint \
#           gperf \
#           gtk-doc-tools \
#           libenchant-dev \
#           libgail-dev \
#           libgail-3-dev \
#           libgeoclue-dev \
#           libgirepository1.0-dev \
#           libgtk-3-dev \
#           libgstreamer-plugins-base0.10-dev \
#           libicu-dev \
#           libgl1-mesa-glx \
#           libgl1-mesa-dev \
#           libjpeg62-dev \
#           libpango1.0-dev \
#           libpng12-dev \
#           libsqlite3-dev \
#           libtool \
#           libxslt-dev \
#           libxt-dev \
#           libxtst-dev \
#           \
#           gobject-introspection \
#           icon-naming-utils \
#           libgcrypt11-dev \
#           libgpg-error-dev \
#           libp11-kit-dev \
#           libtiff4-dev \
#"

DEPENDS = "\
           autoconf \
           automake \
           bison \
           flex \
           gawk \
           gnome-common \
           gperf \
           libtool \
           \
           python \
           \
           gail \
"

#SRC_URI = "http://commondatastorage.googleapis.com/chromium-browser-official/${P}.tar.bz2 \
#        file://include.gypi \
#        file://unistd.patch \
#"

#SRC_URI = "git://git.webkit.org/WebKit.git;protocol=git;branch=master"
SRC_URI = "git://git.webkit.org/WebKit.git"
SRCREV = "3ff8da427d2db2c1646e64b5699b27cf2b2e5988"

# include.gypi exists only for armv6 and armv7a and there isn't something like COMPATIBLE_ARCH afaik
#COMPATIBLE_MACHINE_armv7a = "(.*)"

#DEFAULT_PREFERENCE = "-1"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git"

do_configure() {
	#./Tools/Scripts/update-webkitgtk-libs
	#./Tools/Scripts/build-webkit --gtk --host=${TARGET_SYS}
        #./autogen.sh
        ./configure --host arm
}

do_compile() {
        #make
}

do_install() {
        make install
}

