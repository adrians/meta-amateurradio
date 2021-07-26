LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c61b8950dc1aab4d2aa7c2ae6b1cfb3"

SRC_URI = "git://github.com/kiwix/libkiwix.git;protocol=https;branch=master \
          "

SRCREV = "e22e073d43be5b417bda775c0a31215bb6498c8a"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "icu pugixml mustache curl libmicrohttpd zlib libzim xapian-core"

