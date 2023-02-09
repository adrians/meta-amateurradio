LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "git://github.com/kiwix/kiwix-tools.git;protocol=https;branch=main \
          "

SRCREV = "756d5b4a04ca8afde0103b93c5f741890c04285c"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "libkiwix"
