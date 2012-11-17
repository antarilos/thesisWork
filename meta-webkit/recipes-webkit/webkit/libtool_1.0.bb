DESCRIPTION = "libtool"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

DEPENDS = "\
"

SRC_URI = "ftp://ftp.gnu.org/gnu/libtool/libtool-2.4.2.tar.gz"

#SRC_URI[md5sum] = ""
#SRC_URI[sha256sum] = ""
#SRC_URI[md5sum] = "b32b04148ecdd7344abc6fe8bd1bb021"
SRC_URI[md5sum] = "d2f3b7d4627e69e13514a40e72a24d50"
SRC_URI[sha256sum] = "b38de44862a987293cd3d8dfae1c409d514b6c4e794ebc93648febf9afc38918"

S = "${WORKDIR}/libtool-2.4.2"

do_configure() {
	./configure --host=${TARGET_SYS}
}

do_compile() {
	make
}

do_install() {
	install -d ${D}${bindir}/
	install -m 0755 ${S}/libtool ${D}${bindir}/
	install -m 0755 ${S}/libtoolize ${D}${bindir}/
}

