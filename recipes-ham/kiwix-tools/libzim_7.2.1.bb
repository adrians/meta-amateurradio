LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/openzim/libzim.git;protocol=https;branch=master \
          "

# The tag for 7.2.1 
SRCREV = "824647c2435bdb1f7fa25b2b6fd940e77ac499bc"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "icu zstd xapian-core util-linux xz"
