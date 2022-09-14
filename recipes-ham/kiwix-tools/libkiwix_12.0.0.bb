LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c61b8950dc1aab4d2aa7c2ae6b1cfb3"

SRC_URI = "git://github.com/kiwix/libkiwix.git;protocol=https;branch=master \
           file://0001-remove-language-based-filtering.patch \
          "

SRCREV = "e65c9c41d857c9284753f90dc5be6e28e79207ff"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "icu pugixml mustache curl libmicrohttpd zlib libzim xapian-core"

