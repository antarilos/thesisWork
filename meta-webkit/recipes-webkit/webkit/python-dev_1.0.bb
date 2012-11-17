DESCRIPTION = "Python Dev"
LICENSE = ""
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed3abfd1059e2d3a36a8cff3986f9bb6"

PR = "r0"

DEPENDS = "\
"

SRC_URI = "http://python.org/ftp/python/2.7.3/Python-2.7.3.tgz"

#SRC_URI[md5sum] = ""
#SRC_URI[sha256sum] = ""

S = "${WORKDIR}/Python-2.7.3.tgz"

do_configure() {
	./configure --host=${TARGET_SYS}
}

do_compile() {
	make
}

do_install() {
	make install
}

