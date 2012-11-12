DESCRIPTION = "gobject-introspection"
LICENSE = "LGPLv2 GPLv2"

PR = "r1"

DEPENDS = "\
           autoconf \
           automake \
           gnome-common \
           nativesdk-python \
           python-pygobject \
"

#SRC_URI = "git://git.gnome.org/gobject-introspection"
#SRCREV = "dc453895c2df0b6d26a08885d156b363ffa5b921"
SRC_URI = "http://ftp.gnome.org/pub/GNOME/sources/gobject-introspection/1.31/gobject-introspection-1.31.22.tar.xz"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/gobject-introspection-1.31.22"

do_configure() {
	./configure --host arm
}

do_compile() {
	make
}

do_install() {
	make install
}

