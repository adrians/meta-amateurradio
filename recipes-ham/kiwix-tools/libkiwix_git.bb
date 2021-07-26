LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c61b8950dc1aab4d2aa7c2ae6b1cfb3"

SRC_URI = "git://github.com/kiwix/libkiwix.git;protocol=git;branch=master \
          "

SRCREV = "03a929e88e119a4840d5c66ecd9e4cd13302a375"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "icu pugixml mustache curl libmicrohttpd zlib libzim xapian-core"

