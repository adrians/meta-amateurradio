LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "git://github.com/kiwix/kiwix-tools.git;protocol=https;branch=master \
          "

SRCREV = "6dfdcea5ce2e1ca5e58517f7c59e8ba4cd7b85f4"

S = "${WORKDIR}/git"

inherit meson pkgconfig
DEPENDS = "libkiwix"
