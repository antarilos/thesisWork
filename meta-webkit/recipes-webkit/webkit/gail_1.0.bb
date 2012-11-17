DESCRIPTION = "Gail"
LICENSE = ""
LIC_FILES_CHKSUM = "file://COPYING;md5=3bf50002aefd002f49e7bb854063f7e7"

PR = "r0"
S = "${WORKDIR}/git"

DEPENDS = "\
           libtool \
"

SRC_URI = "git://git.gnome.org/gail"
SRCREV = "375c37a451ef317f0617803f796385a21aea3723"

#SRC_URI[md5sum] = ""
#SRC_URI[sha256sum] = ""

do_configure() {
	./autogen.sh --host=${TARGET_SYS}
}

do_compile() {
	make
}

do_install() {
	make install
}

