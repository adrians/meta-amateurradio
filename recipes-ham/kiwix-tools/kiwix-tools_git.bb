LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "git://github.com/kiwix/kiwix-tools.git;protocol=git;branch=master \
          "

SRCREV = "43656554f1cfce7fe81aa8f7f3d8e4f755b26200"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "zlib libkiwix"
