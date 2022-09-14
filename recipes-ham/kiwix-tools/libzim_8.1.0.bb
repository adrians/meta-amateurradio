LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/openzim/libzim.git;protocol=https;branch=main \
          "

# The tag for 8.1.0
SRCREV = "9bc584edd178492f2bc8dc2a43889319980e6564"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "icu zstd xapian-core util-linux xz"
