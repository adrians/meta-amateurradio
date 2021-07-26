LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/openzim/libzim.git;protocol=git;branch=master \
          "

SRCREV = "20c0e3019c97f367acb0ba3c86f9dcd04ca44e77"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "icu zstd xapian-core util-linux xz"

