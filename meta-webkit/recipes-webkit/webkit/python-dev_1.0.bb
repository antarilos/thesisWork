DESCRIPTION = "Python Dev"
LICENSE = ""

PR = "r0"

DEPENDS = "\
"

#SRC_URI = "git://git.gnome.org/gobject-introspection"
#SRCREV = "dc453895c2df0b6d26a08885d156b363ffa5b921"
SRC_URI = "http://python.org/ftp/python/2.7.3/Python-2.7.3.tgz"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/Python-2.7.3.tgz"

do_configure() {
	./configure --host arm
}

do_compile() {
	make
}

do_install() {
	make install
}

