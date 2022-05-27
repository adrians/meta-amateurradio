LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/openzim/libzim.git;protocol=https;branch=master \
          "

# The tag for 7.2.2
SRCREV = "c010ab776110baf6bb2139f9f77f2c351a84a06f"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "icu zstd xapian-core util-linux xz"
